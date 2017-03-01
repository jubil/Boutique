package bean;

import java.util.Date;
import java.util.HashMap;

public class Commande {

	private Date date = new Date();
	private double prixTotal = 0.0;
	private boolean isValidee = false;
	
	private HashMap<Produit, Integer> panier;
	
	/**
	 * Passer la commande
	 */
	public void valider(){
		isValidee = true;
		for(Produit prod : panier.keySet()){
			prixTotal += prod.getPrix();
			prod.setQte(prod.getQte() - panier.get(prod));;
		}
		
		//Partie statistique
		Serveur.CHIFFRE_AFFAIRE += prixTotal;
	}
	
}
