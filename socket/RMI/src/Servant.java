import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Servant extends UnicastRemoteObject implements Service{

    protected Servant() throws RemoteException {
        super();
    }

    @Override
    public String printMessage() throws RemoteException {
        //servant class is used by server
        return "Hey this is servant!!!";
    }
}
