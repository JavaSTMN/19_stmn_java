package exercice4;

public class Balance {

    private final float TAXE_PERCENTAGE = 0.2f;

    private String account;
    private double exclTaxes;
    private double inclTaxes;

    public Balance(String account, double amount) {
        this.account = account;
        this.exclTaxes = amount;
        this.inclTaxes = amount + (amount * TAXE_PERCENTAGE);
    }

    public String getAccount() {
        return account;
    }

    public double getExclTaxes() {
        return exclTaxes;
    }

    public double getInclTaxes() {
        return inclTaxes;
    }
}
