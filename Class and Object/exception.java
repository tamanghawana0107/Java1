// PROGRAM for try catch 
/*************************************************************/
// try catch throw and finally
// throw => This statement allows you to create a custom error.
// finally => This statement allows you to execute code

public class exception{
    public static void main(String[] args){
        try{
            int[] num = {1,2,3};
            System.out.println(num[10]);
        } catch (Exception e)
        {
            System.out.println("Something went wrong");
        }
        throw new ArithmeticException("Throwed out of the code");
    }
}