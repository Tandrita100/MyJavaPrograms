package com.practice;

interface camera{
    public void snap();
    public void record();
    private void hdvideos(){       //private methods inside an interface must have a body.
        System.out.println("Record some HD videos.");
    }
    default void hdsnap(){         //Default methods inside an interface must have a body.
        hdvideos();                //we must call private methods in default methods to use them.
        System.out.println("Click some HD photos.");
    }
}

interface network{
     String [] networks();
     void connectnetwork(String network);
}

interface gps{
    public void location();
}

interface musicplayer{
    public void playmusic();
    public void stopmusic();
}

class herphone implements gps,musicplayer {
    public void call( String name, long phonenum){
        System.out.println("calling..." + name + "\n\t" +  phonenum);
    }
    public void pickcall( String name, long phonenum){
        System.out.println("connecting to.." + name + "\n\t" +  phonenum);
    }

    @Override
    public void location() {
        System.out.println("Find this location.");
    }
    public void playmusic() {
        System.out.println("Play some good music.");
    }
    public void stopmusic() {
        System.out.println("stop the music.");
    }
}

class hersmarphone extends herphone implements camera,network{
    public void bluetooth(){
        System.out.println("connect to bluetooth.");
    }
    @Override
    public void snap() {
        System.out.println("click some photos.");
    }
    public void record() {
        System.out.println("record a few videos.");
    }
    public String [] networks() {
        System.out.println("list of networks:");
        String [] networks = {"fdx5G","yoyo","zeeee","beezelbub","ohno!!"};
        return networks;
    }
    public void connectnetwork(String network) {
        System.out.println("connecting to network " + network);
    }
}
public class InterfacesDefaultMethod {
    public static void main(String[] args) {
        hersmarphone hrm = new hersmarphone();
        hrm.snap();
        hrm.record();
        hrm.hdsnap();         //default method includes private method

        System.out.println();

        String [] ar = hrm.networks();
        for( String element: ar){
            System.out.println("\t"+element);
        }

        System.out.println();

        hrm.location();
        hrm.playmusic();
        hrm.stopmusic();
        hrm.call("rick",986543578);
        hrm.pickcall("morty", 663564647);
        hrm.bluetooth();
    }
}
