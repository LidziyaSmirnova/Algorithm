import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StringLengthComparator implements Comparator<String> {
	public int compare(String s1, String s2) { 
		int length1 = s1.length();
		int length2 = s2.length();
		
		if(length1>length2) {
			return 1;
		}
		else if(length1<length2) {
			return -1;
		}
			return 0;}
	
}
public class SortByLineLength {

	public static void main(String[] args) {
	
 ArrayList<String> greet = new ArrayList<String>();
 
 greet.add("Hello");
 greet.add("Hi");
 greet.add("Добрый день!!");
 greet.add("Привет");
 greet.add("Hola");
 
Collections.sort(greet, new StringLengthComparator());

for(String greeting: greet){
	 System.out.println(greeting);
  }
}
}