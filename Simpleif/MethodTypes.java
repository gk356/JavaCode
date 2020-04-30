class MethodTypes{
public static void main(String args[]){

Libary book1 = new Libary();
book1.booksList();
book1.chooseBook("Java-Book");
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

void chooseBook(String bookName){
System.out.println("You chose :" + bookName);
}

String askBook(){
return "Java Book";
}

String getBook(String idCard){
return "Library Receit";
}
}
