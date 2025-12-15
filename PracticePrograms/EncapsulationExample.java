package com.PracticePrograms;

class Atm{
    private int pin;
    private String accountNo ;
    private long amount;

    public int getPin(){
        return pin;
    }
    public void setPin(int pin){
        this.pin = pin;
    }
    public long getAmount() {
        return amount;
    }
    public void setAmount(long amount) {
        this.amount = amount;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
}
public class EncapsulationExample {
    public static void main(String [] args){
        Atm atm = new Atm();
        atm.setPin(543676767);
        System.out.println("The Atm pin is: " + atm.getPin());
        atm.setAccountNo("AG476GHH7T4");
        System.out.println("The Account no. is: " + atm.getAccountNo());
        atm.setAmount(56357422267575675L);
        System.out.println("The amount is: " + atm.getAmount());

    }
}
