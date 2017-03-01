package bean;

import java.util.ArrayList;

public class Serveur {
	
	public static double CHIFFRE_AFFAIRE = 0;
	public static int NOMBRE_REQUETES = 0;
	
	private ArrayList<Client> clients;
	
	public Serveur(){
		clients = new ArrayList<Client>();
		clients.add(new Client("admin", "admin"));
	}
}
