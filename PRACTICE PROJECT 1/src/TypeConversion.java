
public class TypeConversion {
	  public static void main(String[] args) 
	  { 
	    byte b = 42; 
	    char c = 'a'; 
	    short s = 1024; 
	    int i = 50000; 
	    float f = 5.67f; 
	    double d = .2; 

	// Expression: 
	   double result = (f * b) + (i / c) - (d * s); 

	//Result after all the conversions are done. 
	   System.out.println("result = " + result); 
	  } 

}
