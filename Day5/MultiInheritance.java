class MultiInheritance {
public static void main(String[] args){
Human person1 = new Human(true);
System.out.println("Do they brain: " +person1.move());
System.out.println("Number of hearts Chambered" +person1.hasHeart());

System.out.println("Social: " + person1.areSocial());
}
}

class Animal{
String brain;

public Animal(String brain){
this.brain = brain;
}

public String move(){
System.out.println("All Animals have brain of some kind");
return brain;
}
}

class Mammals extends Animal{
String mamaryGland;
int heart;

public Mammals(String mamaryGland, int heart){
super("Yes, all mammals have brain.");
this.mamaryGland = mamaryGland;
this.heart = heart;
}

public int hasHeart(){
//System.out.println("Yes all mammals have four chambered heart.");
return heart;
} 
}

class Human extends Mammals{
boolean socialAnimal;

public Human(boolean socialAnimal){
super("Yes", 4);
this.socialAnimal = socialAnimal;
}

public boolean areSocial(){
return socialAnimal;

}
}