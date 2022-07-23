

	public class threadClass extends Thread
	{
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	 		threadClass mt = new  threadClass();
	  		mt.start();
	 	}
	}
