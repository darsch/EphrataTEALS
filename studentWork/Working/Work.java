package studentWork.Working;

import java.util.Scanner;

public class Work{

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter String of words");

        String string = console.nextLine();

        System.out.println("Enter Max Length of the words to print out");

        int number = console.nextInt();

        printShortWords(string, number);

        
    }




    public static void  printShortWords(String string, int number){

        for(int i = 0; i < string.length(); i++){

            int index = 0;

            if (string.charAt(i) == ' '){
                
                if(i - index <= number){

                    System.out.println(string.substring(index,i));
                    
                }

            }
            index = index + i;
        }


    }





}

