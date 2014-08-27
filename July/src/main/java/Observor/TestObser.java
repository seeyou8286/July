package Observor;

public class TestObser {
	public static void main(String[] args) {
		MyOberservale myob = new MyOberservale();
		myob.addObserver(new MyObservor());
		System.out.println(myob.countObservers());
		myob.setData(1);
		
	}

}
