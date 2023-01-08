package recode_classes.synchronized_keyword;

class A implements ListenerTest { 

	@Override
	public void onGeekEvent() 
	{ 
		System.out.println("Performing callback after synchronous Task"); 
		// perform some routine operation 
	} 
	// some class A methods 
} 