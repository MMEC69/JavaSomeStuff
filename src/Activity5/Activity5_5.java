package Activity5;

import java.util.Scanner;

public class Activity5_5 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter any number: ");
            int num = sc.nextInt();
            int i = 2;
            boolean flag = false;
            while(i <= num /2){
                if(num % i == 0){
                    flag = true;
                    break;
                }
                i++;
            }
            if(!flag){
                System.out.println(num +" is a Prime number");
            }else{
                System.out.println(num +" is not a Prime number");
            }
        }
    }
}
