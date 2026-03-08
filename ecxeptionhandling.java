class ecxeptionhandling
{
    public static void main(String[] args)
    {
        int a=10,b=0,c;
        try
        {
            c=a/b;
            System.out.println("the result is "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divide by zero");
        }
        finally
        {
            System.out.println("this is finally block");
        }
    }
}
