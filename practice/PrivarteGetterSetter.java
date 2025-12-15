package com.practice;

class MentalHospital{
   private String PatientName ;

    public void setPatientName(String p){
        PatientName = p;
    }
    public String getPatientName(){
        return PatientName;
    }

}
public class PrivarteGetterSetter {
    public static void main(String[] args) {
    MentalHospital hosp = new MentalHospital();
    hosp.setPatientName("Prerna Balodi");
    System.out.println("Patient name is " + hosp.getPatientName());
    }

}
