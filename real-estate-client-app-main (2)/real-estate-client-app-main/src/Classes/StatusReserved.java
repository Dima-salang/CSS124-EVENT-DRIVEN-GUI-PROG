package classes;

public class StatusReserved implements IStatus {
    private String reserveeName;
    private Date reserveDate;

    public StatusReserved(String reserveeName, Date reserveDate) {
        this.reserveeName = reserveeName;
        this.reserveDate = reserveDate;
    }

    public String getReserveeName() {
        return reserveeName;
    }
    
    public void setReserveeName(String reserveeName) {
        this.reserveeName = reserveeName;
    }
    
    public Date getReserveDate() {
        return reserveDate;
    }
    
    public void setReserveDate(Date reserveDate) {
        this.reserveDate = reserveDate;
    }
}
