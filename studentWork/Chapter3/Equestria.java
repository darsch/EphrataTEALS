package studentWork.Chapter3;

public class Equestria {

    public static void main(String[] args) {
        double diameter = 2.0;
        double circumference = 0;
        circumference = roadTrip(diameter);
        System.out.println("Returned Circumference: " + circumference);
    }

    public static double roadTrip(double diameter) {
        double circumference = diameter * Math.PI;
        System.out.println("In roadTrip method Circumference: " + circumference);
        return circumference;

    }






}