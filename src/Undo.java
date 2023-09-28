import action.*;

public class Undo {
    
    public static String undo(Writer writer, Action action) {
        if(action instanceof Appendance) {
            Appendance tmpAppendance = (Appendance)action;
            return writer.shrinkText(tmpAppendance.getStringLength());
        } else if(action == null)
            System.out.println("End of history.");
            return writer.getDocument();
    }
}
