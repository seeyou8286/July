package Observor;

import java.util.Observable;
import java.util.Observer;

public class MyObservor implements Observer{

	public void update(Observable o, Object arg) {
		System.out.println("Updating");
	}

}
