public class TypeCasting{
public static void main(String args[]){
	byte byteNumber = 58;
	short short_number = 5000;
	int numberInt = 854;

	int result = (int)(byteNumber) * (int)(short_number) * (int)(numberInt);
	System.out.println("Result: " + result);

	double myNum = 45.678;
	int myIntNum = (int)(myNum);

	System.out.println("Converted Number: " + myIntNum);

	double myNum1 = 45.38;
	double myNum2 = 28.45;
	int multipliedNum = (int)(myNum1 * myNum2);

	System.out.println("Multiplied and Coverted to Integer value: " + multipliedNum);

	int num1 = 25;
	double conNum = (double)(num1);
	System.out.println("Converted into Double: " + conNum);
}
}