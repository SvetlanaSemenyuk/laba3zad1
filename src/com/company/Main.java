package com.company;

public class Main {

    public static void main(String[] args) {
	float a=1;
	for(int i=2; i<=10000;i++){
	    if(i%2==0){
	        a-=1f/i;
        }
        else {
            a+=1f/i;
        }
    }
    System.out.print(a);
    }
}
