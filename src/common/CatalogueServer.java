package common;

// This file contains all the methods implemented in the server and are remotely called by the client

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CatalogueServer extends Remote{

    public String testMethod (String word) throws RemoteException;

    public void createAccount (String name , String password) throws RemoteException;

    public void deleteAccount () throws RemoteException;

    public void login (String name, String password) throws RemoteException;

    public void logout () throws RemoteException;

   // public List<Account> listFiles () throws RemoteException;

    public boolean status() throws  RemoteException;

    public void uploadToDB () throws RemoteException;

    public void downloadFromDB ( String fileName) throws RemoteException;

}
