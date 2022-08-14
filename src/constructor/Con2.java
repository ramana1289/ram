package constructor;

public class Con2  {
	
	String name;
	public Con2(String name, String collegeName, String city, int rollNo) {
		super();
		this.name = name;
		this.collegeName = collegeName;
		this.city = city;
		this.rollNo = rollNo;
	}

	String collegeName;
	String city;
	int rollNo;
	
//	public Con2(String studentName, String studentCollegeName, String studentCityName, int studentrollNo)
//	{
//	      name         =studentName;	
//	      collegeName  =studentCollegeName;
//	      city         =studentCityName;
//	      rollNo       =studentrollNo;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Con2 obj =new Con2("ram","sitam","vizianagaram",21);
		System.out.println(obj.collegeName);
		System.out.println(obj.name);
		System.out.println(obj.city);
		System.out.println(obj.rollNo);
		
	}

	

}
