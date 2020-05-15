import java.util.*;

class ArrayListExample {
public static void main(String[] args){

ArrayList<Integer> al = new ArrayList<Integer>();

al.add(2);
al.add(3);
al.add(23);
al.add(4);
al.add(1);
al.add(45);
al.add(20);
al.add(15);
al.add(36);
al.add(43);
System.out.println(al);
al.remove(5);
al.remove(8);
System.out.println(al);
Iterator<Integer> it = al.iterator();
for(int i =0; i < al.size(); i++){
System.out.println(it.next());
}
}
}