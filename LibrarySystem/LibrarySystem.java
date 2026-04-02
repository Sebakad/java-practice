public class LibrarySystem{
public static void main (String[]args){

//Creating a library
Library library = new Library("Central Library");

//Creating Books
Book b1 = new Book("Java-A Beginner's Guide",101,"Herbert Schildt",400);
Book b2 = new Book("C++ Programming",103,"John Doe",500);
Book b3 = new Book("Data Structures",112,"Jane Doe",350);

//Creating DVDs
DVD d1 = new DVD("The Lion King",200,"Roger Allers - Rob Minkoff",89);
DVD d2 = new DVD("The Matrix",202,"Wachowski",136);

//Registering Members
Member m1 = new Member("Seba Kadasah", 1003);
Member m2 = new Member("Nourah Ali", 1008);

//Adding Items(books & dvds) to library
library.addItem(b1);
library.addItem(b2);
library.addItem(b3);
library.addItem(d1);
library.addItem(d2);

//Adding members to the library
library.registerMember(m1);
library.registerMember(m2);

//Displaying Items and Members
library.displayAllItems();
library.displayAllMembers();

//Testing Borrowing 
library.borrowItem(1003,101);//Seba borrows Java-A Beginner's Guide
library.borrowItem(1008,200);//Nourah borrows The Lion King
library.borrowItem(1008,112);//Nourah borrows Data Structures

//Displaying Items and Members after borrowing
library.displayAllMembers();
library.displayAllItems();

//Testing Late Fee Calculation
library.displayLateFees(3);//all borrowed items are 3 days due

//Testing returning items
System.out.println("\n---- Returning Items ----");
library.returnItem(1008,112);//Nourah returns Data Structures


//Displaying Items and Members after returning 
System.out.println("\n---- Final Library State ----");
library.displayAllMembers();
library.displayAllItems();

}

}//end