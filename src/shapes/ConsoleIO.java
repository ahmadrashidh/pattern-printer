package shapes;

import java.util.Scanner;

@ClassPreamble(
		author= "ahmad",
		date = "12 April 2020",
		currentRevision = 6,
		reviewers = {"James","Karthick"}
		)
public class ConsoleIO {

	private static Scanner scan;

	private static ConsoleIO console;

	private ConsoleIO() {
	}

	public static ConsoleIO getInstance() {
		if (console == null) {
			console = new ConsoleIO();
		}
		return console;
	}

	public static Scanner getScanner() {
		if (scan == null) {
			scan = new Scanner(System.in);
		}
		return scan;
	}

	protected int readChoiceFromUser(String promptText) {

		int choice;

		System.out.println(promptText);

		Scanner scan = ConsoleIO.getScanner();

		choice = scan.nextInt();

		return choice;
	}

	protected void print(String value) {

		System.out.println(value);
	}

	public void closeScanner() {

		if (scan != null) {
			scan.close();
		}

	}
}
