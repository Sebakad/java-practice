public class Member {

//Attributes
   private String name;
   private int memberId;
   private LibraryItem[] borrowedItem;
   private int itemCount;

//Constructor
   public Member(String name, int memberId){
      this.name=name;
      this.memberId=memberId;
      borrowedItem = new LibraryItem[5];
      itemCount=0;
   }

//Getters

   public String getName(){
      return name;
   }

   public int getMemberId(){
      return memberId;
   }

//Checks if the member can borrow an item, borrowed items can't exceed 5 items
   public boolean canBorrow(){
      if(itemCount<5){
         return true;
      }else{
         return false;
      }
   }

//Preforms borrowing by adding an item to the members borrowedItem array
   public boolean borrow(LibraryItem item){
      if(canBorrow()){//I dont need to check if it less the length cause can borrow does that!
         borrowedItem[itemCount++]=item;
         return true;
      }else {
         return false;
      }
   }

//Preforms returns item by deleting it from borrowedItem array 
   public boolean returnItem(LibraryItem item){
      if(itemCount>0){
         for(int i=0; i<itemCount;i++){
            if(borrowedItem[i].equals(item)){
               borrowedItem[i]= null;// removes item
            //shifting the items left
               for(int j=i; j< itemCount-1 ;j++){
                  borrowedItem[j]=borrowedItem[j+1];
               }
               borrowedItem[itemCount-1]=null;
               itemCount--;
               return true;
            }
         }
      }
      return false;
   }

//Displays the title of a borrowed item
   public void displayInfo(){
      for(int i=0; i<itemCount;i++){
         if(borrowedItem[i]!=null){
            System.out.println("Title: "+borrowedItem[i].getTitle());
         }
      }
   
   }


}//end
