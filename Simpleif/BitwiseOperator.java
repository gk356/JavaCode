public class BitwiseOperator{

public static void main(String args[]){

	int num1 = 20;
	int num2 = 10;

	int andBitwise = num1 & num2;
	int orBitwise = num1 | num2;
	int xorBitwise = num1 ^ num2;

	System.out.println("Bitwise And: "+ andBitwise);
	System.out.println("Bitwise Or: "+ orBitwise);
	System.out.println("Bitwise Xor: "+ xorBitwise);

}
}

