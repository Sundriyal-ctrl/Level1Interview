package ExceptionClasses;

public class InvalidExperienceException extends Exception{
    public InvalidExperienceException()
    {
        super();
    }
    public InvalidExperienceException(String message)
    {
        super(message);
    }
    public InvalidExperienceException(Throwable throwable , String message)
    {
        super(message,throwable);
    }
    public InvalidExperienceException(Throwable throwable)
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
