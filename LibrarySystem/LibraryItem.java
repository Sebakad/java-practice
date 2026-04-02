public abstract class LibraryItem implements Borrowable{

//Attributes
   protected String title;
   protected int itemId;
   protected boolean isCheckedOut;

//Constructor
   public LibraryItem(String title,int itemId){
      this.title=title;
      this.itemId=itemId;
      isCheckedOut = false;
   }

//Getters
   public String getTitle(){
      return title;
   }

   public int getItemId(){
      return itemId;
   }

//Sets isCheckedOut to true (implementing Borrowable method)
   public boolean isAvailable(){
      return !isCheckedOut;
   }

//Stes isCheckedOut to false (implementing Borrowable method)
   public void returnItem(){
      isCheckedOut=false;
   }
   
//Handles the Item's side of borrowing 
   public void borrowItem(Member member){
      if(isAvailable()){
         isCheckedOut = true;
       }   
   }


//Abstract method(preforms polymorphism)
   public abstract double calculateLateFee(int daysLate);


//Diplays LibraryItem Info
   public void displayInfo(){
      System.out.println("Title: "+title);
      System.out.println("Item ID: "+itemId);
      if(isAvailable()){
         System.out.println("Availablity: available");
      }
      else{
         System.out.println("Availablity: not available");
      }
   }



}//end