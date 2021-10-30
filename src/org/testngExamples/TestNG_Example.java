package org.testngExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//TestNg is useful for generating reports in combination with selenium webdriver
//One @Test annotation represents one test case.
//It must be rememebered that if there are more than one test case, then
//execution will happen in alphabetical order of the method names.
//There are other ways like setting priorities which will overcome the issue of order of execution.
//TestNG reports will be present in test-output folder. 
//It is possible to access reports in test-output folder in 3 
public class TestNG_Example {
	@BeforeClass //it is used for executing a method before any other test cases with @Test annotation are executed
	public void login() {
		System.out.println("Login completed");
	}

	@AfterClass //this annotation is used for executing the method after all the test cases with @Test annotation are executed.
	public void logout() {
		System.out.println("Logout completed");
	}
	@Test (priority = 2)
	public void addEmp() {
		System.out.println("emp added");
	}
	@Test (priority = 1 )//if we want to execute this testcase first then we can use priority
	public void delEmp() {
		System.out.println("emp deleted");
	}
}

