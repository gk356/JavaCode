class IfElseLadder{

public static void main(String args[]){
System.out.println("*******Age for military*********");

int age = 25;

if(age < 18){
System.out.println("To young to join military.");

}
else if((age >= 18)  && (age <= 25)){
System.out.println("Perfect age to join military");
} 

else if((age >25) && (age <= 30)){
System.out.println("It's okay to join military at this age");
}
else{
System.out.println("Too old to join military");
}

}
}