class CubeNumber{
public static void main(String args[]){

int number = 370;
int remainder;
int sum = 0;


while(number > 0){
remainder = number % 10;
int cubeNumber = remainder*remainder*remainder;
sum = sum + cubeNumber;
number = number / 10;
}
System.out.println("The sum of the cube of the digit is " + sum);
}
}