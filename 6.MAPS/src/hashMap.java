

	import java.util.*;
	public class hashMap {

		public static void main(String[] args) {
			// map
			
			//Hashmap
			HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		      hm.put(1,"Tim");    
		      hm.put(2,"Mary");    
		      hm.put(3,"Catie");   
		       
		      System.out.println("\nThe elements of Hashmap are ");  
		      for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      
		     
		      }
		}
	

