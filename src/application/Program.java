package application;

import entities.Departament;
import entities.Worker;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TI
		Worker worker1 = new Worker("Carlos","229.717.080-60", 35, new Departament("TI", 12));
		Worker worker2 = new Worker("Josue", "222.737.080-60", 38, new Departament("TI", 62));
		Worker worker3 = new Worker("Fátima", "229.738.080-60", 37, new Departament("TI", 32));
		Worker worker4 = new Worker("Maria", "229.737.050-60", 33, new Departament("TI", 42));

		// RH
		Worker worker5 = new Worker("Carlos", "233.737.080-60", 33, new Departament("RH", 72));
		Worker worker6 = new Worker("Maria", "229.737.080-50", 32, new Departament("RH", 22));
		Worker worker7 = new Worker("Miguel", "229.737.045-60", 25, new Departament("RH", 32));
		Worker worker8 = new Worker("Romualdo", "229.737.090-60", 45, new Departament("RH", 13));

		// Finanças
		Worker worker9 = new Worker("José", "229.737.110-60", 25, new Departament("Finanças", 13));
		Worker worker10 = new Worker("Franco", "229.735.080-60", 35, new Departament("Finanças", 22));
		Worker worker11 = new Worker("Manoel", "229.888.080-60", 75, new Departament("Finanças", 42));
		Worker worker12 = new Worker("Jesse", "229.733.081-60", 95, new Departament("Finanças", 19));
		
		// Contábil
		Worker worker13 = new Worker("Messi", "221.737.081-60", 33, new Departament("Finanças", 13));
		Worker worker14 = new Worker("Ronaldo", "129.737.030-60", 40, new Departament("Finanças", 22));
		Worker worker15 = new Worker("Zidane", "219.737.080-60", 41, new Departament("Finanças", 42));
		Worker worker16 = new Worker("Romário", "229.737.080-60", 55, new Departament("Finanças", 19));
				

		Departament lista = new Departament();

		// Adicionar colaborador
		lista.addWorker(worker12);
		lista.addWorker(worker11);
		lista.addWorker(worker10);
		lista.addWorker(worker9);
		lista.addWorker(worker8);
		lista.addWorker(worker7);
		lista.addWorker(worker6);
		lista.addWorker(worker5);
		lista.addWorker(worker4);
		lista.addWorker(worker3);
		lista.addWorker(worker2);
		lista.addWorker(worker1);
		lista.addWorker(worker16);
		lista.addWorker(worker15);
		lista.addWorker(worker14);
		lista.addWorker(worker13);
		

		System.out.println(lista);

		System.out.println("--------------");
		System.out.println("Information size of departament:");
		System.out.println(lista.sizeDepartament());
		
		lista.remove("229.737.080-60");
		
		System.out.println(lista);
		
		
		
	

	}

}
