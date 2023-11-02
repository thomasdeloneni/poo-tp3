package fr.eni.quelmedecin.bo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Patient {

	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	private char sexe;
	private long numSecu;
	private LocalDate dateNaissance;
	private String commentaires;
	
	

	public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numSecu,
			LocalDate dateNaissance, String commentaires) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
		this.sexe = sexe;
		this.numSecu = numSecu;
		this.dateNaissance = dateNaissance;
		this.commentaires = commentaires;
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

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	public long getNumSecu() {
		return numSecu;
	}

	public void setNumSecu(long numSecu) {
		this.numSecu = numSecu;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	
	

	public void afficher() {

		System.out.println(nom.toUpperCase() + " " + prenom);
		System.out.println("Téléphone : " + numeroDeTelephone);
		System.out.println("Sexe : " + (sexe=='F'?"Féminin" : "Masculin"));
		System.out.println("Numéro de Sécurité Sociale : " + numSecu);
		System.out.println("Date de naissance : "+ DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(dateNaissance));
		var comm = commentaires;
		if(commentaires==null || commentaires.isBlank()) {
			comm = "[aucun commentaire]";
		}
		System.out.println("Commentaires : " + comm);
	}
}
