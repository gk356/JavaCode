class NestedIf{
public static void main(String args[]){
int num1 = 5;
int num2 = 10;
//int num3 = 15;
if ((num1 > 0) && (num2 > 0)){
System.out.println("Both numbers are greater than 0.");
if((num1%5 == 0) && (num2%5) == 0){
System.out.println("Numbers are divisible by 5.");

}
else{
System.out.println("Numbers are not divisiblle by 5.");
}
}else{
System.out.println("Number is less than 0.");
}

}
}