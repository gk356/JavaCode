import java.util.*;

class VectorExample{
public static void main(String[] args){
Vector<Double> ve = new Vector<Double>();
System.out.println(ve.size());
System.out.println(ve.isEmpty());
ve.add(2.4);
ve.add(3.5);
ve.add(4.2);
ve.add(3.1);
ve.add(87.12);
ve.add(45.21);
ve.add(40.4);
ve.add(1.2);
ve.add(1.21);
ve.add(21.21);
System.out.println(ve);
System.out.println("First Elements: " + ve.firstElement());
System.out.println("Last Elements: " + ve.lastElement());
ve.removeElementAt(ve.indexOf(87.12));
System.out.println(ve);
ve.removeAllElements();
System.out.println(ve);
System.out.println(ve.size());
System.out.println(ve.isEmpty());
}
}