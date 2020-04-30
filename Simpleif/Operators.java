class Operators {
public static void main(String args[]){
	// Increment and Decrement Operators
	int a = 10;
	//pre increment
	++a;
System.out.println("Pre-Increment Value of a: " + a);

int j = 10;
//post Increment
j++;
System.out.println("Post-Increment Value of j: " + j);


	int c = 10;
	//pre decrement
	--c;
System.out.println("Pre-Increment Value of c: " + c);

int d = 10;
//post decrement
d++;
System.out.println("Post-Increment Value of d: " + d);


// Arithemetic Operators
int num1 = 100;
int num2 = 50;

// Usiing Arithemetic Operators
int sum = num1 + num2;
int subtract = num1 - num2;
int multiplication = num1 * num2;
int division = num1 / num2;
double divide = (double)(num1/num2);
 
int number = 150;
int quotient = 100;
int remainder = number % quotient;
 // Printing Results
System.out.println("Sum: " + sum);
System.out.println("Subtraction: " + subtract);
System.out.println("Multiplication: " + multiplication);
System.out.println("Integer Divison: " + division);
System.out.println("Double Division: " + divide);
System.out.println("Remaider: " + remainder);

}
}
