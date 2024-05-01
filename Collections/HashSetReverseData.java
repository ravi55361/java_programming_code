package Collections;
import java.util.*;
public class HashSetReverseData {

	public static void main(String[] args) {
		HashSet<Integer> hs= new HashSet<Integer>();
		hs.add(55);
		hs.add(20);
		hs.add(87);
		hs.add(90);
		hs.add(85);
		hs.add(1101);
		hs.add(820);
		hs.add(95);
		hs.add(72);
		hs.add(19);
        System.out.println("Orignal Order!!!!!!!!!!!!");
        for(Integer n: hs)
             System.out.println(n);
        ArrayList <Integer>al= new ArrayList<Integer>(hs);
        Collections.reverse(al);
        System.out.println("Reverse Order!!!!!!!!!!!!!");
        for(Integer n: hs)
              System.out.println(n);
        System.out.println("-----------------------------------------------");
        HashSet<String> hss= new HashSet<String>();
		hss.add("TCS");
		hss.add("Wipro");
		hss.add("Conigent");
		hss.add("Oracle");
		hss.add("Amazon");
		System.out.println("Orignal Order!!!!!!!!!!!!");
        for(String n: hss)
             System.out.println(n);
        ArrayList <String>als= new ArrayList<String>(hss);
        Collections.reverse(als);
        System.out.println("Reverse Order!!!!!!!!!!!!!");
        for(String n: als)
              System.out.println(n);
		
	}

}
