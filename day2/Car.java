package week1.day2;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Car {
 public static void main(String[] args) {
	 // classname object name = new classname();
	 Car carDetails = new Car();
	   int regNumber = carDetails.regNumber();
	 String carModel = carDetails.getCarModel();
	 String carOwner = carDetails.getName();
	 boolean punctured = carDetails.isPunctured();
	 int twoNumber = carDetails.getTwoNumber(10, 4);
	 int threeNumbers = carDetails.getThreeNumbers(2, 4, 5);
	 int divNumber = carDetails.getDivNumber(16, 4);
	System.out.println(4321);
	System.out.println("Swift");
	System.out.println("Akshita");
	System.out.println(false);
	System.out.println(10-4);
	System.out.println(2*4*5);
	System.out.println(16/4);
	
}
 public int regNumber(){
	 int num =  4321;
	 return num;
 }
private String getName() {
	return ("Akshita");
}
 String getCarModel() {
	return ("Swift");

}
public boolean isPunctured() {
	return (false);
}
public int getTwoNumber(int a,int b) {
	return 10-4;
	
}
public int getThreeNumbers(int c,int d, int e) {
	return 2*4*5;
}

public int getDivNumber(int x, int y) {
	return 16/4;
}
}

