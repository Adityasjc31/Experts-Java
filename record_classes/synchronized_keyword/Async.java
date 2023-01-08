package recode_classes.synchronized_keyword;

class Async implements OnGeekEventListener { 
  
    @Override
    public void onGeekEvent() 
    { 
        System.out.println("Performing callback after Asynchronous Task"); 
        // perform some routine operation 
    } 
    // some class A methods 
} 