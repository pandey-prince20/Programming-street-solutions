

// Create the classes here
class GrandFather{
	static String grandFatherName;
	GrandFather(String name)
	{
		grandFatherName = name;
	}
}
class Father extends GrandFather{
	static String fatherName;
	Father(String grandFatherName, String fatherName)
	{
		this.grandFatherName = grandFatherName;
		this.fatherName = fatherName;
	}
class Son extends Father{
	static String sonName;
	Son(String grandFatherName, String fatherName, String sonName)
	{
		this.grandFatherName = grandFatherName;
		this.fatherName = fatherName;
		this.sonName = sonName;
	}
  static void printName()
	{
		System.out.println("sonname: "+this.sonName);
		System.out.println("fathername: "+ this.fatherName);
		System.out.println("grandfathername: "+ this.grandFatherName);
	}
}	

}
public class question29 {
 
	
	public static void main(String args[]) {
		
		// Write your code here
		Son s1 = new Son("Suresh","Ramesh","Saurabh");
		s1.printName();
	}
}

    

