package servidor;

import cliente.JFrameCliente;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {
    String HOST_URL = "rmi://localhost/BuscarSessao";
    
    public Servidor(){
        try {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            BuscarSessao objetoRemoto = new BuscarSessao();
            //Naming.rebind(HOST_URL, (Remote) objetoRemoto);
            Naming.bind(HOST_URL, objetoRemoto);
            System.out.println("Servidor online e no aguardo....");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    public static void main(String args[]) {
        new Servidor();
    }
}
