package com.JavaPrograms;

interface mycamera{
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

interface yourwifi{
    String [] networks();
    void connectToWifi(String network);
}

interface myGPS{
    void location();
}

class yourphone{
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

class yourSmartphone extends yourphone implements mycamera,yourwifi,myGPS {
    @Override
    public void clickphotos() {
        System.out.println("click some cool photos.");
    }

    @Override
    public void recordvideos() {
        System.out.println("record a video.");
    }

}
public class Polymorphism{
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

        System.out.println();

        System.out.println("polymorphism example:");
        mycamera cam = new yourSmartphone();  // This is a smartphone but, use it only as a camera
        cam.clickphotos();
        cam.hdphotos();
        cam.recordvideos();
        //cam.location() --> not allowed

        System.out.println();
        
        myGPS gps = new yourSmartphone();  // This is a smartphone but, use it only as a camera
        gps.location();
        //gps.connectToWifi() --> not allowed

    }
}

