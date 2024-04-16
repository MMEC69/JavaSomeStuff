package Activity2;

import java.util.Scanner;

public class Activtity2 {
    public static void main(String args[]){
//        int num = -100;
        try(Scanner sc = new Scanner(System.in)){
            while(true){
               System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if(num >= 0){
            System.out.println("Number is positive");
            }
            else{
                System.out.println("The number is negative");
            }
            System.out.println("IF CONDITION TERMINATED. Control is outside the condition block");
         
            }
            
        }
        
    }
}
