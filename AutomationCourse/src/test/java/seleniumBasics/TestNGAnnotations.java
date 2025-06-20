package seleniumBasics;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
	@Test
public void testcase()
{
	System.out.println("Test case");
}
	@BeforeMethod
	public void BeforeMethodAnnotation()
	{
		System.out.println("Before Method Annotation");// before method will be executing first or before @test.
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Aftre Method");
	}
	@BeforeMethod
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@AfterMethod
	public void afterTest()
	{
		System.out.println("After Test");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
}


