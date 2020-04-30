import java.util.*;
class InputScan{
public static void main(String args[]){

System.out.println("This is a simple addidtion calculator");

Scanner scanner = new Scanner(System.in);

System.out.println("Enter the first number: ");
int num1 = scanner.nextInt();
System.out.println("Enter the second number: ");
int num2 = scanner.nextInt();
int sum = num1 + num2;
System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);

scanner.close();

}
}