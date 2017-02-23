/* -------------------------------------------------------------------------
 *
 *	$1 Java
 *
 * 	This is a Java port of the $1 Gesture Recognizer by
 *	Jacob O. Wobbrock, Andrew D. Wilson, Yang Li.
 * 
 *	"The $1 Unistroke Recognizer is a 2-D single-stroke recognizer designed for 
 *	rapid prototyping of gesture-based user interfaces."
 *	 
 *	http://depts.washington.edu/aimgroup/proj/dollar/
 *
 *	Copyright (C) 2009, Alex Olwal, www.olwal.com
 *
 *	$1 Java free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *
 *	$1 Java is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *
 *	You should have received a copy of the GNU General Public License
 *	along with $1 Java.  If not, see <http://www.gnu.org/licenses/>.
 *
 *  -------------------------------------------------------------------------
 */

package com.octopocus.octopocus;

public class TemplateData
{
	public static int athens[] = {168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,168,235,167,235,167,236,167,236,167,237,167,237,167,238,167,239,167,239,167,240,167,241,167,241,167,242,167,243,167,243,167,244,167,245,167,245,167,246,167,246,167,247,167,248,167,249,167,250,167,251,167,252,168,253,169,254,169,255,170,256,170,257,171,259,172,261,172,263,173,265,174,267,175,269,176,271,177,273,178,274,179,276,180,278,182,281,183,283,184,286,186,288,187,291,188,294,190,296,191,298,193,300,195,302,198,304,199,306,201,308,204,311,207,314,209,316,212,319,216,321,220,323,224,325,228,326,231,327,236,329,240,330,244,331,248,332,251,332,254,332,258,332,262,332,266,332,269,331,273,330,277,329,280,328,284,326,288,323,292,320,295,315,298,309,300,302,301,295,302,290,301,286,301,283,299,281,298,279,295,278,291,276,286,274,281,274,276,274,271,274,267,275,263,275,260,276,257,277,255,278,253,280,250,284,247,289,244,295,241,301,239,307,237,314,236,321,235,326,235,333,235,339,235,346,235,353,236,361,237,368,238,375,240,382,242,389,245,395,247,401,249,405,250,408,251,410};
	public static int berlin[] = {163,243,163,243,163,243,163,243,163,243,163,243,163,243,163,243,163,243,163,243,163,243,163,243,163,243,163,243,163,243,163,243,163,243,163,244,165,244,167,245,169,246,171,246,173,246,176,246,178,246,180,246,182,246,185,246,187,246,190,246,193,246,196,246,198,246,201,246,203,246,204,246,206,246,207,246,209,246,211,246,214,246,216,246,219,246,221,246,223,246,225,246,226,246,227,246,229,245,230,245,231,245,232,245,232,245,233,244,233,244,233,244,233,243,233,243,233,243,233,242,233,241,233,241,233,240,233,239,232,239,232,238,231,237,231,237,230,236,230,235,230,235,229,234,229,233,229,233,229,232,229,231,228,230,228,229,228,228,228,226,228,224,228,223,228,221,228,219,229,218,230,217,230,215,231,214,232,213,233,211,235,210,237,208,239,207,241,206,243,204,245,203,246,202,248,202,249,201,250,201,251,200,253,199,254,199,255,199,257,199,258,199,259,199,261,199,262,199,264,199,265,200,266,201,268,201,269,202,269,203,270,203,271,204,271,205,272,205,272,206,273,206,274,207,274,208,275,208,276,209,276,210,277,211,278,212,278,213,279,215,280,216,280,218,281,220,281,222,281,224,281,226,281,227,281,228,281,230,280,231,280,232,279,233,278,234,278,236,277,237,277,238,276,239,276,240,276,240,276,241,276,242,276,242,276,242,276,242,276,242,276,242,276,242,276,242,277,242,279,242,282,243,286,244,290,244,293,245,296,246,300,246,304,247,307,247,311,248,313,248,316,248,318,248,319,248,320,249,322,249,323,249,324,249,326,249,326,249,327,249,327,249,328,249,330,249,331,249,333,249};
	public static int brussels[] = {159,259,159,259,159,259,159,259,159,259,159,259,159,259,159,259,159,258,159,257,159,255,159,254,159,253,159,251,159,250,159,249,159,247,159,245,159,243,159,241,159,238,159,236,159,233,160,231,161,228,161,225,162,222,164,219,165,217,166,215,168,213,170,211,172,210,174,209,176,207,177,206,178,205,180,205,181,204,181,203,182,203,183,203,185,203,186,203,187,203,189,203,190,204,192,204,193,205,194,205,196,206,197,207,198,207,200,209,201,210,202,212,204,213,205,216,206,219,206,221,207,224,208,227,208,230,209,233,210,236,210,240,211,245,212,249,212,253,212,259,212,266,212,274,212,283,212,292,211,300,210,308,210,314,210,319,210,323,210,327,210,330,210,332,210,334,210,335,210,335,210,336,210,336,210,337,210,338,210,339,210,341,210,342,210,344,210,347,211,350,211,354,212,357,212,360,212,361,212,361};
	public static int dublin[] = {217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,217,278,216,278,215,278,215,278,214,278,213,278,213,278,212,278,211,278,211,278,211,278,211,278,210,278,211,278,210,278,210,278,210,278,210,278,209,278,209,278,208,278,208,278,207,278,207,278,207,278,206,278,206,278,205,278,204,278,204,278,203,278,202,278,202,278,201,278,200,278,200,278,199,278,199,278,197,278,196,278,195,278,193,278,192,278,191,278,189,278,188,278,187,278,185,278,184,278,183,278,181,278,179,278,177,278,175,278,173,278,171,278,169,278,167,278,165,278,163,278,161,278,159,278,156,278,154,279,153,279,151,279,149,279,147,279,146,279,145,279,144,279,142,279,142,279,141,280,140,280,140,280,139,280,138,280,138,280,137,280,137,280,136,280,135,280,135,280,134,280,133,280,133,280,132,280,132,280,131,280,131,280,130,280,129,279,129,279,128,278,127,277,127,277,126,276,125,275,125,274,124,272,123,271,122,269,121,267,119,265,118,264,117,262,116,260,114,258,113,256,112,254,111,251,109,249,108,246,107,243,105,242,104,240,103,239,103,237,102,236,102,236,101,235,100,235,100,234,99,233,98,233,98,233,97,233,96,233,96,233,95,233,94,234,94,235,93,237,92,239,91,242,89,244,87,247,85,250,82,252,79,255,77,257,74,260,72,264,69,267,67,270,65,272,63,274,61,276,60,277,58,278,57,279,56,280,55,280,54,281,54,281};
	public static int london[] = {166,178,166,178,166,178,166,178,166,178,166,178,166,178,166,178,166,178,166,178,166,178,166,178,166,178,166,178,166,178,166,178,166,178,166,178,166,178,165,179,164,179,164,180,164,180,164,181,164,182,164,183,164,184,163,185,163,187,163,189,163,192,163,195,163,198,163,202,162,204,162,207,162,210,162,212,162,215,162,217,162,220,161,223,161,225,161,228,161,230,161,232,161,234,161,236,160,238,160,240,160,242,160,244,160,246,160,246,160,247,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,160,248,161,247,162,247,162,247,164,246,165,246,167,246,169,245,171,245,173,244,175,244,177,244,179,243,180,243,182,242,184,242,186,241,188,241,191,241,193,241,195,241,197,241,199,240,200,240,202,240,203,240,204,240,204,240,205,240,206,240,206,240,207,240,208,240,208,240,208,240,208,240,208,240,208,240,208,240,208,240,208,240,208,240,208,240,208,240,209,241,210,243,210,246,211,249,212,253,212,259,213,265,214,272,215,280,215,289,216,298,216,305,216,312,216,318,215,322,215,325,215,329,215,333,215,336,215,339,215,342,215,343,215,345,215,346,215,347,215,347,215,348,215,349,215,349};
	public static int miami[] = {187,204,187,204,187,204,187,204,187,204,187,204,185,204,184,204,182,204,181,205,179,205,177,206,174,206,172,207,170,207,168,208,166,208,164,209,162,209,159,210,157,210,155,211,153,211,151,212,149,212,147,213,146,213,145,214,143,215,142,215,141,216,140,216,138,216,137,216,136,217,136,217,135,217,134,218,134,218,133,218,132,219,132,219,131,219,131,219,130,219,129,220,129,220,128,221,127,221,127,221,126,221,125,222,125,222,124,223,123,223,123,223,122,223,121,223,122,223,122,223,122,223,122,223,122,224,122,224,122,225,122,225,122,226,122,227,122,228,122,229,122,230,122,231,122,233,122,235,122,237,121,240,121,243,121,246,121,248,120,251,120,253,120,255,119,257,119,260,119,262,119,264,119,267,118,269,118,271,118,274,118,276,118,278,118,280,118,283,118,285,118,287,118,289,117,291,117,293,117,294,117,295,117,296,117,298,117,299,117,300,117,302,117,302,117,303,117,304,117,304,117,305,117,305,117,305,117,305,117,305,117,305,117,305,117,305,118,306,119,307,121,308,123,309,125,311,127,313,129,314,131,316,133,317,135,319,137,321,139,323,142,326,145,328,147,331,150,333,153,336,156,339,158,341,160,342,162,344,164,346,165,347,166,348,167,348,168,349,168,350,169,350,169,350,169,350,169,350};
	public static int moscow[] = {220,236,220,236,220,236,220,236,220,236,220,236,220,236,220,236,220,236,220,236,218,236,218,236,217,237,216,238,214,238,213,239,212,241,211,242,209,244,208,246,207,248,205,250,203,252,201,254,199,255,198,257,196,259,194,261,192,263,190,264,189,266,188,268,186,270,185,272,183,273,181,274,179,276,177,277,175,278,173,279,171,281,169,282,167,283,165,285,163,286,160,288,158,290,155,291,152,293,150,294,147,295,146,296,144,297,142,297,140,298,138,299,136,299,134,300,132,301,130,301,128,301,127,301,125,301,124,301,123,301,121,301,120,301,119,301,117,301,116,301,115,301,114,301,113,301,112,301,111,301,109,301,108,301,107,301,106,301,105,301,104,301,102,301,101,301,100,301,99,301,99,301,98,300,97,300,96,299,96,299,95,298,94,297,93,297,92,296,91,295,90,294,89,293,88,292,87,290,86,289,85,288,85,287,84,285,83,284,83,283,83,281,83,279,84,276,85,274,86,271,88,268,89,266,91,264,93,262,96,260,101,258,106,257,110,255,115,255,120,255,126,255,130,255,134,256,138,256,142,258,147,259,151,261,155,263,159,267,163,270,168,273,172,276,176,279,180,282,184,286,189,289,194,293,199,296,202,298,205,300,207,301,209,301,210,302,211,302,211,302,211,302,212,302,212,302,213,302,213,302,214,303,215,303,215,303,216,303,217,304,217,304,219,305,220,306,221,306,221,306,222,306,223,306,223,306,223,306,223,306,223,306};
	public static int oslo[] = {191,258,191,258,191,258,191,258,191,258,191,258,191,258,191,258,190,258,189,258,188,258,186,258,185,258,182,259,179,259,175,259,172,259,169,259,166,259,163,259,159,259,156,259,152,259,149,259,145,259,142,259,139,259,136,259,132,259,129,259,126,259,124,259,122,259,120,259,118,259,116,259,114,259,112,259,110,259,108,259,107,259,105,259,104,259,103,259,102,259,102,259,101,259,101,259,100,259,99,259,99,259,98,259,98,259,98,259,98,259,98,259,98,259,98,259,98,259,98,259,98,259,98,259,98,259,98,259,98,258,98,257,98,257,98,256,98,255,98,255,98,253,98,252,98,250,98,248,98,247,98,245,98,244,98,242,98,241,98,239,98,237,98,235,98,233,98,231,98,229,98,226,98,224,98,222,98,220,98,218,98,216,99,215,99,214,99,212,99,211,99,210,99,209,99,207,99,206,99,205,99,204,99,204,99,203,99,202,99,202,99,201,99,200,99,200,99,200,100,200,100,200,101,200,102,201,104,201,106,201,108,201,110,201,112,201,114,201,116,201,119,201,121,201,124,201,126,201,129,201,131,201,133,201,134,201,135,201,137,201,138,201,139,201,141,201,142,201,143,201,145,201,145,201,146,201,146,201,147,201,148,201,148,201,148,201,148,202,148,202,148,203,148,204,148,205,148,207,148,208,148,210,148,213,148,216,148,219,148,222,148,225,148,229,148,232,148,236,147,239,147,244,147,248,147,251,147,255,146,258,146,262,146,266,145,269,145,273,145,276,145,279,144,282,144,286,144,289,144,292,144,294,144,297,144,299,144,301,143,302,143,303,143,304,143,305,143,306,143,307,143,308,143,309,143,309,143,310,143,311,142,312,142,313,142,313,142,314,142,315,142,315,142,316,142,316,142,317,142,318,142,318,142,319,142,320,142,320,142,321,142,322,142,322,142,323,142,323,142,324,142,325,142,325,142,326,142,327,141,327,142,328,142,329,141,329,141,330,141,331,141,332,141,334,141,335,141,336,141,337,141,337,141,338,141,339,141,340,141,341,141,341,141,342,141,343,141,343,141,343};
	public static int paris[] = {179,298,179,298,179,298,179,298,179,298,179,298,179,298,179,298,179,298,179,298,179,298,179,298,179,298,179,298,179,298,179,298,179,298,179,298,179,298,179,297,178,296,177,294,177,291,177,288,177,285,177,283,177,279,177,276,177,271,177,267,177,263,177,259,177,254,177,249,177,245,177,240,177,236,177,232,177,227,177,223,177,219,177,216,177,213,177,211,177,208,177,205,177,201,177,198,177,196,177,193,177,192,177,189,177,187,177,184,177,181,177,178,177,176,177,173,177,171,177,170,177,168,177,166,177,165,177,163,177,162,177,160,177,159,177,158,177,156,177,156,177,155,177,155,177,154,177,153,177,153,177,152,176,152,176,152,175,152,173,152,171,152,168,153,165,154,162,155,158,156,154,157,151,158,148,159,145,159,143,160,141,160,139,160,138,160,135,161,133,161,131,161,129,161,127,161,126,161,125,161,124,161,123,161,122,161,122,161,121,161,121,161,121,161,121,161,121,162,121,164,121,168,122,173,123,178,123,182,124,187,125,191,126,195,127,200,128,204,128,207,129,209,130,211,130,213,130,214,130,215,130,215,130,216,130,216};
	public static int rio[] = {179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,179,276,178,274,178,273,177,271,176,269,176,267,175,264,174,261,174,259,174,255,174,252,174,248,174,244,174,241,174,238,174,236,174,233,175,230,175,226,176,223,176,221,176,218,177,215,178,212,178,209,179,206,180,202,180,199,181,196,182,192,182,189,183,186,184,182,185,178,186,175,187,171,189,168,192,164,194,160,197,156,200,153,202,150,205,147,208,143,211,140,215,137,219,134,222,132,224,130,226,129,228,127,230,127,232,126,234,126,236,126,238,126,240,126,241,127,243,128,245,130,246,132,247,135,248,137,249,140,250,143,251,146,252,149,252,152,252,155,252,157,252,159,252,161,252,162,252,163,252,164,252,165,252,165};
	public static int rome[] = {140,270,140,270,140,270,140,270,140,270,140,270,140,270,140,270,140,270,140,270,140,270,140,270,140,270,140,270,140,270,140,269,141,269,142,268,143,266,145,265,147,264,148,262,150,261,151,261,152,260,154,259,155,258,156,257,157,256,158,255,159,254,160,252,162,251,163,250,164,248,165,247,166,246,168,245,170,243,172,242,173,241,175,239,176,238,178,237,179,236,180,236,181,235,182,234,183,233,184,231,185,230,187,229,188,227,189,226,191,225,193,223,194,222,196,221,197,220,199,218,200,217,201,216,203,214,204,213,205,212,207,210,208,209,209,208,211,207,213,205,215,204,217,203,219,201,220,200,221,199,223,197,224,196,224,195,225,195,226,194,226,193,227,193,228,192,228,191,229,191,230,190,230,189,230,189,230,189,230,189,230,189,230,189,230,188,230,188,230,188,230,187,230,187,230,186,230,186,230,185,229,184,229,184,228,183,227,182,227,182,226,181,226,181,225,180,224,179,224,178,223,176,223,175,222,174,222,172,222,171,222,170,222,169,222,168,222,167,222,165,222,164,222,163,223,161,224,160,224,159,225,157,226,156,226,155,228,154,229,152,231,150,233,149,235,148,237,146,239,145,241,145,243,144,245,143,246,143,248,143,249,143,250,143,252,143,254,143,256,143,258,143,260,144,262,144,263,145,264,145,266,146,267,147,268,147,269,148,270,149,271,150,272,151,273,153,274,155,275,156,276,158,277,159,278,161,278,163,279,164,280,166,280,168,281,170,282,172,282,174,283,176,283,178,283,179,283,181,283,182,283,184,282,185,281,187,281,189,280,190,279,192,279,193,278,194,277,196,277,197,276,197,275,198,274,199,273,199,272,200,271,200,269,201,268,201,267,201,265,201,264,201,263,201,262,201,262,201,261,200,260,199};
	public static int sofia[] = {170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,227,170,228,170,229,171,229,173,230,174,231,176,232,178,233,179,234,180,235,182,236,183,237,184,239,186,240,188,241,190,243,192,245,194,247,196,249,197,250,198,251,200,253,202,255,203,257,205,259,207,262,209,264,210,266,211,268,213,270,214,272,216,274,217,275,218,276,219,277,220,278,222,280,223,281,224,283,225,285,226,287,227,289,228,292,228,294,229,298,229,301,229,304,229,307,228,311,228,313,227,316,225,318,223,320,221,321,218,323,214,325,210,326,205,328,200,329,195,329,191,330,187,330,183,329,180,328,177,327,174,325,172,323,171,321,170,317,170,313,171,310,175,305,179,299,185,294,193,287,201,282,210,277,219,271,228,266,235,262,242,259,247,256,251,253,255,251,258,249,261,247,264,246,266,245,267,244,268,243};
	public static int sydney[] = {177,290,177,290,177,290,177,290,177,290,177,290,177,290,177,290,176,290,175,289,175,289,174,289,173,289,173,289,172,289,171,289,171,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,170,289,169,289,169,289,168,289,167,288,167,288,166,288,165,288,165,287,164,287,164,287,163,286,162,286,162,285,161,284,159,284,157,283,154,282,152,282,149,281,147,279,144,278,141,277,139,275,136,274,132,272,129,271,126,270,123,269,120,267,118,266,114,265,111,263,108,262,105,261,103,259,100,258,97,257,94,255,91,253,88,251,85,249,82,247,80,245,78,243,76,242,75,240,74,239,72,238,71,237,71,237,70,236,70,236,69,235,69,234,69,234,69,233,69,233,70,233,72,233,74,233,77,233,81,232,85,232,89,232,92,232,95,232,98,232,101,232,104,232,107,232,110,232,112,232,115,232,118,232,121,232,125,233,129,233,133,233,136,233,138,233,140,233,141,233,142,233,144,233,145,233,146,233,148,233,149,233,150,233,150,233,151,233,151,233,152,233,153,233,153,233,154,233,155,233,155,233,156,233,156,233,156,233,156,233,156,233,157,233,157,233,157,233,157,233,157,233,158,233,158,233,158,233,158,233,158,233,158,233,158,233,159,233,159,233,159,233,159,233,160,233,160,233,160,233,161,233,161,233,161,233,162,233,162,233,162,233,162,233,162,233,162,233,162,233,162,232,162,232,162,231,162,230,162,228,163,224,163,217,163,208,162,198,162,190,162,183,161,177,161,173,160,170,159,168,159,167,158,166,158,165,158,164,158,164,158,163,158,162,158,162};
	public static int tokyo[] = {123,238,123,238,123,238,123,238,123,238,123,238,123,238,123,238,123,238,122,238,122,239,122,240,122,242,122,245,122,247,123,250,124,252,124,255,125,257,127,260,128,264,129,268,131,271,132,274,132,277,133,279,134,281,134,283,135,284,135,286,136,288,137,290,137,293,138,295,139,297,139,299,140,301,141,303,142,305,143,308,144,311,146,314,146,316,147,317,147,318,147,318,147,318,147,318,147,317,147,317,148,315,148,314,149,312,151,309,152,306,153,302,154,297,156,292,157,288,158,284,159,280,160,276,161,271,163,267,164,263,165,260,166,256,167,253,168,250,169,247,170,244,170,242,171,241,171,240,171,239,171,239,172,238,172,237,172,237,172,237,172,237,173,237,173,237,174,237,174,237,175,237,176,237,177,237,179,238,180,238,182,239,184,239,187,240,191,240,194,240,198,241,200,241,203,242,206,243,210,243,214,244,219,245,223,245,226,245,229,245,232,245,236,246,239,247,243,247,245,247,248,248,250,248,254,249,257,250,260,250,263,251,266,251,268,252,270,252,271,252,273,252,273,252};
	public static int toronto[] = {155,316,155,316,155,316,155,316,155,316,155,316,155,316,155,316,155,316,155,316,155,316,155,316,155,316,155,316,155,316,155,316,155,316,155,316,155,316,155,316,155,316,155,315,154,314,153,313,153,311,152,309,151,307,151,304,151,301,151,297,151,292,153,286,155,279,157,271,159,265,160,258,162,251,164,244,166,237,169,229,171,222,173,216,176,209,178,203,180,197,182,192,184,187,185,183,187,179,188,175,190,171,191,168,193,164,195,161,196,158,197,155,198,153,198,151,199,150,199,149,199,148,199,147,199,146,200,146,200,145,201,144,201,144,202,143,202,142,202,142,202,141,202,141,203,140,203,139,203,139,203,138,203,138,203,138,203,138,203,138,203,139,204,140,204,140,205,141,205,143,206,145,207,148,207,152,208,156,209,159,209,162,210,165,211,169,212,173,213,177,214,181,214,183,215,186,216,189,216,192,217,196,218,200,218,203,219,205,219,207,219,208,219,208,219,209,219,210,219,210,219,210,219,211,219,211,219,211,220,211,220,211,221,210,222,209,224,207,227,201,232,190,239,178,246,165,252,153,257,143,262,135,266,128,270,123,272,119,273,118,273,116,273,116};
	public static int vienna[] = {187,194,187,194,187,194,187,194,187,194,187,194,187,194,187,194,187,194,187,194,187,194,187,194,187,194,187,194,186,194,185,195,185,196,185,197,184,199,184,201,184,203,183,205,183,207,183,209,182,211,183,213,182,216,182,218,182,221,182,224,181,227,181,229,180,231,180,233,180,235,179,237,179,240,179,242,179,245,179,247,178,249,178,251,178,252,177,253,177,253,177,254,177,254,177,255,176,256,176,256,176,257,176,258,176,258,176,259,176,259,175,260,175,260,175,261,175,261,175,262,175,263,175,263,175,264,175,264,175,265,175,265,175,266,175,266,174,267,174,268,174,268,174,269,174,270,174,270,173,271,173,272,173,272,172,273,172,274,171,274,171,275,170,276,170,277,169,279,168,280,168,282,167,284,167,285,166,287,165,289,164,291,162,293,161,294,160,296,158,297,157,297,155,298,153,299,152,299,150,300,148,301,147,301,146,302,144,302,143,302,142,302,140,302,140,301,139,300,138,300,138,299,137,298,136,296,135,293,134,290,134,287,134,284,135,282,135,279,136,277,138,274,139,272,142,270,145,268,148,267,151,266,153,267,156,267,158,267,160,268,162,269,164,270,166,271,168,273,170,274,172,276,174,278,176,282,178,287,179,292,181,297,182,303,183,309,183,315,183,320,183,325,183,329,183,335,183,340,183,344,183,348,183,352,183,356,183,359,183,362,183,365,183,368,183,371,183,373,183,376,183,378,183,380,183,382,183,383,183,384,183,385,183,385,183,386,183,386,183,387,183,388,183,388,183,389,183,389};

}