package week3.day2;

public class Automation extends MultipleLanguage {

	public static void main(String[] args) {
		MultipleLanguage Mul = new MultipleLanguage();
		Mul.java("OOPS");
		Mul.javaScript("JaveScript");
		Mul.ruby("Ruby");
		Mul.python();
		Mul.selenium("Selenium");
		System.out.println("**************************");

		Language Mul1 = new MultipleLanguage();
		Mul1.javaScript("JavaScript");
		System.out.println("===============================");

		TestTool Mul2 = new MultipleLanguage();
		Mul2.selenium("Selenium");
	}
}
