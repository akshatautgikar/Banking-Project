/* Java Program to understand a Constructor
 */
package New_Bank_Account;

class Account101{
	// user defined class
		String name = "Akshata Utgikar";
		String address = "Jawahar Colony, Aurangabad";
	    long contact = 7822055030l;
	    String type = "Saving";
	    String account = "individual";
	    
	    Account101(){
	    	// no arg or no arguments or non parametrized user defined constructor
	    	System.out.println("Constuctor for class Account101 is called");
	    	
	    	int a = 10;
	    	int b = 20;
	    	int c = a+b;
	    	
	    	System.out.println(c);
	    }

	
}


public class Test_Constructor {

	public static void main(String[] args) {
		
		Account101 A101 = new Account101();
		
		System.out.println("END OF PROGRAM!!!!");
		
	}

}
