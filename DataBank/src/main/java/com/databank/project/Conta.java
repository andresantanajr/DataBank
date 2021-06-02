package com.databank.project;

public class Conta {
		private String nome;
		private int numero;
		private int agencia;
		private boolean status;
		private float saldo;
		
		//Método Sacar
		 protected void sacar(float valor) {
			this.saldo = this.saldo - valor;
		}
		
		//Método Depositar
		protected void depositar(float valor) {
			this.saldo = this.saldo + valor;
		}
		
		//Método Transferir
		 void transferir(Conta destino, float valor) {
				
				if(this.saldo>=0) {
					
				this.sacar(valor);
					
				this.depositar(valor);
				
				}
				else{
					System.err.println("Saldo Insuficiente!");
				}
		}
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public int getAgencia() {
			return agencia;
		}
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		public boolean isStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		public float getSaldo() {
			return saldo;
		}
		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}
		
		
	
}
