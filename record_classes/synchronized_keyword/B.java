package recode_classes.synchronized_keyword;

class B 
{ 
	private ListenerTest mListener; // listener field 

	// setting the listener 
	public void registerListenerTest(ListenerTest mListener) 
	{ 
		this.mListener = mListener; 
	} 

	// my synchronous task 
	public void doGeekStuff() 
	{ 
		// perform any operation 
		System.out.println("Performing callback before synchronous Task"); 

		// check if listener is registered. 
		if (this.mListener != null) { 

			// invoke the callback method of class A 
			mListener.onGeekEvent(); 
		} 
	} 

	// Driver Function 
	public static void main(String[] args) 
	{ 
		B obj = new B(); 
		ListenerTest mListener = new A(); 
		obj.registerListenerTest(mListener); 
		obj.doGeekStuff(); 
	} 
} 