package Package1;

public class proaccessspecifiers {

	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}

//create another package
package Package2;

import Package1.*;

public class access3 extends proaccessspecifiers {

	public static void main(String[] args) {
		access3 obj = new access3 ();   
	       obj.display();  
	}

}
