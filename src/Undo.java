import action.*;

/* 1. Check the action
 * 2. Call suitable Editor-method to undo
 */
public class Undo {
    
    public static String undo(Editor editor, Action action) {
        if(action instanceof Appendance) {
            Appendance tmpAppendance = (Appendance)action;
            return editor.shrinkText(tmpAppendance.getStringLength());
        } else if(action == null)
            System.out.println("No history.");
            return editor.getDocument();
    }
}
