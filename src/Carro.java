public class Carro {

	private String cor;
	private String modelo;

	
	public Carro(String n1, String n2) {
		cor = n1;
		modelo = n2;
	}

	
	public void setCor(String valor) {
		cor = valor;
	}

	
	public String getCor() {
		return cor;
	}

	public void setModelo(String valor) {
		modelo = valor;
	}

	public String getModelo() {
		return modelo;
	}
}
