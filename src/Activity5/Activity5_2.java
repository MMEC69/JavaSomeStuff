/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity5;

import java.util.Scanner;

/**
 *
 * @author FruitCake
 */
public class Activity5_2 {
    private static Scanner sc; 
    
    public static void main(String args[]){
        int num, i, even = 0, odd = 0;
        sc = new Scanner(System.in);
        
        System.out.println("Please enter any number: ");
        num = sc.nextInt();
        
        for(i = 1; i <= num; i++){
            if(i % 2 == 0){
                even = even +i;
            }else{
                odd = odd + i;
            }
        }
        System.out.println("\nThe sum of Even Numbers uptp "+num +" = "+even);
        System.out.println("\nThe sum of Odd numbers upto "+num +" = "+odd);
    }
}
