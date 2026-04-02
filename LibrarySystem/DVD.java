public class DVD extends LibraryItem{

//Attributes
   private String director;
   private int durationMinutes;

//Constructor
   public DVD(String title,int itemId , String director  ,int durationMinutes){
      super(title,itemId);
      this.director=director;
      this.durationMinutes=durationMinutes;
   }

//Calculates late fee by charging $1.0 for every day that its late (implementing an abstract method)
   @Override
   public double calculateLateFee(int daysLate){
      return daysLate;
   }

//Overriding displayInfo from super class LibraryItem
@Override
   public void displayInfo(){
      super.displayInfo();
      System.out.println("Director: "+director);
      System.out.println("Duration: "+durationMinutes+" minutes");
   }



}//end
