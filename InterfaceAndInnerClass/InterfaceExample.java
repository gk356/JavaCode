//Main Class 
class InterfaceExample {
public static void main(String[] args){
Mobile a = new Iphone();
a.chip();
a.powerSupply();
a.call();
a.text();
System.out.println("-------------------");
a = new Samsung();
a.chip();
a.powerSupply();
a.call();
a.text();
System.out.println("-------------------");
Laptop b = new Macbook();
b.chip();
b.powerSupply();
b.wordProcessing();
b.writingProgram();
System.out.println("-------------------");
b = new Lenovo();
b.chip();
b.powerSupply();
b.wordProcessing();
b.writingProgram();

}
}

// Interface Class
interface Electronic {
void chip();
void powerSupply();
}

// Abstract class Definition
abstract class Mobile implements Electronic{
void call(){
System.out.println("All mobile can make call.");
}
void text(){
System.out.println("All mobile can text.");
}
}

// Abstract class Definition
abstract class Laptop implements Electronic {
void wordProcessing(){
System.out.println("All laptops are used for word processing.");
}

void writingProgram(){
System.out.println("All laptops are used to write code and program.");
}
}

// Class definition
class Iphone extends Mobile {
public void chip(){
System.out.println("Iphone uses 64-bit RAM with A11 Bionic Chip.");
}

public void powerSupply(){
System.out.println("Iphone uses 5W USB power adapter and lithium-ion battery.");
}
}

// Class definition
class Samsung extends Mobile {
public void chip(){
System.out.println("Samsung uses 64-bit RAM with Exynos Chip.");
}

public void powerSupply(){
System.out.println("Samsung uses 6-W USB power adapter and lithium-ion battery.");
}
}

//class definition
class Macbook extends Laptop {
public void chip(){
System.out.println("Macbook uses 64-bit RAM with Apple T2 Security Chip.");
}

public void powerSupply(){
System.out.println("Macbook uses 29W or 30W USB-C power adapter to charge a battery.");
}

}
//class definition
class Lenovo extends Laptop {
public void chip(){
System.out.println("Lenovo uses 64-bit RAM with Intel i9 Chip.");
}

public void powerSupply(){
System.out.println("Lenovo uses 90W to 170W USB power adapter to charge a battery.");
}
}
