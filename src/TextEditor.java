import java.util.*;

public class TextEditor {

	public static void main(String[] args) {
		
		//final String CLEARSCREEN = "\033[H\033[2J";
		final String COMMAND = "c> ";
		final String PROMPT =" > ";
		String document = new String();
		History history = new History();
		Writer writer = new Writer();
		Scanner scan = new Scanner(System.in);
		String menu = new String();
		while(true) {
			System.out.print(COMMAND);
			menu = scan.next();
			switch(menu) {
				case "w":
					System.out.print(PROMPT);
					Scanner writeScanner = new Scanner(System.in);
					document = writer.writeText(writeScanner.nextLine());
					history.add(writer.getLastAction());
					System.out.println(document);
					break;
				case "u":
					document = Undo.undo(writer, history.back());
					System.out.println(document);
				case "h":
					System.out.println(history.getHistoryOverview());
					break;
				case "q":
					scan.close();
					System.exit(1);
				default:
					System.out.println("no command");
					break;
			}
		}

	}
}
