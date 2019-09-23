package exercice4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CashierUtilsTest {
	Sale mySale;
	Sale mySale2;
	Date time;
	Article article1;
	Article article2;
	Article article3;
	Article article4;
	Article article5;
	Article article6;
	

	@BeforeEach
	void setUp() throws Exception {
		mySale = new Sale();
		mySale2 = new Sale();
		article1 = new Article(125.0,category.ACCESOIRE,15161,"Cisaille");
		article2 = new Article(125.0,category.ACCESOIRE,15161,"Cisaille");
		article3 = new Article(125.0,category.ACCESOIRE,15161,"Cisaille");
		article4 = new Article(125.0,category.ACCESOIRE,15161,"Cisaille");
		article5 = new Article(125.0,category.ACCESOIRE,15161,"Cisaille");
		article6 = new Article(125.0,category.ACCESOIRE,15161,"Cisaille");
		mySale.addArticles(article1);
		mySale.addArticles(article2);
		mySale.addArticles(article3);
		mySale.addArticles(article4);
		mySale.addArticles(article5);
		mySale.addArticles(article6);
		time = new Date();
	}

	@AfterEach
	void tearDown() throws Exception {
		mySale = null;
		mySale2 = null;
	}

	@Test
	void test() {
		assertEquals("okgespfe", CashierUtils.getMensualReport(sales, MM, YY));
	}

}
