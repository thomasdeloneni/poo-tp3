package fr.eni.quelmedecin.bo;

public class MedecinGeneraliste {

	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	public static int _tarifConsultation = 25;

	public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}

	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}

	public int getTarifConsultation() {
		return _tarifConsultation;
	}
	
	

	public void setTarifConsultation(int tarifConsultation) {
		_tarifConsultation = tarifConsultation;
	}

	public void afficher() {
		System.out.println(nom.toUpperCase() + " " + prenom);
		System.out.println("Téléphone : " + numeroDeTelephone);
		System.out.println("Tarif : " + _tarifConsultation+ "€");
		System.out.println("------------------------------------------------------------------");
	}

	public static void setTarif(int i) {
		
	}
}
