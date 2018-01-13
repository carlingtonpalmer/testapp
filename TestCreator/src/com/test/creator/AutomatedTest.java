package com.test.creator;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class AutomatedTest {

	public static void main(String[] args) {
		System.out.println("Enter Url: ");
		Scanner input = new Scanner(System.in);
		String url = input.next();
		input.close();
		System.out.println("Fecting Url...");
		
		try {
			Document document = Jsoup.connect(url).get();
			System.out.println(document.title());
			//Elements links = document.select("a[href]");
			//Elements text = document.select("input");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
