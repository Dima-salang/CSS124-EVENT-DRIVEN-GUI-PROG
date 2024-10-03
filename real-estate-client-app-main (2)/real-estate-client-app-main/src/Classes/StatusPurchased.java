package classes;

public class StatusPurchased implements IStatus {
    private String purchaserName;
    private Date purchaseDate;

    public StatusPurchased(String purchaserName, Date purchaseDate) {
        this.purchaserName = purchaserName;
        this.purchaseDate = purchaseDate;
    }

    public String getPurchaserName() {
        return purchaserName;
    }

    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
