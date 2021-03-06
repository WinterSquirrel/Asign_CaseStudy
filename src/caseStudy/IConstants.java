package caseStudy;

import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

public interface IConstants {
    //FRAME
    public static final double DIM_X=600;

    public static final double DIM_Y=600;
    public static final double DIM_Y_HALF=DIM_Y/2-1;
    
    public static final int HALF=2;
    //button constants
    public static final String MED_PLAY= "PLAY";
    public static final String MED_RESET="RESET";
    public static final String MED_DONE= "DONE";
    public static final String MED_HELP= "HELP";
    
    
    public static final String AN_CALC="Cal";
    public static final String AN_CALC1="SERIES";
    public static final String AN_CALC2="BIKE PROFIT";
    public static final String AN_WAVES="Waves";
    public static final String AN_EM1="LENZ LAW";
    public static final String AN_EM2="RESISTOR IN ||";
    public static final String AN_EM="E&M";
    public static final String AN_WAVES1="SPRING";
    public static final String AN_WAVES2="PENDULUM";
    
    public static final String DEFAULT_HELP="No help availlable";
    public static final String HELP_STR="Help";
    public static final String EXIT_STR="Exit";
    public static final String FILE_STR="File"; 
    //ADD YOUR STUFF HERE, try to keep dome fomatting
    public static final int ZERO=0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int TIME_MILLIS_CONVERSION=1000;
    public static String DECIMALFORMAT_2DEC="##.00";
    public static String DECIMALFORMAT_2DEC$="##.00$";
    
    //Pendulum
    public static final double GRAVACC = 9.80665;
    public static final int FIELDS2_X_DISPLACEMENT = 120;
    public static final int IMAGE2_X_DISPLACEMENT = 450;
    public static final int IMAGE2_Y_DISPLACEMENT = -150;
    
    //SPRING
    public static final double PI = Math.PI;
    public static final Font FONT_ARIAL_20=new Font("Arial",20);
    public static final int TEXTFIELD_AMT = 3;
    public static final double PERCENT_STRETCH_CORRECTION = 0.2;
    public static final double STRETCH_DAMPER = 0.6;
    public static final int FRAMERATE_MILLIS = 33;
    public static final int DEFAULT_SPRING = 1;
    public static final int LABEL_SPACING = 40;
    public static final int FIELDS_X_DISPLACEMENT = 100;
    public static final int IMAGEVIEW_HEIGHT = 100;
    public static final int IMAGE_X_DISPLACEMENT = 300;
    public static final double MASS_SCALE_FACTOR = 0.7;

    //series
    public static final int SERIES_MAXITERATIONS=100;
    public static final int SERIES_OPACITY_IN=0;
    public static final int SERIES_OPACITY_FN=1;
    public static final int SERIES_TIME_SUM_EX=500;
    public static final int SERIES_VALUECIRCLE_RMIN=20;
    public static final double SERIES_A_DEF=1;
    public static final double SERIES_R_DEF=2;
    public static final double SERIES_INFINITY_IN=-1;
    public static final double SERIES_SUM_RADIUS_IN=50;
    public static final double SERIES_SUM_X=500;
    public static final double SERIES_SUM_Y=100;
    public static final double SERIES_VALUE_LABEL_X=480;
    public static final double SERIES_VALUE_LABEL_Y=90;
    public static final double SERIES_SCALE_DEF=5;
    public static final double SERIES_VALUE_Y=100;
    public static final double SERIES_VALUET_Y=90;
    public static final double SERIES_VALUET_TY=-10;
    public static final double SERIES_VALUERT_Y=30;
    public static final double SERIES_VALUERT_X=50;
    public static final double SERIES_VALUEAT_X=50;
    public static final double SERIES_VALUECIRCLE_XI=200;
    public static final double SERIES_VALUECIRCLE_XF=500;
    public static final double SERIES_MAX_SUM_R=500;
    public static final double SERIES_INFINITE_RANGE[]={-1,1};
    
    public static final String SERIES_VALUET_COLOR="white";
    public static final String SERIES_LABEL_STYLE="circleLabel";
    public static final String SERIES_LABEL_FORMULA_T="Geometric series: AR^n";
    public static final String SERIES_LABEL_A_T="  set A ";
    public static final String SERIES_LABEL_R_T="  set R ";
    public static final String SERIES_TEXT_INFINITE="infinity";
    
    //BIKE
    public static final double BIKE_STARTCOST_DEF=700000;
    public static final double BIKE_STARTCOST_X=100;
    public static final double BIKE_BIKECOST_DEF=110;
    public static final double BIKE_BIKECOST_x=100;
    public static final double BIKE_BIKECOST_y=30;
    public static final double BIKE_CONSTANT=200;
    public static final double BIKE_MAXBIKES=70000;
    public static final double BIKE_SCALE_Y=50000;
    public static final double BIKE_GRAPH_X=100;
    public static final double BIKE_GRAPH_Y=200;
    public static final double BIKE_LABEL_AXISY_Y=220;
    public static final double BIKE_LABEL_AXISX_Y=180;
    public static final double BIKE_LABEL_AXISX_XOFFSET=20;
    public static final double BIKE_LABEL_MAXPROFIT_Y=55;
    
    public static final int STARTPRICE_IN=-1;
    public static final String BIKE_LABEL_INITIALCOST_T="  Initial costs ";
    public static final String BIKE_LABEL_BIKECOST_T="  Cost per bike ";
    public static final String BIKE_TEXT_PRICE="Price: ";
   
   //style
    public static final String STYLE1_PATH="/res/style1.css";
    public static final Paint PAINT_BLACK=Paint.valueOf("black");
    public static final Paint PAINT_RED=Paint.valueOf("red");
    public static final String STYLE_PANE="pane";
    public static final String STYLE_MENUPANE="menuPane";
    public static final String STYLE_GRID="grid";
    public static final String TITLE_DEFAULT="Animaiton Home";
    public static final String STYLE_MEDIABTN="mediaBtn";
    public static final String STYLE_MENUBTN="menuBtn";
    public static final String STYLE_GRAPHAXIS="graphAxis";
    public static final String STYLE_GRAPHLINE="graphLine";
    public static final String STYLE_MENUACTIVEBTN="menuBtnActive";
    
}
