import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            Socket socket = serverSocket.accept();
            System.out.println("A client is connected");

            //InputStream inputStream = socket.getInputStream();
            //InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());

            //this is for getting socket value (message)
            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //this is for user typed input
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

            // I need a pen to write the message
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream, true);

            String sendingMessage, receivingMessage;
            while(true){

                //sending to client
                sendingMessage = userInputReader.readLine();        //gets input from user
                printWriter.println(sendingMessage);
                printWriter.flush();

                //receiving from client
                receivingMessage = socketDataReader.readLine();
                System.out.println("Client: " + receivingMessage);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
