class MultiplicationTable{
public static void main(String args[]){
System.out.println("Multiplication table of 5");

int x = 5;
int y = 1;
int num;
while(y <=10){
num = x * y;
System.out.println(x + " x " + y + " = " + num);
y++;
}

System.out.println("Multiplication table of 6");
for(int i = 1; i <= 10; i++){
int number = 6;
int result = 6*i;
System.out.println( number + " x " + i + " = " + result);
}
}
}