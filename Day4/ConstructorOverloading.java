class ConstructorOverloading{
public static void main(String[] args){
Car car1 = new Car("Accord", 2014);
System.out.println();
Car car2 = new Car("Civic", 2011);
}
}

//Car class
class Car{

String companyName;
String model;
int makeYear;

Car(String companyName){
System.out.println("Company Name: " + companyName);
}

Car(String model, int makeYear){
this("Honda");
System.out.println("Car Model: " + model);
System.out.println("Make Year: " + makeYear);
}
}