package exercice4;

import java.util.Hashtable;

public class ArticleManager {
	private final Hashtable<String, Article> articles = new Hashtable<>();
	
	public void addArticle(Article article) {
		articles.put(article.id, article);
	}
	public void ArticleVendu(String id) {
		getArticle(id).SetVendu(true);
	}
	
	public Article getArticle(String id) {
		return articles.get(id);
	}
}
