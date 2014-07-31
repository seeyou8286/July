package RelectionTutorial;

public class Demo implements DemoInterface {
	public static String Age;
	
	static {
		System.out.println("Step1 static");
		System.out.println("Step1 age"+Age);
		System.out.println("Step1" +gender);
	}
	
	
	public Demo(String name){
		this.name = name;
	}
	
	public Demo(){
		
	}
	

	
	private String name = "James";
	private Integer size = 1;
	
	
	public void getName(){
		System.out.println(name);
	}
	
	private void getSize(){
		System.out.println(size);
	}
	
	protected void getNameAndSize(){
		System.out.println(name+size);
	}

}
