
public class Elevador {

	private int capacidade;
	private int numAndar;
	private int numPessoas;
	private int andarAtual;
	
	public void inicializa(int capacidade, int numAndar) {
		if(capacidade > 0) {
			this.capacidade = capacidade;
		}else{
			System.out.print("Numero de andar invalido");
		}
		if (numAndar > 0) {
			this.numAndar = numAndar;
		}else {
			System.out.print("Numero de andares invalido");
		}
	}
	
		public void entra() {
		if(numPessoas < capacidade) {
			numPessoas++;
		}else {
			System.out.print("Elevador cheio");
		}
		
		public void sai() {
			if(numPessoas > 0) {
				numPessoas--;
			}else{
				System.out.print("Elevador esta cheio");
			}
			
		public void sobe() {
			if(andarAtual < numAndar) {
				andarAtual++;
			}else {
				System.out.print("Ja esta no ultimo andar");
			}
		}
		public void desce() {
			if(andarAtual > 0) {
				andarAtual--;
			}else {
				System.out.print("Ja esta no terreo");
			}
		}
		}
	}

		public int getCapacidade() {
			return capacidade;
		}

		public void setCapacidade(int capacidade) {
			this.capacidade = capacidade;
		}

		public int getNumAndar() {
			return numAndar;
		}

		public void setNumAndar(int numAndar) {
			this.numAndar = numAndar;
		}

		public int getNumPessoas() {
			return numPessoas;
		}

		public void setNumPessoas(int numPessoas) {
			this.numPessoas = numPessoas;
		}

		public int getAndarAtual() {
			return andarAtual;
		}

		public void setAndarAtual(int andarAtual) {
			this.andarAtual = andarAtual;
		}

	
}
