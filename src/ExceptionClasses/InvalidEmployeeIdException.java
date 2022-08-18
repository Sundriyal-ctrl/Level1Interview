package ExceptionClasses;

public class InvalidEmployeeIdException extends Exception {
    public InvalidEmployeeIdException()
    {
        super();
    }
    public InvalidEmployeeIdException(String message){
        super(message);
    }
    public InvalidEmployeeIdException(Throwable throwable , String message)
    {
        super(message,throwable);
    }
    public InvalidEmployeeIdException(Throwable throwable)
    {
        super(throwable);
    }
    public String getMessage()
    {
        return "Invalid Employee Id";
    }
}
