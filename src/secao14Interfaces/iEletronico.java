package secao14Interfaces;
/*
 * INTERFACES
 * - Interfaces são conhecidas como "contratos";
 * - Uma emprea criou um contrato "com regras" para definir a criação de um produto/serviço;
 * - Quem implementar a interface precisa seguir as regras;
 * - Cada implementação pode possuir particularidades, desde que respeite as regras básicas;
 * - Recomenda-se iniciar o nome da interface com um "i" minúsculo;
 * - Pode conter atributo, que serão constante (variável que não pode ser alterada);
 * - Pode conter métodos, que sempre serão abstratos;
 * - As classes que implementarem essa interface, terão que implementar os métodos da interface;
 * - Por padrão todos os métodos de uma interface são públicos, deste modo os qualificadores dos métodos podem ser omitidos
 * 
 * 
 * INTEFACE X CLASSE ABSTRATA
 * - Uma clase abstrata pode ter atributos
 * - Uma interface só possui constantes
 * - Uma classe abastrata pode ter métodos concretos
 * - Uma interface só possui métodos abstratos
 * 
 * */
public interface iEletronico {
	
	// Atributo CONSTANTE que não pode ser alterado.
	// Não precisa ter a palavra final porque todo atributo de uma interface é uma constante.
	public String MARCA = "Geek"; 
	
	public void ligar();
	public void desligar();
	
}
