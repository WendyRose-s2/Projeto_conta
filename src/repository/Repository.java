package repository;
import Conta.model.conta;

public interface Repository {

	public interface ContaRepository {

		
		public void atualizar(conta conta);
	
		}

	
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(conta conta);
	public void deletar(int numero);
	void sacar(int numero, float valor);
	void depositar(int numero, float valor);
	void transferir(int numeroOrigem, int numeroDestino, float valor);
}
