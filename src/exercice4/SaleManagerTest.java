package exercice4;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaleManagerTest {

    @Test
    public void test() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SaleManager saleManager = new SaleManager();
        Sale sale1 = new Sale(simpleDateFormat.parse("23/09/2019"), 10);
        Sale sale2 = new Sale(simpleDateFormat.parse("26/08/2019"), 6);
        Sale sale3 = new Sale(simpleDateFormat.parse("23/10/2018"), 18);
        Sale sale4 = new Sale(simpleDateFormat.parse("23/09/2019"), 5);
        Sale sale5 = new Sale(simpleDateFormat.parse("26/08/2019"), 7);
        Sale sale6 = new Sale(simpleDateFormat.parse("23/10/2018"), 25);
        Sale sale7 = new Sale(simpleDateFormat.parse("23/06/2016"), 6);
        saleManager.registerSale(sale1, "0");
        saleManager.registerSale(sale2, "0");
        saleManager.registerSale(sale3, "0");
        saleManager.registerSale(sale4, "1");
        saleManager.registerSale(sale5, "1");
        saleManager.registerSale(sale6, "1");
        saleManager.registerSale(sale7, "2");
        Map<String, Balance> monthlyBalance = saleManager.getMonthlyBalance();
        Map<String, Balance> annualBalance = saleManager.getAnnualBalance();
        assertEquals(16, monthlyBalance.get("0").getExclTaxes());
        assertEquals(16.0 + 16.0*0.2f, monthlyBalance.get("0").getInclTaxes());

        assertEquals(37.0, annualBalance.get("1").getExclTaxes());
        assertEquals(37.0 + 37.0 * 0.2f, annualBalance.get("1").getInclTaxes());

        assertEquals(0.0, annualBalance.get("2").getExclTaxes());
    }

}
