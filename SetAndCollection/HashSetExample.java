import java.util.*;

class HashSetExample {
public static void main(String[] args){
HashSet<String> hs =  new HashSet<String>();

hs.add("Java");
hs.add("Python");
hs.add("C++");
hs.add("C#");
hs.add("C-Lang");
hs.add("PHP");
hs.add("JavaScript");
hs.add("HTML");

System.out.println("Original Set: " + hs);

HashSet hashSet = new HashSet();
hashSet = (HashSet)hs.clone();
System.out.println("Cloned hash set : " +hashSet);

hs.remove("PHP");
hs.remove("HTML");
System.out.println("Original Set: " + hs);

hashSet.remove("C++");
hashSet.remove("C#");
System.out.println("Cloned hash set : " +hashSet);

Iterator<String> it = hs.iterator();

for(int i=0; i< hs.size(); i++){
System.out.println(it.next());
}


}
}