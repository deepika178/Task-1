package datatypes;

import java.util.Scanner;

public class prg7 {
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = add.nextInt();
        System.out.println("Enter number2: ");
        int num2 = add.nextInt();
        System.out.println("Enter number3: ");
        int num3 = add.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(+num1);
        }
        else if(num2>num3 &&  num2>num1){
            System.out.println(+num2);
        }
        else{
            System.out.println(+num3);
        }
    }
}