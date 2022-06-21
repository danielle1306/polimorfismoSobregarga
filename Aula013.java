package sobrecarga;

class Aula013 {
	//programa principal
	public static void main(String[] args) {
//		Animal animal = new Animal(); dará erro pq animal é uma classe abstrata. Logo não pode gerar objetos (ser instanciada)
	//criando o objeto
		Cachorro cachorro = new Cachorro();
		cachorro.reagir(true);  //exemplo de polimorfismo por sobrecarga.
		cachorro.reagir("Como ele é lindo!");
		cachorro.reagir(8, 15);
		cachorro.reagir(2, 3);

	}

}
