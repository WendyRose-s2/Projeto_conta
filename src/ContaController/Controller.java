package ContaController;

import repository.Repository;

import java.util.ArrayList;

import Conta.model.conta;

public class Controller implements Repository {
	
	 private ArrayList<conta> listaContas = new ArrayList<conta>();
	    int numero = 0;
	    
	  
	    @Override
	    public void procurarPorNumero(int numero) {
	        var conta = buscarNaCollection1(numero);
			
			if (conta != null)
				((Conta.model.conta) conta).visualizar();
			else
				System.out.println("\nA Conta número: " + numero + " não foi encontrada!");
	    }

	    private Object buscarNaCollection1(int numero2) {
	
			return null;
		}

	
	  
	    public void listarTodas() {
	        for (var conta : listaContas) {
				conta.visualizar();
			}        
	    }

	  
	    public void cadastrar(conta conta) {
			listaContas.add(conta);
			System.out.println("\nA Conta número: " + conta.getNumero() + " foi criada com sucesso!");
	    }

	
	    public void atualizar(conta conta) {
	        var buscaConta = buscarNaCollection1(conta.getNumero());
			
			if (buscaConta != null) {
				listaContas.set(listaContas.indexOf(buscaConta), conta);
				System.out.println("\nA Conta numero: " + conta.getNumero() + " foi atualizada com sucesso!");
			}else
				System.out.println("\nA Conta numero: " + conta.getNumero() + " não foi encontrada!");
	    }

	    @Override
	    public void deletar(int numero) {
	        var conta = buscarNaCollection1(numero);
			
			if (conta != null) {
				if(listaContas.remove(conta) == true)
					System.out.println("\nA Conta numero: " + numero + " foi deletada com sucesso!");
			}else
				System.out.println("\nA Conta numero: " + numero + " não foi encontrada!");
	    }

	    @Override
	    public void sacar(int numero, float valor) {
	        
	        
	    }

	    @Override
	    public void depositar(int numero, float valor) {
	        
	        
	    }

	    @Override
	    public void transferir(int numeroOrigem, int numeroDestino, float valor) {
	        
	        
	    }

	   
		public int gerarNumero() {
			return ++ numero;
		}

		public conta buscarNaCollection(int numero) {
			for (var conta : listaContas) {
				if (conta.getNumero() == numero) {
					return conta;
				}
			}
			
			return null;
		}

}
