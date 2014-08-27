package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.BlockingQueue;

public class MyInvoicationHandler implements InvocationHandler{
	private Object obj = null;
	
	public Object bind(Object obj) {
		@SuppressWarnings("rawtypes")
		BlockingQueue bq = null;
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj
                .getClass().getInterfaces(), this);
    }
	

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("Starting proxing");
		Object temp = method.invoke(this.obj, args);
		return temp;	}

}
