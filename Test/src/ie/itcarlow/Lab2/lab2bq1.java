package ie.itcarlow.Lab2;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: October 2021

public class lab2bq1 
{

	public static void main(String[] args) 
	{
		Rectangle box = new Rectangle();
		
		System.out.println("Default Length: " + box.getLength());
		System.out.println("Default Width: " + box.getWidth());
		System.out.println(box);
		
		System.out.println();
    	
    	box.setLength(5);
    	box.setWidth(10);
    	System.out.println("Length: " + box.getLength());
		System.out.println("Width: " + box.getWidth());
    	
    	System.out.println(box.toString());
	}

}
