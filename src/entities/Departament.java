package entities;



public class Departament {

	private String nameDepartament;
	private int ramal;
	
	private Worker[] workers = new Worker[20];
	private int totalWorkers = 0;


	public Departament() {

	}

	public Departament(String nameDepartament, int ramal) {
		this.nameDepartament = nameDepartament;
		this.ramal = ramal;

	}

	public String getNameDepartament() {
		return nameDepartament;
	}

	public void setNameDepartament(String nameDepartament) {
		this.nameDepartament = nameDepartament;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	public int sizeDepartament() {
		return this.totalWorkers;
	}

	public void addWorker(Worker worker) {
		this.plusSpace();
		this.workers[totalWorkers] = worker;
		this.totalWorkers++;
	}
	
	public void remove(String worker) {
		int cpf = Integer.parseInt(worker);
		for (int i = cpf; i < this.totalWorkers - 1; i++) {
			this.workers[i] = this.workers[i + 1];
		}
		this.totalWorkers--;
	}

	
	private void plusSpace() {
		if (this.totalWorkers == this.workers.length) {
			Worker[] nArray = new Worker[this.workers.length * 2];
			for (int i = 0; i < this.workers.length; i++) {
				nArray[i] = this.workers[i];
			}
			this.workers = nArray;
		}
	}

	@Override
	public String toString() {
		if (this.totalWorkers == 0) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();
		sb.append("[");

		for (int i = 0; i < this.totalWorkers - 1; i++) {
			sb.append(this.workers[i]);
			sb.append(", ");
		}

		sb.append(this.workers[this.totalWorkers - 1]);
		sb.append("]");

		return sb.toString();

	}


}
