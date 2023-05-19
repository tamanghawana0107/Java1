import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Service extends Remote {

    //to remotely access it uses "extends Remote"
    public String printMessage() throws RemoteException;
}
