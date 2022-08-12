package booksystem;

public class Book {
	
private int bookId;
private String bookName;
private double bookPrice;



	public int getBookId() {
	return bookId;
}



public void setBookId(int bookId) {
	this.bookId = bookId;
}



public String getBookName() {
	return bookName;
}



public void setBookName(String bookName) {
	this.bookName = bookName;
}



public double getBookPrice() {
	return bookPrice;
}



public void setBookPrice(double bookPrice) {
	this.bookPrice = bookPrice;
}


public Book(int bookId,String bookName,double bookPrice) {
	super();
	this.bookId=bookId;
	this.bookName=bookName;
	this.bookPrice=bookPrice;
	
}

public Book() {
	super();
	// TODO Auto-generated constructor stub
}





@Override
public String toString() {
	
	return "Book [bookId=" + bookId + ", bookName=" 
+ bookName + ", bookPrice=" + bookPrice + "]";
	
   }


}



	