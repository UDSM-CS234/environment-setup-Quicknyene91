import java.io.*;
import java.lang.*;
public class Lab01 {
    public static void main(String[] args){
        double a = -9.81;
        double v = 0.0;
        double t = 10.0;
        double x = 0.0;
        double l = ((0.5*(a*t*t))+(v*t)+x);
        System.out.println( String.format("%.1f", l));

    }
}
