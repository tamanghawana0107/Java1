// PROGRAM for try
public class exception2 {
    public static void main(String[] args)
    {
        try{
             int[] num = {0,1,0,7};
             System.out.println(num[10]);
        }
        catch (Exception e)
        {
            System.out.println("There is no value in the given address");
        }
        finally
        {
            System.out.println("The try catch procedure is finsihed");
            System.out.println("This is final phase");
        }
    }
}
