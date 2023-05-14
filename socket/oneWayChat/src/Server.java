import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(12345);
            Socket socket = ss.accept();
            System.out.println("Connection established");

            OutputStream outputStream = new OutputStream();
        }
        catch(IOException e){
            System.out.println("Connection refused");
            throw new RuntimeException(e);
        }
    }
}
