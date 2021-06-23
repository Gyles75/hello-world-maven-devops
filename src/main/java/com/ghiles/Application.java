package com.ghiles;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        System.out.println(app.sayHello("World"));
    }

    public String sayHello(String input) {
        return "Hello " + input + " !!!";
	}
}
