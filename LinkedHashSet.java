import java.util.HashSet;

import java.util.Set;

 
public class LinkedHashSet {
 
    public static void main(String a[]){
    	 Set<String> check = new HashSet<String>();   
         check.add("banana");
         check.add("pineapple");
         check.add("apple");
         check.add("pineapple");
         
         for(String i:check) {
        	 System.out.println(i);
         }

    }
}
 