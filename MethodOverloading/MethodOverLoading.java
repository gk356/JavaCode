class MethodOverLoading{
public static void main(String args[]){

Libary book1 = new Libary();
book1.booksList();

book1.chooseBook();
book1.chooseBook("Java-Book");
book1.chooseBook("Java-Book", "C++-Book");
book1.chooseBook("Java-Book", "C++-Book", "Python-Book");

String ask = book1.askBook();
System.out.println("You asked for: " + ask);
String reciet = book1.getBook("Gautam");
System.out.println("Here is your " + reciet);
}
}


class Libary{

void booksList(){
System.out.println("1. Java-Book");
System.out.println("2. Python-Book");
System.out.println("3. C++-Book");
System.out.println("4. Arts");
System.out.println("5. Math-Book");
}

void chooseBook(){
System.out.println("You did nnot choose any book");
}

void chooseBook(String bookName){
System.out.println("You chose :" + bookName);
}

void chooseBook(String bookName1, String bookName2){
System.out.println("You chose: " + bookName1 + " and " + bookName2);
}

void chooseBook(String bookName1, String bookName2, String bookName3){
System.out.println("You chose: " + bookName1 + " , " + bookName2 + " and " + bookName3);
}

String askBook(){
return "Java Book";
}

String getBook(String idCard){
return "Library Receit";
}
}
