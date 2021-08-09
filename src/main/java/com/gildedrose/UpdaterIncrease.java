package com.gildedrose;

public class UpdaterIncrease implements UpdateItem {

	@Override
	public void updateItem(Item i) {
		// TODO Auto-generated method stub
		if(i.quality < 50) {
    		i.increase();
    	}
	}

}
