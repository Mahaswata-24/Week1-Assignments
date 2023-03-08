package week1.day2;

public class IsPrime {
public static void main(String[] args) {
	int y = 83;
	boolean flag = false;
	// check condition prime or not
	for (int n = 2; n<y/2; n++) {
		if (y%n==0) {
		System.out.println("The number is not prime");
		flag = true;
		break;
		}
	}
	if(!flag) {
		System.out.println("This is a prime number");
	}
}
}


//Initialize int value
//Declare a boolean variable flag as false
//Iterate from 2 to half of the input
//Divide the input with each for loop variable and check the remainder
//Set the flag as true when there is no remainder
//break the iterator
//Check the flag (Provide a condition)
//Print 'Prime' when the condition matches
//Print 'Not a Prime' when the condition doesn't match

