package client.view;

import common.CatalogueServer;

import java.rmi.RemoteException;

public class UserInterface {
    CatalogueServer server;

    public UserInterface (CatalogueServer server) {
        this.server = server;
        run();
    }

    void run () {
        try {
            System.out.println(server.testMethod("Louis"));
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}