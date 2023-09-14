public class InvalidSequenceTermException extends Exception{
    public InvalidSequenceTermException() {
        super("Invalid term");
    }
    public InvalidSequenceTermException(String message){
        super(message);
        }
}