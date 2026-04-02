public class Book extends LibraryItem{

//Attributes
   private String author;
   private int pageCount;

//Constructor
   public Book(String title, int itemId ,String author,int pageCount){
      super(title,itemId);
      this.author=author;
      this.pageCount=pageCount;
   }

//Calculates late fee by charging $0.5 for every day that its late (implementing an abstract method)
@Override
   public double calculateLateFee(int daysLate){
      double cost = daysLate* 0.5;
      return cost;
   }

//Overriding displayInfo from super class LibraryItem
   @Override
   public void displayInfo(){
      super.displayInfo();
      System.out.println("Author: "+author);
      System.out.println("Page Count: "+pageCount);
   }


}//end