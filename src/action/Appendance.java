package action;

// Hold information of appendance/concatination of text
public class Appendance extends Action {

    private String actionType = "append";
    
    private int stringLength = 0;

    public Appendance(int stringLength) {
        this.stringLength = stringLength;
    }

    public void setStringLength(int stringLength) {
        this.stringLength = stringLength;
    }

    public int getStringLength() {
        return this.stringLength;
    }

    public String toString() {
        return String.format("%7s %10s | written chars: %6d \n", "type:", actionType, this.stringLength);
        }
}