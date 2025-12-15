package com.JavaPrograms;

class Library{
    String [] books ;
    int noOfBooks;

    Library(){
        books = new String[50];
        noOfBooks = 0;
    }

    public void addBook(String book){
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println("~ " + book + " have been added.");
    }

    public void showAvailableBooks(){
        System.out.println("The available books are:");
        for(String books : this.books){
            if( books == null){
                break;
            }
            System.out.println("# " + books);
        }
    }


    public void issueBook(String book){
        for(int i = 0; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("This book have been issued.");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist.");
    }

    public void returnBook(String book){
        addBook(book);
    }


}
public class Exercise4OnlineLibrary {
    public static void main(String[] args) {
        Library lib = new Library();
        System.out.println("Adding Books.....");
        lib.addBook("Harry Potter");
        lib.addBook("Lord of the Rings");
        lib.addBook("How to Sleep");
        lib.addBook("After");
        lib.addBook("The Book Thief");
        lib.addBook("To Kill a Mockingbird");
        lib.addBook("American Psycho");
        lib.addBook("White Noise");

        System.out.println();

        //showing available books
        lib.showAvailableBooks();

        System.out.println();

        //issuing a book
        lib.issueBook("Harry Potter");

        System.out.println();

        lib.showAvailableBooks();

        System.out.println();

        //lib.returnBook("Harry Potter1");
        lib.returnBook("Harry Potter");

        System.out.println();

        lib.showAvailableBooks();
    }
}
