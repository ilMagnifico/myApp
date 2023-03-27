package app;


public class App {

	public String sayHello() {
		return "Hello";
	}

	public String sayHelloAndThat(String string) {
		return string==null?"Hello":sayHello() + " " + string;
	}

}
