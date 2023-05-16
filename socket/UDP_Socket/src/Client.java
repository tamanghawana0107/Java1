import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("This is Client :: Hawana");
        DatagramSocket socket = new DatagramSocket(12345);
        byte[] dataPacket = new byte[1024];
        DatagramPacket packet = new DatagramPacket(dataPacket, dataPacket.length);
        System.out.println("The received message is : ");
        socket.receive(packet);
        String receivedMessage = new String(packet.getData(), 0 , packet.getLength());
        System.out.print(receivedMessage);

        /*Scanner input = new Scanner(System.in);
            while(true)
            socket.receive(packet)
            String receivedMessage = new String(packet.getData(), 0, packet,getLength());
            System.out.println(receivedMessage);*/
    }
}
