package com.JavaPrograms;

import java.io.File;

public class filecreatewriteread {
    public static void main(String[] args) {

        //file creation
        /*
        File file = new File("myfile.txt");
        try {
            file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }

         */

        //writing in a file
        /*
        try {
            FileWriter write = new FileWriter("myfile.txt");
            write.write("A SONG\n" +
                    "This is the anthem\n" +
                    "Told the world I need everything and some, yeah\n" +
                    "Two girls that's a tandem\n" +
                    "She gon' do all it for me when them bands come\n" +
                    "Got it all, yeah, I'm young, rich, and handsome\n" +
                    "Uh, this shit is not random\n" +
                    "Everybody ain't got it, understand son, yeah\n" +
                    "This shit is not random\n" +
                    "Woah okay");
            write.close();
        }catch(IOException e){
            e.printStackTrace();
        }

         */

        //reading the file
       // File file = new File("myfile.txt");
        /*
        File file = new File("ye.txt");
        try{
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

         */

        //deleting a file
        File file = new File("ye.txt");
        if(file.delete()){
            System.out.println("This file has been deleted-" + file.getName());
        }
        else{
            System.out.println("an error occured while deleting.");
        }
    }
}
