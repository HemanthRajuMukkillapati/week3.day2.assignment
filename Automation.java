package week3.day2.assignment;

public class Automation  extends MultipleLangauge {
	
// Automation implements both interfaces since MultipleLangauge class is an abstract class
// we can implement interfaces here because of multilevel Inheritance-->Automation-->MultipleLangauge implements both Interfaces

	public static void main(String[] args) {
		
		Language languageObject = new Automation();
		
		languageObject.Java();
		
		// here we are referring the language interface for accessing only Language specific methods
		
		TestTool testToolsObj = new Automation();
		
		testToolsObj.Selenium();

		// here we are referring the language interface for accessing only TestTool specific methods
		
		System.out.println("******************************************************************************");
		System.out.println("Can access all methods with an object created for implementation class");
		Automation automationObj = new Automation();
		
		automationObj.Java();
		automationObj.Selenium();
		automationObj.python();
		automationObj.ruby();
		
		}

		@Override
		public void Java() {
		System.out.println("this is a method from Language Interface");
		
		}

		@Override
		public void Selenium() {
		System.out.println("This is a method from TestTools Interface");
		
		}

		@Override
		public void ruby() {
		System.out.println("Unimplemnted method in Multiple languages class");
		
		}
}
