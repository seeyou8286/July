package DynamicProxy;



public class ProxyTester {
	

	public void testProxy(){
		MyInvoicationHandler myInvoicationHandler = new MyInvoicationHandler();
		Subject sub = (Subject)myInvoicationHandler.bind(new RealSubject());
		sub.say("OK", "James");
		
	}

}
