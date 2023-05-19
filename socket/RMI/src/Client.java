import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        Service obj = (Service) Naming.lookup("rmi://localhost:5099/Hawana");
        System.out.println(obj.printMessage());
    }
}
