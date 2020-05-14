import java.util.*;

class ExceptionExample {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

try {
System.out.print("Enter the number: ");
String number = sc.next();
int number1 = Integer.parseInt(number);
System.out.println("Your nuber: "+ number1);
}

catch(NumberFormatException e){
System.out.println("Cannot convert string into number");
e.getMessage();
}

finally {
sc.close();
}

}
}