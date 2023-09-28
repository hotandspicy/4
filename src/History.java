import java.util.Iterator;
import java.util.Stack;
import action.*;

public class History {

	Stack<Action> stack;

	public History() {
		this.stack = new Stack<Action>();
	}

	
	public void add(Action action) {
		this.stack.push(action);
	}

	public String getHistoryOverview() {
		int i = stack.size();
		StringBuffer buffer = new StringBuffer("");
		Iterator<Action> hisIterator = this.stack.iterator();
		while(hisIterator.hasNext()) {
			buffer.append(String.format("%3d. %s", i, hisIterator.next().toString()));
			i--;
		}
		return buffer.toString();
	}
}
	
