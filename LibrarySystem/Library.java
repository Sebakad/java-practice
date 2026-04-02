public class Library{

//Attributes
private String libraryName;
private LibraryItem[] items;
private Member[] members;
private int itemCount;
private int memberCount;

//Constructor
public Library(String libraryName){
this.libraryName=libraryName;
items = new LibraryItem[20];
members= new Member[10];
itemCount=0;
memberCount=0;
}

//Adds item to the first empty index (Aggregation)
public boolean addItem(LibraryItem item){
if(itemCount<items.length){
items[itemCount++]=item;
return true;
}else {
return false;
}
}

//Adds a member to the first empty index (Aggregation)
public boolean registerMember(Member member){
if(memberCount<members.length){
members[memberCount++]=member;
return true;
}else{
return false;
}
}

//Loops through array to find the item based on the ID
public LibraryItem findItemById(int itemId){
if(itemCount!=0){//Checks is array not ampty
for(int i=0; i<itemCount ; i++){//loops through array
if(items[i]!=null && items[i].getItemId()==itemId){//Checks if item at index i exists and if the ID matches
return items[i];
}
}
}
return null;//returns null if array is empty
}

//Loops through array to find member based on ID
public Member findMemberById(int memberId){
if(memberCount!=0){//Checks is array not ampty
for(int i=0; i<memberCount ; i++){//loops through array
if(members[i]!=null && members[i].getMemberId()==memberId){//Checks if mamber at index i exists and if the ID matches
return members[i];
}
}
}
return null;//returns null if array is empty
}


//If item and member are satisfy all conditions preforms borrowing 
//Handles the Systems side of borrowing
public void borrowItem(int memberId , int itemId){
//Find the member
Member member = findMemberById(memberId);
//Find item
LibraryItem item = findItemById(itemId);
//Check if both exist
if(member== null){
System.out.println("Member not found!");
return;
}
if(item== null){
System.out.println("Item not found!");
return;
}
//Check availability
if(!item.isAvailable()){
System.out.println("Item id already checked out!");
return;
}
//Check if member can borrow
if(!member.canBorrow()){
System.out.println("Member already has 5 items! Return something first.");
return;
}
//Complete the borrow
item.borrowItem(member);
member.borrow(item);
System.out.println(member.getName()+" has successfully borrowed "+ item.getTitle());

}

//if member and item are found deletes item from members borrowedItem array
public void returnItem(int memberId , int itemId){
Member member= findMemberById(memberId);
LibraryItem item = findItemById(itemId);

if(member==null){
System.out.println("Member not found!");
return;
}
if(item==null){
System.out.println("Item not found!");
return;
}
member.returnItem(item);//Deletes item from borrowedItem array
item.returnItem();//Setts isCheckedOut to false
System.out.println(member.getName()+" returned "+ item.getTitle());
}


//Displays all items in the library
public void displayAllItems(){
if(itemCount==0){
System.out.println("No items in the library!");
return;
}
System.out.println("\n==== All Items ====");
for(int i=0; i<itemCount ;i++){
if(items[i]!=null){
items[i].displayInfo();
System.out.println("-------------------");
}
}
}


//Displays all members registered
public void displayAllMembers(){
if(memberCount==0){
System.out.println("No members registered!");
return;
}
System.out.println("\n==== All Members ====");
for(int i=0; i<memberCount; i++){
if(members[i]!=null){
System.out.println("Member Name: "+members[i].getName());
System.out.println("ID: "+ members[i].getMemberId());
members[i].displayInfo();
System.out.println("-------------------");
}
}
}

//Displays late fees 
public void displayLateFees(int daysLate){
System.out.println("\n==== Late Fees ====");
System.out.println("--"+daysLate+" days late ---");
for(int i=0;i<itemCount;i++){
if(items[i]!=null && !items[i].isAvailable()){
double fee = items[i].calculateLateFee(daysLate);
System.out.println("Item: "+items[i].getTitle()+", Late Fee: $"+fee);
}
}
}


}//end









