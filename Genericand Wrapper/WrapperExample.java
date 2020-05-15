import java.util.Scanner;

class WrapperExample {
public static void main(String[] args) throws NumberFormatException{

Scanner input = new Scanner(System.in);
System.out.print("Enter the number: ");
String number = input.next();
Integer a = Integer.parseInt(number);
System.out.println("Integer Number: "+ a);

System.out.println("-----------------------");

System.out.print("Enter the double number: ");
String dNumber = input.next();
Double doubleNumber = Double.parseDouble(dNumber);
System.out.println("Double Number: " + doubleNumber);

input.close();
}
}