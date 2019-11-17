package secao14Interfaces;
/*
 * INTERFACES
 * - Interfaces s�o conhecidas como "contratos";
 * - Uma emprea criou um contrato "com regras" para definir a cria��o de um produto/servi�o;
 * - Quem implementar a interface precisa seguir as regras;
 * - Cada implementa��o pode possuir particularidades, desde que respeite as regras b�sicas;
 * - Recomenda-se iniciar o nome da interface com um "i" min�sculo;
 * - Pode conter atributo, que ser�o constante (vari�vel que n�o pode ser alterada);
 * - Pode conter m�todos, que sempre ser�o abstratos;
 * - As classes que implementarem essa interface, ter�o que implementar os m�todos da interface;
 * - Por padr�o todos os m�todos de uma interface s�o p�blicos, deste modo os qualificadores dos m�todos podem ser omitidos
 * 
 * 
 * INTEFACE X CLASSE ABSTRATA
 * - Uma clase abstrata pode ter atributos
 * - Uma interface s� possui constantes
 * - Uma classe abastrata pode ter m�todos concretos
 * - Uma interface s� possui m�todos abstratos
 * 
 * */
public interface iEletronico {
	
	// Atributo CONSTANTE que n�o pode ser alterado.
	// N�o precisa ter a palavra final porque todo atributo de uma interface � uma constante.
	public String MARCA = "Geek"; 
	
	public void ligar();
	public void desligar();
	
}
