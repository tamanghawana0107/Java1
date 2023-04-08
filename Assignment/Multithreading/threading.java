/* Build a multi threaded application that demonstrates the use of synchronization.
 * Build whatever you want, that should include the multi threading concept */
import java.lang.Thread;

class Multit implements Runnable{
    public void run(){
        try{
            System.out.println("This is multi threading code. " + " Thread id is : " + Thread.currentThread().getId());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println(e);
        }
    }

     
}
public class threading {
    public static void main(String[] args){
        int n = 8;
        for(int i =0; i<n; i++)
        {

            Thread obj = new Thread( new Multit());
            obj.start();
        }
    }
}
