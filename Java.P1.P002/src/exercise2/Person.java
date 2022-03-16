/*Fresher training 2022
*Author ToanPDT
*Date Mar 15, 2022
*Study assignment
*/
package exercise2;

public class Person {
	private String name;
	private int age;
	private int ID;
	
	public Person() {
		
	}
	public Person(String name, int age, int ID) {
		this.name = name;
		this.age = age;
		this.ID = ID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setID(int id) {
		this.ID = id;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getID() {
		return ID;
	}
}
