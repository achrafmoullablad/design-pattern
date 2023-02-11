package metier;

public class Journalisation {
	private static Journalisation uniqueInstance;
	private String log;

	private Journalisation() {
		log = new String();
	}

	public static Journalisation getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Journalisation();
		}
		return uniqueInstance;
	}

	public void ajouterLog(String log) { 
		this.log += log +"\n"; 
	}

	public String afficherLog() {
		return log;
	}
}
