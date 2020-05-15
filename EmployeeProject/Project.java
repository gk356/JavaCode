import java.util.*;

class Project {
public static void main(String[] args) throws ArrayIndexOutOfBoundsException{

// Initializing arrays 
String[] empNo = {"1001", "1002", "1003", "1004", "1005", "1006", "1007"};
String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
char[] designationCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};

int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
int [] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

// Command line argumenets
String userInput = args[0];

//giving default value
boolean exist = false;
int index = 10; 

// Checking whether the user input is the array 
for(int i = 0; i < empNo.length; i++){
	if(Objects.equals(empNo[i],userInput)){
	exist = true;
	index = i;
	}
}

// assigning default value to the varibale 
// saving data in corresponding variable
String empId = "", name = "", date = "", depart= "";
char dCode = 'e';
int basicSalary =0, h=0, iT=0, da = 0;
String designation = "";

// Checking if the index outof bound and if the value is in array
// if not print prompt or if present then assign it to resepctive variable 
if(index > 6 && exist == false){
System.out.println("There is no employee with empid: " + userInput);
}
else{
empId = empNo[index];
name = empName[index];
date = joinDate[index];
dCode = designationCode[index];
depart = department[index];
basicSalary = basic[index];
h = hra[index];
iT = it[index];
}

// Switch case to get the designation and da from designation code
switch(dCode){
case 'e':
designation = "Engineer";
da = 20000;
break;

case 'c':
designation = "Consultant";
da = 32000;
break;

case 'k':
designation = "Clerk";
da = 12000;
break;

case 'r':
designation = "Receptionist";
da = 15000;
break;

default:
designation = "Manager";
da = 40000;
}

// Calculating Salary
int salary = basicSalary + h + da -iT;

// Printing result to the user
if(exist ==true){
System.out.println("Emp No.    " + "Emp Name    " + "Department    " + "Designation     " + "Salary     ");
System.out.println(" "+ empId + "      " + name + "         " + depart + "         " + designation + "         " + salary);
}

}
}