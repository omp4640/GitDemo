
public class Methods {

	public static void main(String[] args) {
		Methods d=new Methods();
		d.getData();
		DemoMethods d1= new DemoMethods();
		d1.getUserData();
		Methods.data();

	}
	
	
	
	public String getData()
	{
		System.out.println("hello welcome");
		return "om";
	}
	
	public static void data()
	{
		System.out.println("This is static mathod");
	}

}
