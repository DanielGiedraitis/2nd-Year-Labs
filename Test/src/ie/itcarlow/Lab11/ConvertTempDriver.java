package ie.itcarlow.Lab11;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: November 2021

import javax.swing.JFrame;

public class ConvertTempDriver {

	public static void main(String[] args) 
	{
		ConvertTemp  convertTemp = new ConvertTemp("Temperature Conversion");
		convertTemp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		convertTemp.setSize(200, 75);
		convertTemp.setLocation(500,400);
		convertTemp.setVisible(true);

	}//end main

}//end class
