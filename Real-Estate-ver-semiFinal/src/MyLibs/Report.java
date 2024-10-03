package MyLibs;

public class Report {
    public static double AveLotSize(Block[] blocks){
        double totalSize = 0;
        for(Block block: blocks){
            for(Lot lot: block.getLots()){
                totalSize += lot.getLotSize();
            }
        }
        
        return ((int)Math.round(totalSize * 10.0))/100.0;//round to two decimal places
    }
    
    public static double AveLotPrice(Block[] blocks){
        double totalPrice = 0;
        for(Block block: blocks){
            for(Lot lot: block.getLots()){
                totalPrice += lot.getLotPrice();
            }
        }
        
        return ((int)Math.round(totalPrice * 10.0))/100.0;//round to two decimal places
    }
    
    public static int[] StatusCount(Block[] blocks){
        int totalReserved = 0;
        int totalForSale = 0;
        int totalSold = 0;
        
        for(Block block: blocks){
            for(Lot lot: block.getLots()){
                System.out.println(totalReserved);
                if(lot.getLotStatus().toString().equals("Reserved")) totalReserved++;
                else if(lot.getLotStatus().toString().equals("For Sale")) totalForSale++;
                else if(lot.getLotStatus().toString().equals("Purchased")) totalSold++;
            }
        }
        int[] totals = {totalReserved, totalForSale, totalSold};
        return totals;
    }
}
