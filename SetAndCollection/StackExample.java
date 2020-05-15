import java.util.*;

class StackExample {

public static void main(String[] args){

Stack<String> s = new Stack<String>();
s.push("John");
s.push("Sam");
s.push("Walmart");
s.push("Kroger");
s.push("Himalaya");
s.push("Okay");
s.push("Monday");
System.out.println(s);
s.pop();
System.out.println(s);
s.pop();
System.out.println(s);
System.out.println(s.peek());
System.out.println(s.empty());
s.pop();
s.pop();
s.pop();
s.pop();
System.out.println(s);
s.pop();
System.out.println(s.empty());
}
}