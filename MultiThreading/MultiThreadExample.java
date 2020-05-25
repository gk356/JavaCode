//Implementing Thread
class MultiThreadExample {
public static void main(String[] args){
Looping th = new Looping();
th.start();
for(int i = 0; i < 10; i++){
System.out.println("From Main: " + i);
}
}
}

class Looping extends Thread{
public void run(){
for(int i = 0; i < 10; i++){
System.out.println("From Thread: " + i);
}
}

}