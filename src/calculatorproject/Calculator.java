package calculatorproject;

/**
 * Author: Youssef Amer
 * Intro to Prog. 1 @ UHart Final (12/14/2019)
 * Calculator class for all operations.
 */
import java.util.Scanner;

public class Calculator {
    private Scanner scan = new Scanner(System.in);
    
    // Constructor. No instance data, only used to access the class methods.
    public Calculator(){
        
    }
    
   // Addition method
    public float add(){
       System.out.println("How many numbers would you like to add? ");
       int choice = scan.nextInt();
       float sum = 0;
       for(int i = 0; i < choice; i++){
           System.out.println("Please enter a number: ");
           sum+=scan.nextFloat();
       }
       return sum;
    }
   
    // Subtraction method
    public float subtract(){
       System.out.println("How many numbers would you like to subtract? ");
       int choice = scan.nextInt();
       float diff = 0;
       for(int i = 0; i < choice; i++){
           System.out.println("Please enter a number: ");
           diff-=scan.nextFloat();
       }
       return diff;
    }
    
    // Multiplication method
    public float multiply(){
       System.out.println("How many numbers would you like to multiply? ");
       int choice = scan.nextInt();
       float product = 1;
       for(int i = 0; i < choice; i++){
           System.out.println("Please enter a number: ");
           product*=scan.nextFloat();
       }
       return product;
    }
    
    // Division method
    public float divide(){
       System.out.println("Please enter your dividend: ");
       float dividend = scan.nextFloat();
       System.out.println("Please enter your divisor: ");
       float divisor = scan.nextFloat();
       float quotient = dividend/divisor;
       return quotient;
    }
    
    // Sine method - user may enter either side ratio (e.g. 4/5) or decimal (e.g. 0.8)
    public double sin(){
        System.out.println("Would you like to enter side lengths (1) or a float value (2)? ");
        int choice = scan.nextInt();
        double ratio;
        
        if(choice == 1){
            System.out.println("Please enter the length of your opposite side: ");
            double opposite = scan.nextDouble();
            System.out.println("Please enter the length of your hypotenuse: ");
            double hypotenuse = scan.nextDouble();
            ratio = opposite/hypotenuse;
            return Math.sin(ratio);
        }
        
        if(choice == 2){
            System.out.println("Please enter your ratio as a double: ");
            ratio = scan.nextDouble();
            return Math.sin(ratio);
        }
        
        return 0;
    }
    
    // Cosine method - user may enter either side ratio (e.g. 4/5) or decimal (e.g. 0.8)
    public double cos(){
        System.out.println("Would you like to enter side lengths (1) or a float value (2)? ");
        int choice = scan.nextInt();
        double ratio;
        
        if(choice == 1){
            System.out.println("Please enter the length of your adjacent side: ");
            double adjacent = scan.nextDouble();
            System.out.println("Please enter the length of your hypotenuse: ");
            double hypotenuse = scan.nextDouble();
            ratio = adjacent/hypotenuse;
            return Math.cos(ratio);
        }
        
        if(choice == 2){
            System.out.println("Please enter your ratio as a double: ");
            ratio = scan.nextDouble();
            return Math.cos(ratio);
        }
        
        return 0;
    }
    
    
    // Tangent method - user may enter either side ratio (e.g. 4/5) or decimal (e.g. 0.8)
    public double tan(){
        System.out.println("Would you like to enter side lengths (1) or a float value (2)? ");
        int choice = scan.nextInt();
        double ratio;
        
        if(choice == 1){
            System.out.println("Please enter the length of your opposite side: ");
            double opposite = scan.nextDouble();
            System.out.println("Please enter the length of your adjacent side: ");
            double adjacent = scan.nextDouble();
            ratio = opposite/adjacent;
            return Math.tan(ratio);
        }
        
        if(choice == 2){
            System.out.println("Please enter your ratio as a double: ");
            ratio = scan.nextDouble();
            return Math.tan(ratio);
        }
        
        return 0;
    }
    
    // Arcsine method - user is prompted to enter degree measure of angle.
    public double arcSin(){
        System.out.println("Please enter your degree measure: ");
        double angle = scan.nextDouble();
        double ratio = Math.asin(angle);
        return ratio;
    }
    
    // Arccosine method - user is prompted to enter degree measure of angle.
    public double arcCos(){
        System.out.println("Please enter your degree measure: ");
        double angle = scan.nextDouble();
        double ratio = Math.acos(angle);
        return ratio;
    }
    
    // Arctangent method - user is prompted to enter degree measure of angle.
    public double arcTan(){
        System.out.println("Please enter your degree measure: ");
        double angle = scan.nextDouble();
        double ratio = Math.atan(angle);
        return ratio;
    }
    
    // Method to raise to a power, user is prompted for base and exponent.
    public double power(){
        System.out.println("Please enter your base number: ");
        double base = scan.nextDouble();
        System.out.println("Please enter your exponent: ");
        double power = scan.nextDouble();
        double result = Math.pow(base, power);
        return result;
    }
}
