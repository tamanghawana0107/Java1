import java.io.IOException;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args){
        try{
            Socket socket = new Socket("localhost",12345);

            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            System.out.println((char)inputStreamReader.read());

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

}
