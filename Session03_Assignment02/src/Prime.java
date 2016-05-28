import java.util.Scanner;

//Class for prime
public class Prime {

	//State of prime class
	int primeNum;
	
	
	//constructor of prime class
	public Prime(int primeNum){
		
		this.primeNum = primeNum;
	}
	
	
	//method of prime class
	public void primeCheck(){
		
		
		//creating a variable to get user input
		Scanner userInput = new Scanner(System.in);
		
		//Asking User to enter a number
		System.out.println("Enter a number to see if its Prime");
		
		//Getting the user input and assigning it to numCheck
		int numCheck = userInput.nextInt();
		
		//if statement to decide if it is prime or not
		if(numCheck % 2 == 0){
			System.out.println(numCheck + " is not a prime number");
			
			
		}else{
			System.out.println(numCheck+ " is a prime number");
		}
		
		
	}
	
	
	public static void main(String[]args){
		
		 int numCheck = 0;
		
		 //initializing the class and assigning its access to primeResult
		Prime primeResult = new Prime(numCheck);
		
		//Calling the prime class method
		primeResult.primeCheck();
	}
	

}


