package com.learningJava;

public class bag {

    private String pen = "Reynolds";
    private int books = 4;
    private String waterBottle = "cello";

    public String getPen() {
        return pen;
    }

    public void setPen(String pen) {
        //pen = "Cello";
        this.pen = pen;
    }

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        this.books = books;
    }

    public String getWaterBottle() {
        return waterBottle;
    }

    public void setWaterBottle(String waterBottle) {
        this.waterBottle = waterBottle;
    }

    public static void main(String [] args){
        bag b = new bag();

        b.setPen("Linc");
        System.out.println(b.getPen());

        b.setBooks(5);
        System.out.println(b.getBooks());

        b.setWaterBottle("Milton");
        System.out.println(b.getWaterBottle());

    }
}
