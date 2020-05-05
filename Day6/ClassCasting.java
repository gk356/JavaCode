class ClassCasting{
public static void main(String[] args){
System.out.println("Object car created of class Parking");
Parking car = new Parking();
car.parkCar();

System.out.println();
System.out.println("Object car is now referenced to Ground Parking Class");
car = new GroundParking();
car.parkCar();

System.out.println();
System.out.println("Object car is now referenced to  UnderGround Parking Class");
car = new UnderGroundParking();
car.parkCar();

}
}

class Parking{
public void parkCar(){
System.out.println("Vechicle should be parked in Ground parking or UnderGround parking");
}
}

class GroundParking extends Parking{
public void parkCar(){

System.out.println("Vechile is parked at ground parking.");

}
}

class UnderGroundParking extends Parking{
public void parkCar(){

System.out.println("Vechile is parked at under ground parking.");

}
}