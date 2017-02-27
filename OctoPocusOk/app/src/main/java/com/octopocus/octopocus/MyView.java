package com.octopocus.octopocus;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// to do: - adapter les gestes a la taille de l'écran
//        - hide path menu for experts

public class MyView extends View {

    private Paint mFeedbackPaint;
    private Paint mNewPaint;

    private Path mFeedbackPath = new Path();
    private Path mFeedforwardPath = new Path();
    private Path mPrefixPath = new Path();
    private Path mNewPath = new Path();

    private Point mCurrentPos;
    private Point mInitPos;

    Map<String, Object> mObjects = new HashMap<>();
    TemplateData mObjectData = new TemplateData();

    private float mObjectScale = 3; // Scale of objects
    private int mMaxThickness = 10;
    private double mTime = 0;

    private boolean mOnClick = false;
    private boolean mDisplayNewPathText = false;
    private boolean mNoviceMode = false;
    private boolean mUnclearMode = true;
    private boolean mFirstTouch = true;
    private boolean mTouchUp = false;
    private boolean mMoving = false;
    private boolean mSaveNewPath = false;
    private boolean mTryAgain = false;
    private Object mSelectedObject = null;

    private List<Double> newPath = new ArrayList<>();
    private String mNewObjectName = "";

    private Dollar mDollar = new Dollar(1);
    private double gesteTime;


    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    private void initPaint() {
        mFeedbackPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mFeedbackPaint.setStyle(Paint.Style.STROKE);
        mFeedbackPaint.setStrokeWidth(10);
        mNewPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mNewPaint.setColor(Color.parseColor("#7A7A7A"));
        mNewPaint.setStyle(Paint.Style.STROKE);
        mNewPaint.setStrokeWidth(10);
        mNewPaint.setTextSize(40);
    }

    private void initMenu() {
        int width = (this.getWidth());
        int height = (this.getHeight());

        if (Math.sqrt((width * height)) < 10000) {
            mObjectScale = 3;
            mMaxThickness = 20;
        } else {
            mObjectScale = 6;
            mMaxThickness = 40;
        }

        mObjects.put("Athens", new Object("Athens", mObjectData.athens, "#408042", "#668067", mObjectScale, mMaxThickness));
        mObjects.put("Berlin", new Object("Berlin", mObjectData.berlin, "#AAB242", "#B1B37D", mObjectScale, mMaxThickness));
        mObjects.put("Brussels", new Object("Brussels", mObjectData.brussels, "#FBDD40", "#FBEA97", mObjectScale, mMaxThickness));
        mObjects.put("Dublin", new Object("Dublin", mObjectData.dublin, "#F4AC41", "#F6CE93", mObjectScale, mMaxThickness));
        mObjects.put("London", new Object("London", mObjectData.london, "#FF6B41", "#FFB09A", mObjectScale, mMaxThickness));
        mObjects.put("Miami", new Object("Miami", mObjectData.miami, "#CD88A8", "#CDAEBC", mObjectScale, mMaxThickness));
        mObjects.put("Moscow", new Object("Moscow", mObjectData.moscow, "#8C94F7", "#C7CAF8", mObjectScale, mMaxThickness));
        mObjects.put("Oslo", new Object("Oslo", mObjectData.oslo, "#6097A6", "#859FA6", mObjectScale, mMaxThickness));
        mObjects.put("Paris", new Object("Paris", mObjectData.paris, "#D1C041", "#D2C988", mObjectScale, mMaxThickness));
        mObjects.put("Rio", new Object("Rio", mObjectData.rio, "#759A42", "#8C9A7B", mObjectScale, mMaxThickness));
        mObjects.put("Rome", new Object("Rome", mObjectData.rome, "#FFB641", "#FFD99A", mObjectScale, mMaxThickness));
        mObjects.put("Sofia", new Object("Sofia", mObjectData.sofia, "#E38C4F", "#E4B594", mObjectScale, mMaxThickness));
        mObjects.put("Sydney", new Object("Sydney", mObjectData.sydney, "#E78473", "#E9B7AF", mObjectScale, mMaxThickness));
        mObjects.put("Tokyo", new Object("Tokyo", mObjectData.tokyo, "#AF8ED2", "#C2B2D2", mObjectScale, mMaxThickness));
        mObjects.put("Toronto", new Object("Toronto", mObjectData.toronto, "#468375", "#62837A", mObjectScale, mMaxThickness));
        mObjects.put("Vienna", new Object("Vienna", mObjectData.vienna, "#9579D2", "#B5A8D2", mObjectScale, mMaxThickness));
    }


