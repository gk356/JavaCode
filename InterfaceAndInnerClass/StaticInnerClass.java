class StaticInnerClass {
public static void main(String[] args){
//Laptop x = new Laptop();
Laptop.Monitor a = new Laptop.Monitor();
a.size();
Laptop.Monitor.resolution();
}
}


class Laptop {
	static class Monitor{
		void size(){
		System.out.println("It is 15 inch monitor");
		}
		static void resolution(){
		System.out.println("Resolution is 1920 by 1680.");
		}
	}
}