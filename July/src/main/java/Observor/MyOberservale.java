package Observor;

import java.util.Observable;

public class MyOberservale extends Observable{
	
	private int data = 0;
	 
    public int getData() {
       return data;
    }
 
    public void setData(int i) {
       data = i;
       setChanged();
       notifyObservers();
    }

}
