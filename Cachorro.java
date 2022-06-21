package sobrecarga;

public class Cachorro extends Lobo {
	//métodos sobrescritos - mesmo método com assinaturas diferentes dentro de uma mesma classe
	@Override
	public void emitirSom() {
		System.out.println("Au, au,au!");
	}
	public void reagir(String frase) { //todos os métodos reagir estão em sobrecarga.
		if (frase.equals("Que cachorrinho fofo! ")  || frase.equals("ohhh! como ele é lindo! ") ) {
			System.out.println("Abanar o rabo e latir feliz");
		} else {
			System.out.println("Rosnar");;
		}
	}
	public void reagir(int hora, int min) {
		if (hora>12) {
			System.out.println("Abanar o rabinho!!");
		} else {
			if (hora>=18) {
				System.out.println("Ignorar");
			} else {
				System.out.println("Abanar e latir feliz.");
				this.emitirSom();
			}
		}
	}
	public void reagir(boolean dono) {
		if (dono == true) {
			System.out.println("Pular e lamber!");
		} else {
			System.out.println("Rosnar e latir bravo.");
			this.emitirSom();
		}
	
}
	public void reagir(int idade, float peso) {
		if (idade>5) {
			if (peso>10) {
				System.out.println("Abanar o rabo");
			} else {
				System.out.println("Latir dizendo não quero brincar");
				this.emitirSom();
			}
		} else {
			if (peso<10) {
				System.out.println("Rosnar dizendo respeite o cão velho");
			} else {
				System.out.println("Ignorar dizendo sou velho e gordo. Só quero dormir");
			}
		}
	
}
}
