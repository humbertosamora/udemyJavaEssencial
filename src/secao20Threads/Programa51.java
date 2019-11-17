package secao20Threads;
import secao09OrientacaoObjetos.Conta;
import secao12HerancaPolimorfismo.Pessoa;

/*
 * Exemplo de uso de Threads:
 * - A ordem de execução do código deixa de ser sequencial e passa a depender do schedule do processador
 * - "join()" faz com que o programa principal espere a thread finalizar
 * - "wait()" é usado com recursos compartilhados e espera até uma thread notificá-la com "notify()"
 * - "sleep()" faz a thread dormir e passar a execução para outra thread ou para o programa principal.
 * - "synchronized" deve ser usado para acessar/escrever atributos/objetos compartilhados.
 * 
 * */

public class Programa51 {

	public static void main(String[] args) throws InterruptedException {
		
		// Instancia uma conta sem saldo e sem limite
		Conta c = new Conta(0,0, new Pessoa("Atleticano Triste"));
		
		// Inicia uma thread para sacar 1000
		Thread t1 = new Thread ( new Runnable() {
			@Override
			// Usar synchronized no modificador da função não resolveria porque o recurso compartilhado está em outro objeto.
			// Synchronized no modificador da função iria sincronizar os atributos internos do objeto Runnable.
			public void run() {
				// Foi usado synchronized porque deseja modificar o objeto "c"
				synchronized (c) {
					while ( true ) {
						try {
							c.wait();
							c.sacar(1000);
							break;
						} catch (Exception e) {
							System.out.println(e.getMessage());
							System.out.println("Thread 1 aguardando...");
						}
					}
					System.out.println("Saque realizado.");
				}
			}});
		
		// Inicia uma thread para depositar 100
		Thread t2 = new Thread ( new Runnable() {
			@Override
			// Usar synchronized no modificador da função não resolveria porque o recurso compartilhado está em outro objeto.
			// Synchronized no modificador da função iria sincronizar os atributos internos do objeto Runnable.
			public  void run() {
				// Foi usado synchronized porque deseja modificar o objeto "c"
				synchronized (c) {
					c.depositar(100);
					System.out.println("Depósito R$ " + 100 + " realizado.");
					c.notify();
				}
			}});

		// Inicia uma thread para depositar 900
		Thread t3 = new Thread ( new Runnable() {
			@Override
			// Usar synchronized no modificador da função não resolveria porque o recurso compartilhado está em outro objeto.
			// Synchronized no modificador da função iria sincronizar os atributos internos do objeto Runnable.
			public  void run() {
				try {
					Thread.sleep(500);
				
					// Foi usado synchronized porque deseja modificar o objeto "c"
					synchronized (c) {
						c.depositar(900);
						System.out.println("Depósito R$ " + 900 + " realizado.");
						c.notify();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}});
		
		// Incia as threads
		t1.start();
		t2.start();
		t3.start();
		
		// Aguarda as threads finalizarem com o camando join()
		try {
			System.out.println("Aguardando a Thread 1.");
			t1.join();
			System.out.println("Aguardando a Thread 2.");
			t2.join();
			System.out.println("Aguardando a Thread 3.");
			t3.join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		// Imprime a conta após os depósitos
		System.out.println(c);
	}

}
