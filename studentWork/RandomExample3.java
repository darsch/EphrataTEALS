package studentWork;

import java.util.Random;

public class RandomExample3  {  
    public static void main(String[] args) 
    {  
        // Generate random number between 5 to 30  
        double a = 5 + (Math.random() * 30);  
        double b = 5 +  (Math.random() * 30);

        Random random = new Random();


        int min = 5;
        int max = 10;
        //int armies = (int)(Math.random() * (max - min + 1)) + min;

        int armies = 5 + random.nextInt(10 - 5 + 1);

        // Output is different every time this code is executed    
        System.out.println(a);  
        System.out.println(b);
        System.out.println(armies);
        System.out.println(random);    
    }  
}  