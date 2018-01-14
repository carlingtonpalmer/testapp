package com.test.creator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.test.creator.SearchCrawler;

public class AutomatedTest {
	protected SearchCrawler searchCrawler = new SearchCrawler();
	private String url;
	private Document document;
	private Assertion assertion = new Assertion();

	// public static void main(String[] args) {
	public AutomatedTest() {
		System.out.println("Enter Url: ");
		Scanner input = new Scanner(System.in);
		url = input.next();
		input.close();
		System.out.println("Fetching Url...");
	}

	public void initialize() {
		try {
			document = Jsoup.connect(url).get();

			Elements buttons = document.select("button");
			Elements inputFields = document.select("input");
			Elements dropdowns = document.select("select > option");
			Elements links = document.select("a[href]");
			Elements required = document.getElementsByAttributeStarting("req");

			ArrayList<Element> textboxes = new ArrayList<Element>();
			ArrayList<Element> radios = new ArrayList<Element>();
			ArrayList<Element> checkboxes = new ArrayList<Element>();
			ArrayList<Element> textareas = new ArrayList<Element>();
			ArrayList<Element> submits = new ArrayList<Element>();
			ArrayList<Element> dates = new ArrayList<Element>();
			ArrayList<Element> emails = new ArrayList<Element>();
			ArrayList<Element> passwords = new ArrayList<Element>();

			for (Element button : buttons) {
				if (button.attr("type").equals("submit")) {
					submits.add(button);
				}
			}
			for (Element element : inputFields) {
				if (element.attr("type").equals("text")) {
					textboxes.add(element);
				} else if (element.attr("type").equals("radio")) {
					radios.add(element);
				} else if (element.attr("type").equals("checkbox")) {
					checkboxes.add(element);
				} else if (element.attr("type").equals("textarea")) {
					textareas.add(element);
				} else if (element.attr("type").equals("submit")) {
					submits.add(element);
				} else if (element.attr("type").equals("date")) {
					dates.add(element);
				} else if (element.attr("type").equals("email")) {
					emails.add(element);
				} else if (element.attr("type").equals("password")) {
					passwords.add(element);
				} else if (element.attr("type").equals("button")) {
					buttons.add(element);
				} else {
					System.out.println(
							"The form field '" + element.attr("name") + "' is outside the limitations of this test.");
				}
			}
			test(required);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void test(Elements elementSet) {
		searchCrawler.initialize();
		waitForElementVisible();
		searchCrawler.getUrl(url);
		waitForElementVisible();
		System.out.println("Title of Web Page: " + document.title() + "\n");
		for(Element element : elementSet) {
			if(element.attr("type").equals("text") || element.attr("type").equals("textarea")) {
				String enteredText = "Random Text";
				searchCrawler.setFormFieldContent(enteredText);
				String content = searchCrawler.getElementText(element.nodeName());
				assertion.softAssert(content, enteredText);
		} /*else if(element.attr("type").equals("checkbox")) {
			
			}*/ else {
				System.out.println("Test not conducted");
			}
		}
	}

	public void waitForElementVisible() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
