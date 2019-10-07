package com.gugawag.rpc.banco;

import java.io.Serializable;

public class Conta implements Serializable{
	private String numero;
	private double saldo;
	
	public Conta(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public String getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	

}
