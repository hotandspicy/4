import action.*;

/* 1. Check the action.
 * 2. Call suitable Editor-method to undo the action on stack.
 */
public class Undo {
    
    public static String undo(Editor editor, Action action) {
        if(action instanceof Concatenation) {
            Concatenation tmpConcatenation = (Concatenation)action;
            return editor.shrinkText(tmpConcatenation.getStringLength());
        } else if(action == null)
            System.out.println("No history.");
            return editor.getDocument();
    }
}
