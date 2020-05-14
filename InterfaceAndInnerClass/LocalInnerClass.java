class LocalInnerClass {
public static void main(String[] args){
Monitor a = new Monitor();
a.size();

}
}

class Monitor {
	void size(){
	System.out.println("25 inch curved UHD monitor");
	class Resolution {
		void showResolution(){
		System.out.println("The resolution of this monitor is 4k");
		}
	    }
	Resolution b = new Resolution();
	b.showResolution();
	}

}