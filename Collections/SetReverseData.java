package Collections;
import java.util.*;
public class SetReverseData {

	public static void main(String[] args)
	{
		TreeSet<Integer> t= new TreeSet<Integer>();
		t.add(55);
		t.add(20);
		t.add(87);
		t.add(90);
		t.add(85);
		t.add(1101);
		t.add(820);
		t.add(95);
		t.add(72);
		t.add(19);
		System.out.println("Insertion Order   !!!"+t);
		TreeSet<Integer> ts= (TreeSet<Integer>)t.descendingSet();
		System.out.println("Shorting After Descending Order!!!");
		System.out.println(ts);
		

	}

}
