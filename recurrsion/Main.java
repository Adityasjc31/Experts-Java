package recurrsion;

// dunamicMethodDisptatch.java
class A{
	int x = 10;

	void callMe(){
		System.out.println("callMe() inside A");
	}
}

class B extends A{
	int x = 20;

	void callMe(){
		System.out.println("callMe() inside B");
	}
}

class C extends B{
	int x = 30;

	void callMe(){
		System.out.println("callMe() inside C");
	}
}

public class Main{
	public static void main(String agrs[]){
		A a = new A();
		B b = new B();
		C c = new C();

		B ref;

		ref = c;
		ref.callMe();
		System.out.println(ref.x);

		ref = b;
		ref.callMe();
		System.out.println(ref.x);

		ref = c;
		ref.callMe();
		System.out.println(ref.x);
	}
}