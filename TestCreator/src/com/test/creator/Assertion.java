package com.test.creator;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertion {
	public void softAssert(String formField, String enteredText) {
		SoftAssert softAssertion = new SoftAssert();
		System.out.println("Soft assertion test starts here");
		softAssertion.assertEquals(formField, enteredText);
		System.out.println("Last line gets executed!");
		softAssertion.assertAll();
	}
	public void hardAssert(String formField, String enteredText) {
		System.out.println("Hard assertion test starts here");
		Assert.assertEquals(formField, enteredText);
		System.out.println("Last line gets executed!");
	}
}
