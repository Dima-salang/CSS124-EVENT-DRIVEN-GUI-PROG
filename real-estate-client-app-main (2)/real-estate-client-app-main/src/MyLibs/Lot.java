package MyLibs;

import java.io.Serializable;

public class Lot implements Serializable{
    String lotNumber;
    Block block;
    double lotSize;
    double lotPrice;
    Status lotStatus;

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlockNum(Block block) {
        this.block = block;
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

    public Status getLotStatus() {
        return lotStatus;
    }

    public void setLotStatus(Status lotStatus) {
        this.lotStatus = lotStatus;
    }

   
}
