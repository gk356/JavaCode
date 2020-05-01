import java.util.Scanner;
class TwoDimensionalArray{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of rows: ");
int m = scanner.nextInt();
System.out.println("Enter the number of columns: ");
int n = scanner.nextInt();

int arr[][] = new int[m][n];

for(int i = 0; i<m; i++){
for(int j = 0; j < n; j++){
System.out.println("Enter the arr[" + i +"]["+j+"] elements of that array");
arr[i][j] = scanner.nextInt();
}
}
System.out.println();
System.out.println("The elements of Two dimensional Array: ");
for(int i = 0; i<m; i++){
for(int j = 0; j < n; j++){
System.out.print(arr[i][j] + " ");
}
System.out.println();
}
Sc.close();
}
}