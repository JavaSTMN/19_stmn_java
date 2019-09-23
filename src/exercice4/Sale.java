package exercice4;

import java.util.Date;

public class Sale {

    private Date date;
    private double cost;


    public Sale(Date date, double cost) {
        this.date = date;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public Date getDate() {
        return date;
    }
}
