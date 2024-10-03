package Classes;

public class StatusForSale implements IStatus {
    private Date startSaleDate;

    public StatusForSale(Date startSaleDate) {
        this.startSaleDate = startSaleDate;
    }

    public Date getStartSaleDate() {
        return startSaleDate;
    }

    public void setStartSaleDate(Date startSaleDate) {
        this.startSaleDate = startSaleDate;
    }
}