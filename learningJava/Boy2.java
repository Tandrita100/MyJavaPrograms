package com.learningJava;

class MarriageBuro implements girl{
    public void running(){
        System.out.println("Girl is running");
    }

    public girl needGirl(String GirlType){
        if("MarriedGirl".equals(GirlType)){
            return new MarriedGirl();
        }
        if("UnmarriedGirl".equals(GirlType)){
            return new UnmarriedGirl();
        }
        return null;
    }
}


public class Boy2 {
    public static void main(String[] args){
        MarriageBuro mb = new MarriageBuro();  //HardCoded Dependency
        girl gr = mb.needGirl("MarriedGirl");  //loose coupling dependency
        //girl gr2 = mb.needGirl("UnmarriedGirl");  //loose coupling dependency
        gr.running();
        //gr2.running();

    }
}
