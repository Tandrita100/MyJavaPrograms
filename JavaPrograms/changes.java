package com.JavaPrograms;

import java.util.Scanner;

public class changes {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

//        String filename = "data.csv";
//        String header = "Name, Age, City";
//
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
//            writer.write(header);
//            writer.newLine();
//
//            // Add the data rows here if needed
//
//            System.out.println("CSV file created successfully!");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
   // }

    String studentName;
    int age;
    String city;

        do {
        System.out.print("Enter student name: ");
        studentName = scanner.nextLine();
    } while (studentName.isEmpty());

        do {
        System.out.print("Enter age: ");
        String ageString = scanner.nextLine();
        try {
            age = Integer.parseInt(ageString);
            break;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid age.");
        }
    } while (true);

        do {
        System.out.print("Enter city: ");
        city = scanner.nextLine();
    } while (city.isEmpty());

        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
}

}