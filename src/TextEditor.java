import java.util.*;

public class TextEditor {

	public static void main(String[] args) {
		
		//final String CLEARSCREEN = "\033[H\033[2J";
		final String COMMAND = String.format("%-10s %1s", "command", "> ");
		final String WRITE = String.format("%-10s %1s", "write", "> ");
		final String PROMPT= String.format("%-10s %1s", "", "> ");
		String document = new String();
		History history = new History();
		Editor editor = new Editor();
		Scanner scan = new Scanner(System.in);
		String menu = new String();
		while(true) {
			System.out.print(COMMAND);
			menu = scan.next();
			switch(menu) {
				case "w":
					System.out.print(WRITE);
					Scanner writeScanner = new Scanner(System.in);
					document = editor.writeText(writeScanner.nextLine());
					history.add(editor.getLastAction());
					System.out.println(PROMPT + document);
					break;
				case "u":
					document = Undo.undo(editor, history.back());
					
					if(!document.isEmpty())
						System.out.println(PROMPT + document);
					
					break;
				case "h":
					System.out.println(history.getHistoryOverview());
					break;
				case "q":
					scan.close();
					System.exit(1);
				default:
					System.out.println("No command.");
					break;
			}
		}

	}
}
