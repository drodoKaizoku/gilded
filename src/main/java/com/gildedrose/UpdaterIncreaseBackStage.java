package com.gildedrose;

public class UpdaterIncreaseBackStage implements UpdateItem {

	@Override
	public void updateItem(Item i) {
		// TODO Auto-generated method stub
		if (i.sellIn <= 0) {
			i.quality = 0;
			
		} else if(i.quality <= 5) {
			loopIncrease(3, i);
			
    	} else if (i.quality <= 10) {
    		loopIncrease(2, i);
    		
    	} else {
    		i.increase();
    	}
		
	}
	
	private void loopIncrease(int k, Item i) {
		for(int j = 0 ; j < k ; j++) {
			i.increase();
		}
	}

}
