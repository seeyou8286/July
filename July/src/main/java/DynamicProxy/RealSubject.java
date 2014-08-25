package DynamicProxy;

public class RealSubject implements Subject{

	public void say(String words, String name) {
		System.out.println(name + " says "+ words);
	}

}
