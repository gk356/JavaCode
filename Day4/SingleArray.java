import java.util.Scanner;

class SingleArray{

public static void main(String[] args){
int arr[] = new int[5];
Scanner sc = new Scanner(System.in);

for(int i = 0; i<5; i++){
System.out.println("Enter the "+ (i+1) + " of an array");
arr[i] = sc.nextInt();
}
System.out.println();
System.out.println("Elements if an Array are: ");

for(int x: arr){
System.out.print(x + " ");
}
sc.close;
}
}