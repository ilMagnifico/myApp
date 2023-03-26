package myApp;

public class App {

	public String sayHello() {
		return "Hello";
	}

	public String sayHelloAndThat(String string) {
		return sayHello() + " " + string;
	}

}
