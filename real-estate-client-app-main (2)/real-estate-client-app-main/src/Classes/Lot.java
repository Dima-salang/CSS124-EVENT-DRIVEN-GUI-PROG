package Classes;

public class Lot {
    private int lotNumber;
    private int blockNum;
    private double lotSize;
    private double lotPrice;
    private IStatus lotStatus;

    public Lot(int lotNumber, int blockNum, double lotSize, double lotPrice, IStatus lotStatus) {
        this.lotNumber = lotNumber;
        this.blockNum = blockNum;
        this.lotSize = lotSize;
        this.lotPrice = lotPrice;
        this.lotStatus = lotStatus;
    }

    public int getLotNumber() {
        return lotNumber;
    }
  
    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }
   
    public int getBlockNum() {
        return blockNum;
    }
   
    public void setBlockNum(int blockNum) {
        this.blockNum = blockNum;
    }
    
    public double getLotSize() {
        return lotSize;
    }
   
    public void setLotSize(double lotSize) {
        this.lotSize = lotSize;
    }
   
    public double getLotPrice() {
        return lotPrice;
    }
   
    public void setLotPrice(double lotPrice) {
        this.lotPrice = lotPrice;
    }
    
    public IStatus getLotStatus() {
        return lotStatus;
    }
    
    public void setLotStatus(IStatus lotStatus) {
        this.lotStatus = lotStatus;
    }
}
