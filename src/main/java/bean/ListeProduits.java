package bean;

import java.util.ArrayList;
import java.util.List;

public class ListeProduits {

	private static List<Produit> articles = new ArrayList<Produit>();

	public static List<Produit> getArticles() {
		return articles;
	}
	
	//TODO Reclamer la liste à l'application
	public ListeProduits(){
		articles = new ArrayList<Produit>();
		articles.add(new Produit("0","Boule Chatte", 25, 24.5, "img/produits/Boule Chatte.jpg"));
		articles.add(new Produit("1","Chagriné", 25, 24.5, "img/produits/Chagrine.jpg"));
		articles.add(new Produit("2","Chalumeau", 25, 24.5, "img/produits/Chalumeau.jpg"));
		articles.add(new Produit("3","Chameau", 25, 24.5, "img/produits/Chameau.jpg"));
		articles.add(new Produit("4","Char", 25, 24.5, "img/produits/Char.jpg"));
		articles.add(new Produit("5","Charles", 25, 24.5, "img/produits/Charles.jpg"));
		articles.add(new Produit("6","Chassis", 25, 24.5, "img/produits/Chassis.jpg"));
		articles.add(new Produit("7","Chat botté", 25, 24.5, "img/produits/Chat Botte.jpg"));
		articles.add(new Produit("8","Chat peau", 25, 24.5, "img/produits/Chat peau.jpg"));
		articles.add(new Produit("9","Chat pelé", 25, 24.5, "img/produits/Chat Pele.jpg"));
		articles.add(new Produit("10","Chat pont", 25, 24.5, "img/produits/Chat Pont.jpg"));
		articles.add(new Produit("11","Chat RK", 25, 24.5, "img/produits/Chat RK.jpg"));
		articles.add(new Produit("12","Chat teint", 25, 24.5, "img/produits/Chat Teint.jpg"));
		articles.add(new Produit("13","Chat thon", 25, 24.5, "img/produits/Chat Thon.jpeg"));
		articles.add(new Produit("14","Chataignier", 25, 24.5, "img/produits/Chataignier.jpg"));
		articles.add(new Produit("15","Chateau", 25, 24.5, "img/produits/Chateau.jpg"));
	}
	
}
