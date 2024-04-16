package Activity5;

import java.util.Scanner;

public class Activity5_3 {
    private static Scanner sc;
   public static void main(String args[]){
       int num, i, even = 0, odd = 0;
       sc = new Scanner(System.in);
       
       System.out.println("Please Enter Any Number: ");
       num = sc.nextInt();
       
       for(i = 1; i <= num; i++){
           if(i % 2 == 0){
               even = even + i;
           }else{
               odd = odd + i;
           }
       }
       System.out.println("\nThe sum of even numbers upto "+num +" = "+even);
       System.out.println("\nThe sum of odd numbers upto" +num +" = " +odd);
       
   } 
}
