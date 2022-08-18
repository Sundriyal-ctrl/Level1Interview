package ExceptionClasses;

public class DuplicateEmployeeDetailsException extends Exception{
    public DuplicateEmployeeDetailsException()
    {
        super();
    }
    public DuplicateEmployeeDetailsException(String message)
    {
        super(message);
    }
    public DuplicateEmployeeDetailsException(Throwable throwable , String message)
    {
        super(message,throwable);
    }
    public DuplicateEmployeeDetailsException(Throwable throwable)
    {
        super(throwable);
    }
    public String getMessage()
    {
        return "Invalid Id,Id should be between 1000 -2000";
    }
    public void printStackTrace()
    {
        printStackTrace(System.err);
    }
}
