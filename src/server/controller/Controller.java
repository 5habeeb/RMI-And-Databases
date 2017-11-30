package server.controller;

import common.CatalogueServer;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class Controller extends UnicastRemoteObject implements CatalogueServer {

    public Controller() throws RemoteException {
        System.out.println("Server Connected");
    }

    @Override
    public String testMethod(String word) throws RemoteException {
        return word + " hello";
    }

    @Override
    public void createAccount(String name, String password) throws RemoteException {
    }

    @Override
    public void deleteAccount() throws RemoteException {

    }

    @Override
    public void login(String name, String password) throws RemoteException {

    }

    @Override
    public void logout() throws RemoteException {

    }

    @Override
    public boolean status() throws RemoteException {
        return false;
    }

    @Override
    public void uploadToDB() throws RemoteException {

    }

    @Override
    public void downloadFromDB(String fileName) throws RemoteException {

    }
}
