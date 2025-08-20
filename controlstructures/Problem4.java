package controlstructures;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem4 {
    
}
 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a year
        System.out.print("Input year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeap = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
        }

        // Display the result
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
 
