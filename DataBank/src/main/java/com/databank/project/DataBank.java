package com.databank.project;

public class DataBank {

	public static void main(String[] args) {
		var cc1 = new ContaCorrente();
		cc1.setSaldo(500f);
		cc1.transferir(cp, 200f);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setSaldo(500f);

	}

}
