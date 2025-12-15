package com.practice;

interface Mp3player{
    int a = 23;
    public void playmusic();
    public void stopmusic();

}
interface Volume{
    public void incvolume();
    public void decvolume();
}
class sony implements Mp3player{
   // int a = 78;  ---> we can override the properties but cannot change them during runtime.
    @Override
    public void playmusic() {
        System.out.println("play the music.");
    }
    public void stopmusic(){
        System.out.println("stop the music.");
    }
}
class panasonic implements Mp3player,Volume{
    @Override
    public void playmusic() {
        System.out.println("play the music.");
    }
    public void stopmusic(){
        System.out.println("stop the music.");
    }
    public void incvolume(){
        System.out.println("increase the volume.");
    }
    @Override
    public void decvolume() {
        System.out.println("decrease the volume.");
    }
}
class samsung implements Volume{
    @Override
    public void incvolume() {
        System.out.println("increase the volume.");
    }
    public void decvolume() {
        System.out.println("decrease the volume.");
    }
}
public class InterfacesInJava {
    public static void main(String[] args) {
        sony s = new sony();
        s.playmusic();
        s.stopmusic();
        System.out.println(s.a);
      //s.a = 40; -->we can not change the values because it is final.

        System.out.println();

        panasonic p = new panasonic();
        p.playmusic();
        p.stopmusic();
        p.incvolume();
        p.decvolume();

        System.out.println();

        samsung sam = new samsung();
        sam.incvolume();
        sam.incvolume();

     // Mp3player m = new Mp3player() ---> object creation for interfaces is not allowed

    }
}
