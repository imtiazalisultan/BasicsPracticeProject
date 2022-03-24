package com.company;
import java.util.*;                           // java predefined library files



public class Calculator {
    public static float additions(float x,float y){   //method for addition

        float additions=x+y;                             
        System.out.println("Addition: "+additions);
        return 0;
    }
    public static float subtractions(float x,float y){   //Method for subtraction
        float subtraction=x-y;
        System.out.println("Subtraction: "+subtraction);
        return 0;
    }
 public static float multiplications(float x,float y){    //Method for Multiplication
        float multiplication=x*y;
     System.out.println("Multiplication: "+multiplication);
     return 0;
 }
  public static float divisions(float x, float y){          // method for division
     //  try{
           float division=x/y;
           System.out.println("Division: "+division);
     /*  }catch(ArithmeticException e){
           System.out.println("Wrong value Entered please check");
           System.out.println(e.getLocalizedMessage());

       }*/
       return 0;
    }

public static float modulus(float x, float y){            // method for modulus
   //     try{
            float modulus=x%y;
            System.out.println("Modulus: "+modulus);
   /*     }catch(ArithmeticException e){
            System.out.println("Wrong value Entered please check");
            System.out.println(e.getLocalizedMessage());

        }*/
        return 0;
}
public static void choicesOperation(int cho,float x,float y ){     // method for Choice of operation
    switch (cho) {
        case 1 -> System.out.println(additions(x,y));
        case 2 -> System.out.println(subtractions(x,y));
        case 3 -> System.out.println(multiplications(x,y));
        case 4 -> System.out.println(divisions(x,y));
        case 5 -> System.out.println(modulus(x,y));
        default -> System.out.println("Invalid Option Selected ");
    }
    return ;
}
public static void main(String[]args){                // main class for taking inputs...
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 1st Number: ");
    float num1=sc.nextFloat();
    System.out.println("Enter the 2nd Number: ");
    float num2=sc.nextFloat();

    System.out.println("Enter the choice of Operation: 1->Addition,2->Subtraction,3->Multiplication,4->Division,5->modulus ");
    int choice=sc.nextInt();
    choicesOperation(choice,num1,num2);

    }
}

