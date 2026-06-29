//It is validationException class which is used to handle the exception in the program.
public class ValidationException extends Exception 
{
    public ValidationException(String message) {
        super(message);
    }
}

class EmailValidationException extends ValidationException {
    public EmailValidationException(String message) {
        super(message);
    }
}

class EmployeeValidationException extends ValidationException {
    public EmployeeValidationException(String message) {
        super(message);
    }
}