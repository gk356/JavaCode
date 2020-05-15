import java.util.*;

class LinkedListExample {
public static void main(String[] args){

LinkedList<Integer> li = new LinkedList<Integer>();

li.add(4);
li.add(10);
li.add(12);
li.add(21);
li.add(456);
li.add(213);
li.add(4587);
li.add(1);
li.add(2);

System.out.println(li);
li.removeFirst();
System.out.println(li);
li.removeLast();
System.out.println(li);
System.out.println("Size: " + li.size());
System.out.println("PollFirst: " + li.pollFirst());
System.out.println("Poll Last: " + li.pollLast());
}
}