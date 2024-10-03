package MyLibs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

public class Block implements Serializable{
    private int blockNum;
    private String blockName;
    //lotClass
    private ArrayList<Lot> lots;
    public static HashSet<Integer> allLots = new HashSet<>();

    public Block(String blockName, int blockNum) {
        this.blockName = blockName;
        this.blockNum = blockNum; 
        this.lots = new ArrayList<>(20);
    }

    //add constructor

    public ArrayList<Lot> getLots() {
        return lots;
    }
    
    public int getBlockNum() {
        return blockNum;
    }

    public void setBlockNum(int blockNum) {
        this.blockNum = blockNum;
    }


    public void assignLot(Lot lot) {
        lots.add(lot);
        allLots.add(lot.getLotNumber());
    }

    public void deleteLot(Lot lot) {
        lots.remove(lot);
        allLots.remove(lot.getLotNumber());
    }

    public boolean checkDuplicateLot(Lot lot) {
        return allLots.add(lot.getLotNumber());
    }


    @Override
    public String toString() {
        return blockName;
    }
}
