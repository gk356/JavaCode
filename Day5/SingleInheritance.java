class SingleInheritance{
public static void main(String[] args){
Rectangle paper = new Rectangle(5, 6);
System.out.println("Area: "+ (paper.calculateArea()));
Cuboid c = new Cuboid(5, 5, 5);
System.out.println("Volume: "+ (c.calculateVolume()));
}
}

// Parent Class 
class Rectangle{
int length;
int breadth;

public Rectangle(int length, int breadth){
this.length = length;
this.breadth = breadth;
}

public int calculateArea(){
//System.out.println("Area of rectangle: "+ (length*breadth));
return (length * breadth);
}
}

// Child Class
class Cuboid extends Rectangle{
int height;

public Cuboid(int length, int breadth, int height){
super(length, breadth);
this.height = height;
}

public int calculateVolume(){
//System.out.println("Volume of cuboid: " + (calculateArea()*height));
return (calculateArea()*height);
}

}