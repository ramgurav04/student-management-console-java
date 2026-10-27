public class InvalidStudentDataException extends Exception {
    public InvalidStudentDataException(String msg) {
        super(msg); // passes message to Exception so e.getMessage() works
    }
}
