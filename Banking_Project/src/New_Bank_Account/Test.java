package New_Bank_Account;


class Account1001{
	// user defined class
		String name = "Akshata Utgikar";
		String address = "Jawahar Colony, Aurangabad";
	    long contact = 7822055030l;
	    String type = "Saving";
	    String account = "individual";
	    
	    Account1001(int x){
	    	// parametrized user defined constructor
	    	System.out.println("Constuctor for class Account1001 is called");
	    	//System.out.println("Entered value of x is: " + x);
	    	int a = 10;
	    	int b = 20;
	    	int c = a+b;
	    	
	    	System.out.println(c);
	    }
}

public class Test {

	public static void main(String[] args) {
		
		Account1001 A1001 = new Account1001(500);
		
	}

}
