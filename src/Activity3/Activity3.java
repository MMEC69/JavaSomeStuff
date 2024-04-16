package Activity3;

import java.util.Scanner;

public class Activity3 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your choice,\n1 : Noodles\n2: Milkshake\n3: Fruits\n4: Coffe");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Noodles");
            }else if(choice == 2){
                System.out.println("Milkshake");
            }else if(choice == 3){
                System.out.println("Coffe");
            }else{
                System.out.println("Invalid input");
            }
        }
    }
}