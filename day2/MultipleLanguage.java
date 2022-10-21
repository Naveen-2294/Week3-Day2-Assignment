package week3.day2;

public class MultipleLanguage implements Language, TestTool {

	public void java(String languageName) {
		// TODO Auto-generated method stub
		System.out.println("The Language Name is " + languageName);
	}

	public void javaScript(String Details) {
		// TODO Auto-generated method stub
		System.out.println("The Script is Called as " + Details);

	}

	public void ruby(String Details) {
		// TODO Auto-generated method stub
		System.out.println("This is one of the Language Called as " + Details);

	}

	public void selenium(String ToolName) {
		// TODO Auto-generated method stub
		System.out.println("To AutoMate the web Application we can use " + ToolName);
	}

	public void python() {
		System.out.println("This is one of the Advanced Programming Language");
	}

}
