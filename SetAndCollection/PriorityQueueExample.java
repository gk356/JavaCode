import java.util.*;

class PriorityQueueExample {
public static void main(String[] args){
PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

pq.add(10);
pq.add(20);
pq.add(30);
pq.add(40);
pq.add(50);
pq.add(60);
pq.add(70);
pq.add(80);
pq.add(90);
System.out.println(pq);

pq.remove(90);
System.out.println(pq);
System.out.println(pq.contains(50));
pq.remove(50);
System.out.println(pq.contains(50));
Iterator<Integer> it = pq.iterator();

for(int i = 0; i< pq.size(); i++){
System.out.println(it.next());
}

}
}