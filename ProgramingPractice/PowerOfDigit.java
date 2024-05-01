package ProgramingPractice;

import java.util.Scanner;

public class PowerOfDigit {

	public static void main(String[] args) {
		System.out.println("enter num");
        Scanner SC=new Scanner(System.in);
        int num=SC.nextInt();
        System.out.println("enter num you want to power");
        int mum=SC.nextInt();
        int power=1;
        for(int i=1;i<=num;i++)
        {
        	power=power*mum;
        }
        System.out.println("power "+power);
        SC.close();
	}

}
