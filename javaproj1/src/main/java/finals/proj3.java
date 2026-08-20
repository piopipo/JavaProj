/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finals;
 import java.util.Scanner;

public class proj3 {
  
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("===== SIMPLE CALCULATOR =====");
            
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();
            
            System.out.println("\nChoose an operation (enter a number):");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            double result;
            
            switch (choice) {
                case 1:
                    result = a + b;
                    System.out.println("Result: " + result);
                    break;
                    
                case 2:
                    result = a - b;
                    System.out.println("Result: " + result);
                    break;
                    
                case 3:
                    result = a * b;
                    System.out.println("Result: " + result);
                    break;
                    
                case 4:
                    if (b != 0) {
                        result = a / b;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                    
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

