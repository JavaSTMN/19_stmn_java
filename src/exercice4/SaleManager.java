package exercice4;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SaleManager {

    private Map<String, ArrayList<Sale>> listMap = new HashMap<>();

    public void registerSale(Sale sale, String accountId){
        if (listMap.get(accountId) != null){
            listMap.get(accountId).add(sale);
        } else {
            ArrayList<Sale> sales = new ArrayList<>();
            sales.add(sale);
            listMap.put(accountId, sales);
        }
    }

    public Map<String, Balance> getMonthlyBalance(){
        ZonedDateTime now = ZonedDateTime.now();
        Map<String, Balance> balance = new HashMap<>();
        for (Map.Entry<String, ArrayList<Sale>> entry : listMap.entrySet()) {
            double result = 0;
            for (Sale sale: entry.getValue()) {
                if(sale.getDate().toInstant().isAfter(now.plusMonths(-1).toInstant())){
                    result += sale.getCost();
                }
            }
            balance.put(entry.getKey(), new Balance(entry.getKey(), result));
        }
        return balance;
    }

    public Map<String, Balance> getAnnualBalance(){
        ZonedDateTime now = ZonedDateTime.now();
        Map<String, Balance> balance = new HashMap<>();
        for (Map.Entry<String, ArrayList<Sale>> entry : listMap.entrySet()) {
            double result = 0;
            for (Sale sale: entry.getValue()) {
                if(sale.getDate().toInstant().isAfter(now.plusYears(-1).toInstant())){
                    result += sale.getCost();
                }
            }
            balance.put(entry.getKey(), new Balance(entry.getKey(), result));
        }
        return balance;
    }
}
