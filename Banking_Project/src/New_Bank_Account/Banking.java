/* Java Program to understand the importance of Object creation 
 */
package New_Bank_Account;

/*class Account101{ 
	// user defined class
	String name = "Akshata Utgikar";
	String address = "Jawahar Colony, Aurangabad";
    long contact = 7822055030l;
    String type = "Saving";
    String account = "individual";
    
} */

class Account102{
	// user defined class
	String name = "Sagar Kadam";
	String address = "Cidco, Aurangabad";
    long contact = 123456;
    String type = "Current";
    String account = "Joint";
    
}

class Account103{
	// user defined class
	String name = "Akshata Utgikar";
	String address = "Samartha Nagar, Aurangabad";
    long contact = 568971234;
    String type = "Saving";
    String account = "individual";
    
}

// main class having main() method
public class Banking {

	public static void main(String[] args) {

		//creating Objects of user defined classes
		
		Account101 A101 = new Account101();
		
		Account101 acc101 = new Account101();
        
		Account102 A102 = new Account102();
		
		Account103 A103 = new Account103();
		

	}

}
