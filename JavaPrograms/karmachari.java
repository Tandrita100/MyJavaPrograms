package com.JavaPrograms;

class ekkarmachari{
private String naam;
private int tankha;
    public ekkarmachari(){
        naam = "ramu";
        tankha = 50000;
    }
//    public ekkarmachari(String mynaam, int mytankha){
//        naam = mynaam;
//        tankha = mytankha;
//    }
    public String getnaam(){
        return naam;
    }
    public int gettankha(){
        return tankha;
    }
}

public class karmachari {
    public static void main(String[] args) {
    ekkarmachari job = new ekkarmachari();
        System.out.println(job.getnaam());
        System.out.println(job.gettankha());
    }
}
