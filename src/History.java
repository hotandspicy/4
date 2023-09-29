import java.util.Iterator;
import java.util.Stack;
import action.*;

// Class will be used by class Editor
public class History {

	Stack<Action> actionStack = new Stack<Action>();

	public void add(Action action) {
		this.actionStack.push(action);
	}

	// The action instance returned will be checked by the class Undo 
	public Action back() {
		if(!actionStack.empty())
			return actionStack.pop();
		else
			return null;
	}
	
	public String getHistoryOverview() {
		int i = 1;
		StringBuffer buffer = new StringBuffer("");
		Iterator<Action> hisIterator = this.actionStack.iterator();

		// build overview
		while(hisIterator.hasNext()) {
			buffer.append(String.format(
				"%11s %3d. %s",
				"",
				i, 
				hisIterator.next().toString()));
			i++;
		}
		return buffer.toString();
	}
}
	
