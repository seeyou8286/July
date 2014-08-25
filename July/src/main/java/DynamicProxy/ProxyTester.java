package DynamicProxy;

import org.junit.Test;

public class ProxyTester {
	
	@Test
	public void testProxy(){
		MyInvoicationHandler myInvoicationHandler = new MyInvoicationHandler();
		Subject sub = (Subject)myInvoicationHandler.bind(new RealSubject());
		sub.say("OK", "James");
		
	}

}
