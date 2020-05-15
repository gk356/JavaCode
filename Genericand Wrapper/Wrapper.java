class Wrapper {
public static void main(String[] args){

Integer a =  new Integer(20);
int b = a;
int c = 30;
Integer d = new Integer(c);
Integer e = 10;
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println("------------");

float f = 3.24f;
Float g = new Float(f);
Float h = new Float(1.24f);
float j = h;
System.out.println(f);
System.out.println(g);
System.out.println(h);
System.out.println(j);
System.out.println("------------");

long num1 = 125;
Long num2 = new Long(num1);
Long num3 = 356l;
Long num4 = new Long(23154);
long num5 = num4;
System.out.println(num1);
System.out.println(num2);
System.out.println(num3);
System.out.println(num4);
System.out.println(num5);

}
}