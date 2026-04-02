public interface Borrowable{
//Interface: implemented by LibraryItem

   void borrowItem(Member member);
   void returnItem();
   boolean isAvailable();

}//end