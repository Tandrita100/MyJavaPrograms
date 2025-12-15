package com.JavaPrograms;

import java.util.ArrayList;

class Book{
    public String Book_Name, Book_Author;
    public Book(String Book_Name , String Book_Author){
        this.Book_Name = Book_Name;
        this.Book_Author = Book_Author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Book_Name='" + Book_Name + '\'' +
                ", Book_Author='" + Book_Author + '\'' +
                '}';
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books){
    this.books = new ArrayList<>(books);
    }
    public void addBook(Book book){
        System.out.println("The book has been added in the library.");
        this.books.add(book);
    }
    public void issueBook(Book book ,String issued_to){
        System.out.println("The book has been issued in the library.");
        this.books.remove(book);
    }
    public void returnBook(Book book){
        System.out.println("The book has been returned in the library.");
        this.books.add(book);
    }
}

public class Exercise7LibraryManagement {
    public static void main(String[] args) {
        ArrayList<Book> ss = new ArrayList<>();
        Book b1 = new Book("Harry Potter" , "jk rowling");
        ss.add(b1);

        Book b2= new Book("Harry Potter2" , "jk rowling");
        ss.add(b2);

        Book b3 = new Book("Harry Potter3" , "jk rowling");
        ss.add(b3);

        Book b4 = new Book("Harry Potter4" , "jk rowling");
        ss.add(b4);

        Book b5 = new Book("Harry Potter5" , "jk rowling");
        ss.add(b5);

        MyLibrary lib = new MyLibrary(ss);
        System.out.println(lib);


    }
}
