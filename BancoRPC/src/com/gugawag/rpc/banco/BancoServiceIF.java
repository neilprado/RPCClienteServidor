package com.gugawag.rpc.banco;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface BancoServiceIF extends Remote {

    double saldo(String conta) throws RemoteException;
    int quantidadeContas() throws RemoteException;
    Conta cadastrarConta(String conta, double valor) throws RemoteException;
    Conta pesquisar(String numero) throws RemoteException;
    boolean remover(String numero) throws RemoteException;
}
