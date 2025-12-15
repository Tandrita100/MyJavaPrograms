package com.JavaPrograms;

abstract class phone11{
    public phone11(){
        System.out.println("i am a constructor of phone class");
    }
    public void on(){
        System.out.println("turn on the phone.");
    }
    abstract public void clickphotos();
    abstract public void playmusic();
}
class samsung extends phone11{
    @Override
    public void clickphotos() {
        System.out.println("click some photos.");
    }
    @Override
    public void playmusic() {
        System.out.println("play some music.");
    }
}
class xiaomi extends phone11{
    @Override
    public void clickphotos() {
        System.out.println("click the photos");
    }
    @Override
    public void playmusic() {
        System.out.println("play music");
    }
}
abstract class oneplus extends phone11{
    public oneplus(){
        System.out.println("never settle");
    }
    abstract public void switchoff();
}

public class AbstractClassAndMethods {
    public static void main(String[] args) {
        phone11 ph = new samsung() ; // possible
        ph.clickphotos();

      //phone11 ph = new phone11() ; // not possible because it is an abstract class

        samsung sam = new samsung(); // possible

        xiaomi mi = new xiaomi();    // possible
        mi.playmusic();

    }
}
