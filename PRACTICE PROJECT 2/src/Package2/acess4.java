package Package1;

public class pubaccessspecifiers {

	public void display() 
    { 
        System.out.println("This is Public Access Specifiers"); 
    } 
}

//create another package
package Package2;
import Package1.*;

public class acess4 {

	public static void main(String[] args) {
		
		pubaccessspecifiers obj = new pubaccessspecifiers(); 
        obj.display();  
		
	}
}
