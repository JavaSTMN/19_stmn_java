package exercice4;

import java.util.Date;
import java.util.List;

public class CashierUtils {
	public double TVA = 1.20;
	
	public static String getMensualReport(List<Sale> sales,int MM, int YY) {
		StringBuilder stringToReturn = new StringBuilder();
		for (Sale sale : sales) {
			if (sale.getTime().getYear() == YY) {
				if (sale.getTime().getMonth() == MM) {
					for (Article sale2 : sale.getArticles()) {
						stringToReturn.append("Nom de l'article : " + sale2.getNom());
						stringToReturn.append("Catégorie : " + sale2.getCat());
						stringToReturn.append("Prix HT : " + sale2.getPriceTaxeFree());
						stringToReturn.append("Prix TTC : " + sale2.getPriceTaxeFree()*TVA);
					}
				}				
			}
		}
		
		return stringToReturn.toString();
		
	}
	
	public static String getAnnualReport(List<Sale> sales,Date theDate) {
		return null;
		
	}
	
}
