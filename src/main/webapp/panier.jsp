<%@page import="bean.ListeProduits"%>
<%@ page language="java" contentType="text/html" charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html"; charset=UTF-8">
		<link rel="stylesheet" href="style.css">
		<title>Boutique en ligne</title>
	</head>
	<body>
		<%@ include file="/fragments/header.jspf" %>
		<%--@ include file="/fragments/nav.jspf" --%>
		<%@ include file="/fragments/navConnection.jspf" %>
		<section>
			<h2>Nos Produits</h2>
			<table>
			<% 
			new ListeProduits();
			for(int i = 0; i <= ListeProduits.getArticles().size()-1; i++) { 
			if(i%3==0||i==0){%>
				<tr>
				<%} %>
					<td>
						<div class="produit">
							<img src="<%=ListeProduits.getArticles().get(i).getUrl() %>"/>
							<p>Nom : <%=ListeProduits.getArticles().get(i).getNom() %></p>
							<p>Prix : <%=ListeProduits.getArticles().get(i).getPrix() %> €</p>
							<%if(ListeProduits.getArticles().get(i).getQte() > 0) {%>
							<p>Quantité : <%=ListeProduits.getArticles().get(i).getQte() %></p>
							<p><a href="#achat">Ajouter au panier</a><p>
							<%} else {%>
								<p>HORS STOCK</p></br></br>
							<%} %>
						</div>
					</td>
				<%if(i%3==2 || i == ListeProduits.getArticles().size()-1){ %></tr>
				<% }} %>
			</table>
		</section>
		<%@ include file="/fragments/footer.jspf" %>
	</body>
</html>