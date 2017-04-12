package adapter.main;

import adapter.model.Print;
import adapter.model.PrintBanner;

public class App {
	public static void main(String[] args) {
		Print banner = new PrintBanner("凤姐");
		banner.printHow();
		banner.printOneNightHowMuch();
	}
}
