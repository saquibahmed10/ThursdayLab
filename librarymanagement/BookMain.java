package booksystem;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		BookService bservice=new BookService();
		
		do {
			System.out.println("welcome to book management System");
			System.out.println("=================================");
			System.out.println("press 1 for create book details \n 2 get book details"
					+ " by id\n3. get all book details\n4 update book by Id"
					+ "\n5 quit.");
			System.out.println("===========================================");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice)
			   {
			   case 1:
				    bservice.createBook();
				    System.out.println("=================");
				    break;
			   case 2:	bservice.getBookById();
			        System.out.println("==========================");
		        	break;
			   case 3: bservice.getAllBookDetails();
			        System.out.println("=================");
			        break;
			   case 4: 
				      bservice.upBookById();
				      System.out.println("=======================");
				      break; 
				      
			   case 5:break;
			   
			   default:System.out.println("enter correct choice!");
			         
			}
		}while(choice!=5);
       System.out.println("Thanks for visit!!");
	}

}
