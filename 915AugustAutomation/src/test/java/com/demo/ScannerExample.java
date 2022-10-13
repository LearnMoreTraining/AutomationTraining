package com.demo;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // int

        System.out.println("Enter first Number");
       int firstNumber= scanner.nextInt();
        System.out.println("Enter second Number");
       int secondNumber = scanner.nextInt();
        System.out.println("Enter Operation");
       String operation = scanner.next();

       if(operation.equals("+"))
       {

       }
       else if(operation.equals("-")) {

       }
       else{
           System.out.println("Invalid operator");
       }

      switch (operation) {

          case "+":
             int b= firstNumber + secondNumber ;
              break;
          case "-" :
              break;
          case "*":

          default:
              System.out.println("");
      }


    }
}
