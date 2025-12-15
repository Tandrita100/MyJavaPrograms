package com.JavaPrograms;

interface camera{
    void clickphotos();
    void recordvideos();
    private void cantconnect(){
        System.out.println("can not connect.");
    }
    default void hdphotos(){
        cantconnect();
        System.out.println("click photos in HD.");
    }
}

interface wifi{
    String [] networks();
    void connectToWifi(String network);
}

interface GPS{
    void location();
}

class myphone{
    public void location(){
        System.out.println("search the location.");
    }
    public String [] networks() {
        System.out.println("list of networks available:");
        String[] networks = {"Baidya", "123jnjbs", "mynetwork5G", "freewifi123"};
       return networks;
    }
    public void connectToWifi(String network){
        System.out.println("connect to " + network);
    }
}

class mySmartphone extends myphone implements camera,wifi,GPS{
    @Override
    public void clickphotos() {
        System.out.println("click some cool photos.");
    }

    @Override
    public void recordvideos() {
        System.out.println("record a video.");
    }

}
public class InterfacesAndDefaultMethods {
    public static void main(String[] args) {
        mySmartphone sm = new mySmartphone();
        sm.clickphotos();
        sm.recordvideos();
        sm.hdphotos();
        String [] arr= sm.networks();
        for (String elements : arr) {
            System.out.println(elements);
        }
        sm.location();
        sm.connectToWifi("freewifi");
    }
}
