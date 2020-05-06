class Abstract {
public static void main(String[] args){
Animal husky;
husky = new Dog();
husky.eat();
husky.breathe();
husky.move();

}
}

abstract class Animal{
abstract void eat();
abstract void breathe();
abstract void move();

}

class Dog extends Animal {
void eat(){
System.out.println("Dogs eats dog food.");
}

void breathe(){
System.out.println("Dogs breathe in oxygen and breathe out carbondioxide.");
}

void move(){
System.out.println("Dogs walks and runs.");
}


}