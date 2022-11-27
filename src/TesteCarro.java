import javax.swing.JOptionPane;

public class TesteCarro {

	public static void main(String[] args) {

		Carro carro1 = new Carro("amarelo", "fusca");
		Carro carro2 = new Carro("preto", "HB20");

		carro1.setModelo("Jeep");
		carro1.setCor("Verde");

		carro2.setModelo("Peugeot");
		carro2.setCor("Azul");

	
        //JOptionPane.showInputDialog("Digite o modelo do carro1");

		System.out.printf("O modelo do carro1 é: %s \n", carro1.getModelo());
		System.out.printf("A cor do carro1 é: %s \n", carro1.getCor());

		System.out.printf("O modelo do carro2 é: %s \n", carro2.getModelo());
		System.out.printf("A cor do carro2 é: %s \n", carro2.getCor());
	}

}

// Note que a classe de teste deixou de funcionar após a adição do construtor?
// R: Pq não havia passado os valores nos atributos que os construtores esperam receber.

// Faça os ajustes necessários para que ela volte a funcionar?
// R: Passei um valor nos atributos que os construtores esperam receber.

//Carro carro1 = new Carro("amarelo", "fusca");
//Carro carro2 = new Carro("preto", "HB20");



