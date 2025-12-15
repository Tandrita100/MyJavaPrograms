package com.JavaPrograms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class bnhjb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner File = new Scanner(System.in);
        Scanner Gmail = new Scanner(System.in);
        Scanner idNum = new Scanner(System.in);

        System.out.print("Enter Number of Students:");
        int numStudents = scan.nextInt();
        System.out.println("Enter your file name with Extension");
        //String FileName = scan.nextLine();
        //scan.nextLine();
        try{
            //String expected in File Name
            if (File.hasNextInt()) {
                System.out.println("Invalid input. String expected.");
                return;  // End the code execution
            }
            String FileName = scan.nextLine();
            FileWriter writer = new FileWriter(File.nextLine());

            for (int i = 0; i < numStudents; i++){
                System.out.println("\nStudent " +(i + 1) + ":");

                System.out.println("Enter the name: ");
                //check id
                String name = scan.nextLine();


                System.out.println("Enter the id: ");
                //String id = idNum.nextLine();
                //check id
                if (!idNum.hasNextInt()) {
                    System.out.println("Invalid input. Integer expected.");
                    return;  // End the code execution
                }String id = idNum.nextLine();


                System.out.println("Enter the email: ");
                String email = Gmail.nextLine();
                //check Ends with ".Com
                if (!email.endsWith("@gmail.com")) {
                    System.out.println("Invalid input. Email must end with '@gmail.com'.");
                    return;  // End the code execution
                }


                String StudentInfo = name + "," + id +"," + email + "\n";
                writer.write(StudentInfo);
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        scan.close();
        File.close();
        Gmail.close();

        

    }
}
