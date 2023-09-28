import java.util.Iterator;
import java.util.Stack;
import action.*;

public class History {

	Stack<Action> actionStack;

	public History() {
		this.actionStack = new Stack<Action>();
	}

	
	public void add(Action action) {
		this.actionStack.push(action);
	}

	public Action back() {
		if(!actionStack.isEmpty())
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
			buffer.append(String.format("%3d. %s", i, hisIterator.next().toString()));
			i++;
		}
		return buffer.toString();
	}
}
	
