
		public class innerClass {

			 private String msg="Welcome to Java"; 
			 
			 class Inner{  
			  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
			 }  


			public static void main(String[] args) {

				innerClass obj=new innerClass();
				innerClass.Inner in=obj.new Inner();  
				in.hello();  
			}
		}



