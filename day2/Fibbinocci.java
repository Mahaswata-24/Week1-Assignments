package week1.day2;

public class Fibbinocci {
	public static void main(String[] args) {
		System.out.println("Fabbinocci series");
		
		int firstNum = 0,secNum = 1, sum = 0;
		System.out.println(firstNum + " ");
		System.out.println(secNum + " ");
		System.out.println(sum + " ");
		for(int i=1;i>=11;i=i+1) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
		}
	}
}
