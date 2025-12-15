package com.JavaPrograms;

import java.io.File;
import java.io.FileNotFoundException;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class filehandling {
    public static void main(String[] args) {
        System.out.println("This is a program for file handling.");

        /*
        //file creation
        File file = new File("newfile.txt");
        try{
            file.createNewFile();
        }catch(IOException e){
            System.out.println("unable to create file.");
            System.out.println(e);
            //e.printStackTrace();
        }

        */

      /*
        //writing a file
        try{
            FileWriter fileWriter = new FileWriter("newfile.txt");
            fileWriter.write("Hello, This is nom nom nom..\n meow meow meow");
            fileWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }

         */


        //Reading a file
         File file = new File("newfile.txt");
         try {
             Scanner scan = new Scanner(file);
             while (scan.hasNextInt()) {
                 System.out.println(scan.nextInt());
             }
             scan.close();
         }catch (FileNotFoundException e){
             e.printStackTrace();
         }
//         catch(InputMismatchException e){
//             System.out.println(e);
//         }

    }
}
