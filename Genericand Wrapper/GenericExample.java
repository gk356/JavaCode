class GenericExample {
public static void main(String args[]){

Calculator<Integer> a = new Calculator<Integer>(8,4);
System.out.println("Sum: " + a.addition());
System.out.println("Difference: " + a.substraction());
System.out.println("Multiplication: " + a.multiply());
System.out.println("Division: " + a.divide());
System.out.println("------------------");

Calculator<Double> b = new Calculator<Double>(51.15,12.21);
System.out.println("Sum: " + b.addition());
System.out.println("Difference: " + b.substraction());
System.out.println("Multiplication: " + b.multiply());
System.out.println("Division: " + b.divide());
System.out.println("------------------");
}
}

// Generic calcultor Class for integer and double
// add, minus, multiply and divide
class Calculator<T extends Number>{
T num1;
T num2;

public Calculator(T num1, T num2){
this.num1 = num1;
this.num2 = num2;
}

public T getNum1(){
return num1;
}

public T getNum2(){
return num2;
}


public <T extends Number> T addition(){
if(this.num1 instanceof Integer && this.num2 instanceof Integer){
return (T)(Integer)((Integer)num1 + (Integer)num2);
}
else if(this.num1 instanceof Double && this.num2 instanceof Double){
return (T)(Double)((Double)num1 + (Double)num2);
}
else{
return (T)(Integer)0;
}
}

public <T extends Number> T substraction(){
if(this.num1 instanceof Integer && this.num2 instanceof Integer){
return (T)(Integer)((Integer)num1 - (Integer)num2);
}
else if(this.num1 instanceof Double && this.num2 instanceof Double){
return (T)(Double)((Double)num1 - (Double)num2);
}
else{
return (T)(Integer)0;
}
}

public <T extends Number> T multiply(){
if(this.num1 instanceof Integer && this.num2 instanceof Integer){
return (T)(Integer)((Integer)num1 * (Integer)num2);
}
else if(this.num1 instanceof Double && this.num2 instanceof Double){
return (T)(Double)((Double)num1 * (Double)num2);
}
else{
return (T)(Integer)0;
}
}

public <T extends Number> T divide() throws ArithmeticException{
if(this.num1 instanceof Integer && this.num2 instanceof Integer){
return (T)(Integer)((Integer)num1 / (Integer)num2);
}
else if(this.num1 instanceof Double && this.num2 instanceof Double){
return (T)(Double)((Double)num1 / (Double)num2);
}
else{
return (T)(Integer)0;
}
}

}