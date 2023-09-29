package action;

// Hold information about string concatenation
public class Concatenation extends Action {

    private static String actionType = "concat";
    
    private int stringLength = 0;

    public Concatenation(int stringLength) {
        this.stringLength = stringLength;
    }

    public void setStringLength(int stringLength) {
        this.stringLength = stringLength;
    }

    public int getStringLength() {
        return this.stringLength;
    }

    public String toString() {
        return String.format(
            "%7s %10s | written chars: %6d \n", "type:"
            , actionType, 
            this.stringLength);
        }
}