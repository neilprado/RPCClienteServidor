package com.gugawag.rpc.banco;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BancoServiceServer extends UnicastRemoteObject implements BancoServiceIF {

    private List<Conta> contas = new ArrayList<>();

    public BancoServiceServer() throws RemoteException {
    }

    @Override
    public double saldo(String conta) throws RemoteException {
        return contas.get(Integer.parseInt(conta)+1).getSaldo();
    }

    @Override
    public int quantidadeContas() throws RemoteException {
        return contas.size();
    }

	@Override
	public Conta cadastrarConta(String conta, double valor) throws RemoteException {
		Conta c = new Conta(conta, valor);
		contas.add(c);
		return c;
	}
	
	@Override
	public Conta pesquisar(String numero) throws RemoteException{
		for(Conta c: contas) {
			if(numero.equals(c.getNumero())) {
				return c;
			}
		}
		return null;
	}

	@Override
	public boolean remover(String numero) throws RemoteException {
		Conta c = pesquisar(numero);
		if(c != null) {
			contas.remove(c);
			return true;
		}
		return false;
	}
	
	
}
