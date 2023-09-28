import java.util.*;
import action.*;

public class Writer {

	private String text = new String("");
	private Action lastAction;

	public String writeText(String textEntry) {
		System.out.print("> ");
		this.text = this.text.concat(textEntry);
		lastAction = new Appendance(textEntry.length());
		return this.text;
	}

	public String shrinkText(int itemsToShrink) {
		this.text = this.text.substring(0, this.text.length() - itemsToShrink);
		return this.text;
	}

	public Action getLastAction() {
		return this.lastAction;
	}

	public String getDocument() {
		return this.text;
	}
}
