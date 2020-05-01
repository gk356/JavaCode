class NestedLoop{
public static void main(String[] args){
	// First
	for(int i = 1; i <= 5; i++){
	for(int j = 1; j <= i; j++){
	System.out.print(j);
	}
	System.out.println();
	}

	System.out.println();
	//Second
	for(int i = 1; i <= 5; i++){
	for(int j = 1; j <= i; j++){
	System.out.print(i);
	}
	System.out.println();
	}
	//Third
	System.out.println();
	int  k= 0;
	for(int i = 1; i <= 5; i++){	
	for(int j = 1; j < i; j++){
	k = k+1;
	System.out.print(k+ " ");
	}
	System.out.println();
	}

	System.out.println();
	//Fourth
	for(int i = 5; i >= 1; i--){
	for(int j = 1; j <= i; j++){
	System.out.print(j+ " ");
	}
	System.out.println();
	}

	System.out.println();
	//Fifth
	for(int i = 1; i <= 5; i++){
	for(int j = 5; j >= i; j--){
	System.out.print(j+ " ");
	}
	System.out.println();
	}

	System.out.println();
	System.out.println("Homework Assignment");
	//Fifth
	for(int i = 1; i <= 5; i++){
	for(int j = i; j <= 5; j++){
	System.out.print(j+ " ");
	}
	System.out.println();
	}

	System.out.println();	

}
}