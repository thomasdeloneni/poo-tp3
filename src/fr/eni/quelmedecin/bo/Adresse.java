package fr.eni.quelmedecin.bo;

public class Adresse {
	
	private String complementaire;
	private int numRue;
	private String optionRue;
	private String nomRue;
	private int codePostal;
	private String nomVille;
	
	public Adresse(String complementaire, int numRue,String optionRue, String nomRue, int codePostal, String nomVille) {
	
		this.complementaire = complementaire;
		this.numRue = numRue;
		this.optionRue = optionRue;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.nomVille = nomVille;
	}
public Adresse(int numRue,  String optionRue,String nomRue, int codePostal, String nomVille) {
	this.numRue = numRue;
	this.optionRue = optionRue;
	this.nomRue = nomRue;
	this.codePostal = codePostal;
	this.nomVille = nomVille;
}


public void afficher() {
	if(complementaire!=null && !complementaire.isBlank()) {
		System.out.println(complementaire);
	}
	System.out.println(numRue+ (optionRue!=null ? optionRue : "") + " " + nomRue) ;
	System.out.println(String.format("%05d", codePostal) + " " + nomVille);
	
}


	
	

	

}
