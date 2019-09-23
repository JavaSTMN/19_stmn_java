package exercice4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sale {
	private List<Article> articles;
	
	private Date time;

	public Sale(){
		this.time = new Date();
		this.articles = new ArrayList<Article>();
	}

	public List<Article> getArticles() {
		return articles;
	}

	public Date getTime() {
		return time;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
		
	public void setTime(Date time) {
		this.time = time;
	}
	
	public void addArticles(Article article) {
		articles.add(article);
	}
	
}