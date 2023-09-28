import java.util.*;
import action.*;

public class Writer {

	private String text = new String("");
	private Action lastAction;

	public String writeText() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("> ");
		String textEntry = scan.nextLine();
		this.text = this.text.concat(textEntry);
		lastAction = new Appendance(textEntry.length());
		return this.text;
	}

	public Action getLastAction() {
		return this.lastAction;
	}
}
