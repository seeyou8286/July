package RelectionTutorial;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class DemoTest {
	
	

	public void testDemo() throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException{
		Class<Demo>  demo =	Demo.class;
		System.out.println(demo.getName());
		Class<Demo>  demo1 = (Class<Demo>) Class.forName("RelectionTutorial.Demo");
		System.out.println(demo1.getModifiers());
		System.out.println(demo1.getClassLoader().getClass().getName());
		Field[] fields = demo.getDeclaredFields();
		for(Field field:fields)
			System.out.println(field.getName());
		Method[] methods = demo.getDeclaredMethods();
		for(Method method:methods)
		{
			System.out.println(method.getName());
//			if(method.getModifiers() == 1)
			method.setAccessible(true);
			 method.invoke(Demo.class.newInstance(), null);
		}
		
	}
	
//	@Test
	public void testLoad() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
//		Class demo =Class.forName("RelectionTutorial.Demo");		
//		Class demo =Demo.class;
//		demo.newInstance();
//		new Demo();
//		System.out.println(demo.);
		MyClassLoader myClassLoader = new MyClassLoader();
		myClassLoader.loadClass("RelectionTutorial.Demo").newInstance();

		
		 Constructor<?> cons[]=Demo.class.getConstructors();
		 for(Constructor con:cons){
			 System.out.println(con);
			 System.out.println(con.getParameterTypes().length);
		 }
		 Demo mo = (Demo) cons[0].newInstance("BBB");
		
		 mo.getName();
		 Demo.class.newInstance();
		 
		 Class[] classes = Demo.class.getInterfaces();
		 for(Class cl:classes){
			 System.out.println(cl.getName());
		 }
		 Class classes2 = Demo.class.getSuperclass();
		 System.out.println(classes2.getName());
	}
	
	
//	@Test
	public void testChangeFields() throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
		Demo demo = new Demo();
		Field field = demo.getClass().getDeclaredField("name");
		field.setAccessible(true);
		field.set(demo, "Tom");
		demo.getName();
		
		
	}

}
