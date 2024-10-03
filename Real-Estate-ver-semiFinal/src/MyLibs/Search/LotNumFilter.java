/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs.Search;

import java.util.List;
import java.util.stream.Collectors;

import MyLibs.Lot;
/**
 *
 * @author ADMIN
 */
public class LotNumFilter extends LotSearchDecorator {
    private int lotNumber;
    
    public LotNumFilter(Search decoratedSearch, int lotNumber) {
        super(decoratedSearch);
        
        this.lotNumber = lotNumber;
    }

    @Override
    public List<Lot> search(List<Lot> lots) {
        
        return super.search(lots).stream()
                .filter(lot -> lot.getLotNumber() == lotNumber)
                .collect(Collectors.toList());
    }
}
