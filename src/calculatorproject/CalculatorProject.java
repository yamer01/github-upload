/*
 * Author: Youssef Amer
 * This program is calculator with basic four function, trig functions, and exponential function capabilities.
 * The navigtes the calculator menue using numbers and is prompted for details for calculation afterwards.
 * Project made for my Intro to Prog. I class at University of Hartford (12/14/2019)
 */
package calculatorproject;

/**
 *
 * @author ukyAm
 */
import java.util.Scanner;
public class CalculatorProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        Calculator calc = new Calculator();
        
        // do-while loop to print the menu and execute appropriate
        // operation based on selection. SENTINEL VALUE = 0. 
        do{
        System.out.println("********** YOUSSEF'S CALCULATOR **********");
        System.out.println("* (0) QUIT                               *");
        System.out.println("* (1) ADDITION                           *");
        System.out.println("* (2) SUBTRACTION                        *");
        System.out.println("* (3) MULTIPLICATION                     *");
        System.out.println("* (4) DIVISION                           *");
        System.out.println("* (5) SIN                                *");
        System.out.println("* (6) COS                                *");
        System.out.println("* (7) TAN                                *");
        System.out.println("* (8) ARCSIN                             *");
        System.out.println("* (9) ARCCOS                             *");
        System.out.println("* (10) ARCTAN                            *");
        System.out.println("* (11) POWER                             *");
        System.out.println("******************************************");
        
        choice = scan.nextInt();
        switch(choice){
            case 0:
                System.out.println("Thanks for using my calculator!");
                break;
            case 1:
                float add = calc.add();
                System.out.println("Addition output: " + add);
                break;
            case 2:
                float subtract = calc.subtract();
                System.out.println("Subtraction output:: " + subtract);
                break;
            case 3:
                float multiply = calc.multiply();
                System.out.println("Multiplication output: " + multiply);
                break;
            case 4:
                float divide = calc.divide();
                System.out.println("Division output: " + divide);
                break;
            case 5:
                double sin = calc.sin();
                System.out.println("Sin output: " + sin);
                break;
            case 6:
                double cos = calc.cos();
                System.out.println("Cos output: " + cos);
                break;
            case 7:
                double tan = calc.tan();
                System.out.println("Tan output: " + tan);
                break;
            case 8:
                System.out.println("Arcsin output: " + calc.arcSin());
            case 9:
                System.out.println("Arccos output: " + calc.arcCos());
            case 10:
                System.out.println("Arctan output: " + calc.arcTan());
            case 11:
                System.out.println("Power output: " + calc.power());
            default:
                System.out.println("Invalid input. Please try again (0-11).");
        }
        System.out.println();
        System.out.println();
        
        }while(choice != 0);
    }
    
}