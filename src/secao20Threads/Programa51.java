package secao20Threads;
import secao09OrientacaoObjetos.AccountException;
import secao09OrientacaoObjetos.Conta;
import secao12HerancaPolimorfismo.Pessoa;

/*
 * Exemplo de uso de Threads:
 * - A ordem de execu��o do c�digo deixa de ser sequencial e passa a depender do schedule do processador
 * - "join()" faz com que o programa principal espere a thread finalizar
 * - "wait()" � usado com recursos compartilhados e espera at� uma thread notific�-la com "notify()"
 * - "sleep()" faz a thread dormir e passar a execu��o para outra thread ou para o programa principal.
 * - "synchronized" deve ser usado para acessar/escrever atributos/objetos compartilhados.
 * 
 * */

public class Programa51 {

	public static void main(String[] args) {
		
		// Instancia uma conta sem saldo e sem limite
		Conta c = new Conta(0,0, new Pessoa("Atleticano Triste"));
		
		// Inicia uma thread para sacar 1000
		Thread t1 = new Thread ( new Runnable() {
			@Override
			// Usar synchronized no modificador da fun��o n�o resolveria porque o recurso compartilhado est� em outro objeto.
			// Synchronized no modificador da fun��o iria sincronizar os atributos internos do objeto Runnable.
			public void run() {
				// Foi usado synchronized(c) porque deseja modificar o objeto "c"
				synchronized (c) {
					
					while (true) {
						
						try {
							c.sacar(1000);
							System.out.println("Saque realizado.");
							break;	// Finaliza o while se conseguir sacar.
						}
						catch (AccountException e) {
							// Exce��o gerada pela classe Conta devido ao saldo insuficiente.
							// Continua a execu��o at� haver saldo para saque.
							System.out.println(e.getMessage());
							
							try {
								c.wait();
							}
							catch (InterruptedException e1) {
								// Exce��o associada ao m�todo wait(). Finaliza a thread caso ocorra.
								System.out.println(e1.getMessage());
								break;
							}
						}
						catch (Exception e) {
							// Outras exce��es. Finaliza a thread caso ocorra.
							System.out.println(e.getMessage());
							break;
						}
					}
				}
			}
		});
		
		// Inicia uma thread para depositar 100
		Thread t2 = new Thread ( new Runnable() {
			@Override
			// Usar synchronized no modificador da fun��o n�o resolveria porque o recurso compartilhado est� em outro objeto.
			// Synchronized no modificador da fun��o iria sincronizar os atributos internos do objeto Runnable.
			public  void run() {
				// Foi usado synchronized porque deseja modificar o objeto "c"
				synchronized (c) {
					c.depositar(100);
					System.out.println("Dep�sito R$ " + 100 + " realizado.");
					c.notify();
				}
			}});

		// Inicia uma thread para depositar 900
		Thread t3 = new Thread ( new Runnable() {
			@Override
			// Usar synchronized no modificador da fun��o n�o resolveria porque o recurso compartilhado est� em outro objeto.
			// Synchronized no modificador da fun��o iria sincronizar os atributos internos do objeto Runnable.
			public  void run() {
				try {
					Thread.sleep(500);
				
					// Foi usado synchronized porque deseja modificar o objeto "c"
					synchronized (c) {
						c.depositar(900);
						System.out.println("Dep�sito R$ " + 900 + " realizado.");
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
		
		// Imprime a conta ap�s os dep�sitos
		System.out.println(c);
	}

}
