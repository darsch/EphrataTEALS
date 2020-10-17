package studentWork.Chapter3;

public class Equestria {

    public static void main(String[] args) {
        
        //Exercise 1
        double diameter = 2.0;
        double circumference = 0;
        circumference = roadTrip(diameter);
        System.out.println("Returned Circumference: " + circumference);

        //Exercise 2
        double x1 = 1.0;
        double y1 = 2.0;
        double x2 = 3.0;
        double y2 = 4.0;
        double distance = 0.0;
        distance = distance(x1,y1,x2,y2);
        System.out.println("Returned Distance: " + distance);

        //Exercise 3-stops

        double stop0x = 0;
        double stop0y = 0;
        double stop1x = 1;
        double stop1y = 0;
        double stop2x = 2;
        double stop2y = 0;
        double stop3x = 3;
        double stop3y = 0;
        double threeStops = 0;
        threeStops = distance(stop0x,stop0y,stop1x,stop1y) + distance(stop1x,stop1y,stop2x,stop2y) + distance(stop2x,stop2y,stop3x,stop3y);
        System.out.println("Returned threeStop Tour: " + threeStops);
    }

    public static double roadTrip(double diameter) {
        double circumference = diameter * Math.PI;
        System.out.println("In roadTrip method Circumference: " + circumference);
        return circumference;

    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        return distance;
    }






}