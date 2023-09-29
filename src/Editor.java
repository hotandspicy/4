import java.util.*;
import action.*;


public class Editor {

	private String text = new String("");
	private Action lastAction;

	public String writeText(String textEntry) {
		this.text = this.text.concat(textEntry);
		lastAction = new Appendance(textEntry.length());
		return this.text;
	}

	public String shrinkText(int shrinkLength) {
		this.text = this.text.substring(0, this.text.length() - shrinkLength);
	//	lastAction = new Deletion(int from, int to);
		return this.text;
	}

	public Action getLastAction() {
		return this.lastAction;
	}

	public String getDocument() {
		return this.text;
	}
}
