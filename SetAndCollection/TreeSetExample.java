import java.util.*;

class TreeSetExample{
public static void main(String[] args){

TreeSet<Integer> ts = new TreeSet<Integer>();
ts.add(80);
ts.add(20);
ts.add(90);
ts.add(50);
ts.add(10);
ts.add(70);
ts.add(40);
ts.add(60);
ts.add(30);

System.out.println(ts.contains(60));
System.out.println(ts.first());
System.out.println(ts.last());

System.out.println(ts.pollFirst());
System.out.println(ts.pollLast());
}
}