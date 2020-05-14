class MemberInnerClass {
public static void main(String[] args){
Monitor x = new Monitor();
x.size();
Monitor.Resolution b = x.new Resolution();
b.showResolution();

}
}

class Monitor {
void size(){
System.out.println("17 inch monitor");
}

	class Resolution {
	void showResolution(){
	System.out.println("The resoultion of the monitor is 1920*1480");
	}
	}
}
