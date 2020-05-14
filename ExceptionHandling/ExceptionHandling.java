import java.util.*;

// Exception handling
class ExceptionHandling {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
try{
System.out.print("Enter age of the father: ");
int fatherAge = sc.nextInt();
System.out.print("Enter age of the son: ");
int sonAge = sc.nextInt();
if(sonAge >= fatherAge){
throw new Exception("Son cannot be older than father.");
}
else{
int differenceAge = fatherAge - sonAge;
System.out.println("The father is "+ differenceAge + " years older than son.");
}
}
catch(Exception e){
e.printStackTrace();
e.getMessage();
}

finally{
sc.close();
}

}
}