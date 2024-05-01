package org.com.rs;

public class Animal 
{
   String name;
   String color;
   int weight;
   
   public Animal(String n,String c,int w)
   {
	   name=n;
	   color=c;
	   weight=w;   
  }
   void details()
   {
	   System.out.println(name+color+weight);
   }
   void eat()
   {
	   System.out.println(" ");
   }
   void noise()
   {
	   System.out.println("NOISE");
   }
   public static void main(String[] args) 
   { 
	   Animal a=new Animal("Tiger","White",50);
	   Animal a1=new Animal("Tiger","White",50);
	   a.details();
	   System.out.println(a);
	   System.out.println(a);	
}
}
