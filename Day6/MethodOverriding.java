class MethodOverriding {
public static void main(String[] args){
System.out.println("****************");
Odd num1 = new Odd(5);
num1.printNumber();
System.out.println("****************");
Odd num2 = new Odd(10);
num2.printNumber();
System.out.println("****************");
Even num3 = new Even(16);
num3.printNumber();
System.out.println("****************");
Even num4 = new Even(15);
num4.printNumber();

}
}

class Number{
int number;

public Number(int number){
this.number = number;
}

public void printNumber(){
System.out.println("Number: "+ number);
}
}

class Even extends Number{
public Even(int number){
super(number);
}

public void printNumber(){
if(number % 2 == 0){
System.out.println("This is an Odd Number.");
System.out.println("Even Number: " + number);
}
else{
super.printNumber();
}

}
}

class Odd extends Number{
public Odd(int number){
super(number);
}

public void printNumber(){
if(number % 2 == 1){
System.out.println("This is an Odd Number.");
System.out.println("Odd Number: " + number);
}
else{
super.printNumber();
}
}
}