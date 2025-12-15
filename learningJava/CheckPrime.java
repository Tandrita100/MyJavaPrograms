package com.learningJava;

public class CheckPrime {

    public static void main(String[] args){
        //int a = Integer.MAX_VALUE;
        int a = 7;
//        if(a % 1 == 0 || a % a == 0 && a % 2 != 0){
//            System.out.println("Number is Prime");
//        }else{
//            System.out.println("Number is not prime");
//        }
//
        //boolean prime = false;
        int count = 2;
        for(int i = 2; i <= a/2 ; i++){
            if(a % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime number");
        }else {
            System.out.println("Not prime");
        }
    }
}

/*
count =0;
if(n==1){
not prime
}
for(int i =2; i*i=n ;i++){
	if(n%i==0){
		count=count+2;
	}
	if(i==n/i){
		count=count+1;
	}
}

if(count=2){
prime
}else{
not prime
}
 */