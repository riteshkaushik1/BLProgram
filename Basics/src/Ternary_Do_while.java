import java.util.*;
import java.util.Scanner;
public class Ternary_Do_while {
    public static void main(String[] args) {
//        int a = 30, b = 50;
//        int largest = (a > b) ? a : b;
//        System.out.println("Largest = " + largest);

//        int a= 30 , b= 50 , c=60;
//        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
//        System.out.println("largest = " + largest);

//        int a = 5 , b = 10 , c = 4 , d = 20;
//        int largest = (a > b && a > c && a > d) ? a : (b > c && b > d ) ? b : (c > d) ? c : d;
//        System.out.print(largest);



            //Table of 2 using loop
//        for (int i = 1; i <= 10; i++){
//            System.out.println("2 * " + i + " = " + (2 * i));
//        }


            //using whle loop
//        int i = 1;
//        while(i <= 10){
//            System.out.println("2 * " + i + " = " + (2 * i));
//            i++;
//        }


            //do while exit control loop
            int i =1;
            do{
                System.out.println("2 * " + i + " = " +( 2 * i));
                i++;
            }
            while(i<=10);
        }

}
