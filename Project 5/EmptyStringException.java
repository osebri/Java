/*
@Author Omar Sebri 3722350
*/
public class EmptyStringException extends Exception{
    public EmptyStringException() {
        super("Empty String Exception");
    }
    public EmptyStringException(String message){
        super(message);
        }
}