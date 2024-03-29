package ie.itcarlow.Lab7;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: November 2021

public class Animal 
{
	//Variables
	private String type;
	private int age;
	private char gender;
	
	//Constructor
	public Animal(String type, int age, char gender) {
		setType(type);
		setAge(age);
		setGender(gender);
	}
	//Getters & Setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//Misc methods
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
	
	public void makeSound() {
		System.out.println("A generic animal sound");
	}
	
	//toString method
	@Override
	public String toString() {
		return "Animal [type=" + type + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

	
}
