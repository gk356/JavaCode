class AnonymousInnerClass {
public static void main(String[] args){

Monitor dell = new Monitor(){
void cost(){
System.out.println("The cost of Dell Monitor is $200.");
}
void screenSize(){
System.out.println("The dell screen size is 15.3 inch.");
}
};

dell.cost();
dell.screenSize();

}
}

abstract class Monitor {
abstract void cost();
abstract void screenSize();
}