    /*
        source:
        http://stackoverflow.com/questions/31901364/android-using-ontouchlistener-in-canvas
    */


    @Override
    public boolean onTouchEvent(@NonNull MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mTime = System.currentTimeMillis();
                mOnClick = true;
                if (mFirstTouch) {
                    initMenu();
                    mFirstTouch = false;
                }
                mSelectedObject = null;
                mDisplayNewPathText = false;
                mTouchUp = false;

                mInitPos = new Point(x, y);
                mCurrentPos = new Point(x, y);
                mNewPath = new Path();
                mNewPath.moveTo((int) mInitPos.X, (int) mInitPos.Y);
                invalidate();
                break;

            case MotionEvent.ACTION_MOVE:
                mCurrentPos = new Point(x, y);
                mMoving = true;
                invalidate();
                break;

            case MotionEvent.ACTION_UP:
                gesteTime = System.currentTimeMillis() - mTime;
                ((MainActivity) this.getContext()).executeCommand(gesteTime);
                if (mNoviceMode == false) {
                    mDollar.recognize();
                    ((MainActivity) this.getContext()).writeDollar(mDollar);
                    String execute_name = mDollar.result.Name;
                    for (String objectName : mObjects.keySet()) {
                        Object object = mObjects.get(objectName);
                        if (object.getName().equals(execute_name)) {
                            object.setExecute(true);
                        }
                    }

                }
                mUnclearMode = true;
                mOnClick = false;
                clear();

            case MotionEvent.ACTION_CANCEL:
                mCurrentPos = null;
                invalidate();
                break;
        }
        return true;
    }


    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);

        // decide if Novice or Expert Mode
        double time = System.currentTimeMillis();
        double t = time - mTime;
        if (mUnclearMode && mOnClick && mCurrentPos != null) {
            double p_x = mInitPos.X - mCurrentPos.X;
            double p_y = mInitPos.Y - mCurrentPos.Y;
            double distance = Math.sqrt(p_x * p_x + p_y * p_y);
            if (t > 300) {
                if (distance < 3){ // user was fast enough above threshold
                    mNoviceMode = true;
                    mUnclearMode = false;
                    invalidate();
                } else {
                    mNoviceMode = false;
                    mUnclearMode = false;
                    invalidate();
                }
            } else {
                if (distance > 6) {
                    mNoviceMode = false;
                    mUnclearMode = false;
                    //invalidate();
                }
                invalidate();
            }
        } else {
            if ((mDisplayNewPathText && mTouchUp) || (mTryAgain && mTouchUp)) {
                String text = "";
                if (mTryAgain) {
                    text = "Path to short. Try again: " + mNewObjectName;
                } else {
                    text = "Hold to draw Path for " + mNewObjectName;
                }
                int offset = (text.length() / 2);
                int width = (this.getWidth() / 2) - (offset * 20);
                int height = (this.getHeight() / 2) - offset;
                mNewPaint.setStrokeWidth(5);
                canvas.drawText(text, width, height, mNewPaint);
                mNewPaint.setTextSize(40);
            }

            // if path was selected display name
            if (mSelectedObject != null && mTouchUp) {
                // positioning the name of the selected path in the center of the display
                int offset = (mSelectedObject.getName().length() / 2);
                int width = (this.getWidth() / 2) - (offset * 20);
                int height = (this.getHeight() / 2) - offset;
                canvas.drawText(mSelectedObject.getName(), width, height, mSelectedObject.getTextPaint());

            } else {

                if (mCurrentPos != null) {

                    // save new Path
                    if (mSaveNewPath && mMoving) {
                        mMoving = false;
                        newPath.add(mCurrentPos.X); // getting the points for the new path
                        newPath.add(mCurrentPos.Y);
                    }

                    if (mNoviceMode) { // Novice Mode
                        for (String object : mObjects.keySet()) {
                            mObjects.get(object).setStartPosition(mInitPos, mCurrentPos); // current start position in object
                            mObjects.get(object).setError(mInitPos, mCurrentPos); // error to finger tip

                            if (mSaveNewPath) {
                                drawNewPath(canvas, mObjects.get(object));
                            } else {
                                drawObject(canvas, mObjects.get(object));
                            }
                        }

                    } else { // Expert Mode
                        if (mSaveNewPath) {
                            mDisplayNewPathText = true;
                        } else {
                            mDollar.addPoint((int) mCurrentPos.X, (int) mCurrentPos.Y);
                        }
                    }
                }
            }
        }

    }


    // mDrawObject options here
    private void drawNewPath(Canvas canvas, Object object) {
        mFeedforwardPath = new Path();

        mFeedforwardPath.moveTo((int) mInitPos.X, (int) mInitPos.Y);
        mNewPath.lineTo((int) mCurrentPos.X, (int) mCurrentPos.Y);

        int[] points = object.getPoints();
        for (int x = 0; x < points.length; x += 2) {

            float x_pos = points[x] * mObjectScale + (int) mInitPos.X - points[0] * mObjectScale; // objects points to local space
            float y_pos = points[x + 1] * mObjectScale + (int) mInitPos.Y - points[1] * mObjectScale; // objects points to local space
            mFeedforwardPath.lineTo(x_pos, y_pos);

            if (x == (points.length - 2) && !(object.getName().equals(mNewObjectName))) {
                mNewPaint.setStrokeWidth(4);
                canvas.drawText(object.getName(), x_pos, y_pos,  mNewPaint);
                mNewPaint.setStrokeWidth(mMaxThickness);
            }
        }

        canvas.drawPath(mFeedbackPath, mNewPaint);
        if ((object.getName().equals(mNewObjectName))) {
            mNewPaint.setColor(object.getPathPaint().getColor());
            canvas.drawPath(mNewPath, mNewPaint);
            mNewPaint.setColor(Color.parseColor("#7A7A7A"));
        } else {
            canvas.drawPath(mFeedforwardPath, mNewPaint);
        }
    }

    // draw object
    private void drawObject(Canvas canvas, Object object) {
        mFeedforwardPath = new Path();
        mPrefixPath = new Path();
        mFeedbackPath = new Path();

        mFeedbackPath.moveTo((int) mInitPos.X, (int) mInitPos.Y);

        int prefix_end_index = object.getNearestPointToCursor(mInitPos, mCurrentPos);

        int[] points = object.getPoints();
        for (int x = 0; x < points.length; x += 2) {
            float x_pos = points[x] * mObjectScale + (int) mInitPos.X - points[0] * mObjectScale; // objects points to local space
            float y_pos = points[x + 1] * mObjectScale + (int) mInitPos.Y - points[1] * mObjectScale; // objects points to local space

            if (x < object.getStartPos()) {
                mFeedbackPath.lineTo(x_pos, y_pos);

            } else if (x == object.getStartPos()) {
                mFeedbackPath.lineTo(x_pos, y_pos);
                mPrefixPath.moveTo(x_pos, y_pos);
                if (x >= points.length - 10) { // finger tip is near to the end of path
                    object.setExecute(true);
                    mSelectedObject = object;
                } else {
                    object.setExecute(false);
                }

            } else if (x < prefix_end_index) {
                mPrefixPath.lineTo(x_pos, y_pos);

            } else if (x == prefix_end_index) {
                mPrefixPath.lineTo(x_pos, y_pos);
                mFeedforwardPath.moveTo(x_pos, y_pos);
                canvas.drawText(object.getName(), x_pos, y_pos,  object.getTextPaint());

            } else {
                mFeedforwardPath.lineTo(x_pos, y_pos);
            }
        }

        mFeedbackPaint.setStrokeWidth(object.getThickness());
        canvas.drawPath(mFeedbackPath, mFeedbackPaint);

        if (object.getThickness() != 0) {
            canvas.drawPath(mFeedforwardPath, object.getPathPaint());
            canvas.drawPath(mPrefixPath, object.getPrefixPaint());
        }
    }


    private void clear() {

            for (String objectName : mObjects.keySet()) {
                Object object = mObjects.get(objectName);
                if (object.getExcecute()) { // excecute function of command
                    //((MainActivity) this.getContext()).executeCommand(object.getName());
                    if (object.getName().length() < 10) {
                        mSaveNewPath = false;
                    } else {
                        String substring = object.getName().substring(0, 10);
                        if (substring.equals("New Path: ")) {
                            mSaveNewPath = true;
                            mNewObjectName = object.getName().substring(10, object.getName().length());
                            break;
                        } else {
                            mSaveNewPath = false;
                        }
                    }
                    mSelectedObject = object;
                    invalidate();
                }
            }
        mDollar.clear();
        mTouchUp = true;
        newPath = new ArrayList<>();

        for (String object : mObjects.keySet()) {
            mObjects.get(object).clear();
        }
    }
}