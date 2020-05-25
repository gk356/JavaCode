class MultiThreadRunnableExample {
public static void main(String[] args){
Loop l = new Loop();
Thread th = new Thread(l);
th.start();
for(int i = 0; i<10; i++){
System.out.println("Form Main: " + (i*3));
}

}
}

class Loop implements Runnable{
public void run(){
for(int i = 0; i<10; i++){
System.out.println("For thread: " + (i*5));
}

}
}