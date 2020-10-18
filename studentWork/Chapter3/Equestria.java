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

        //Exercise 4 totalTrip
        double totalTrip = 0; 
        totalTrip = totalTrip(1,0,2,0,3,0,4,0);
        System.out.println("Returned totalTrip: " + totalTrip);
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

    public static double totalTrip(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double totalTrip = 0;
        double x0 = 0;
        double y0 = 0;
        totalTrip = distance(x0,y0,x1,y1) + distance(x1,y1,x2,y2) + distance(x2,y2,x3,y3) + distance(x3,y3,x4,y4) + distance(x4,y4,x0,y0);
        return totalTrip;

    }




}