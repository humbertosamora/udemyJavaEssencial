package secao12HerancaPolimorfismo;

public class Programa28 {
	
	public static void main(String[] args) {
	
		Aluno a1 = new Aluno("Jo�o Gabriel");
		
		a1.setRa("15748");
		
		System.out.println(a1);
		
		a1.setEndereco("Rua das Can�rias, 790");
		a1.setEmail("joaogabriel1992@gmail.com");
		
		System.out.println("");
		
		System.out.println(a1);
	}
		
}
