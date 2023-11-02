package fr.eni.quelmedecin.ctrl;

public class Methode {

	public static Methode getMethode() {
		// TODO Auto-generated method stub
		return new Methode();
	}

	public String premiereEnMajuscule(String prenom, String string) {
		String[] tableauPrenoms = prenom.split("-");
		String prenoms = "";
		for (String p : tableauPrenoms) {
			p += "-" + p.substring(0, 1).toUpperCase();
		}
		return prenoms;
	}

	public String formatNumeroTelephone(String numeroDeTelephone) {
		String regex = "^[a-zA-Z]*$";
		boolean result = numeroDeTelephone.matches(regex);
		if (!(numeroDeTelephone.length() == 10 || result)) {
			String numIncorrect = "<< numero incorrect >>";
			return numIncorrect;
		} else {
			var newNum = numeroDeTelephone.replaceAll("(\\d{2})(\\d{2})(\\d{2})(\\d{2})(\\d{2})", "$1.$2.$3.$4.$5");
			return newNum;
		}

	}

}
