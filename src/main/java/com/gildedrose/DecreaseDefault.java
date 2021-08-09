package com.gildedrose;

public class DecreaseDefault implements UpdateItem {

	@Override
	public void updateItem(Item i) {
		// TODO Auto-generated method stub
		i.decrease();
		if(i.sellIn <=0) {
			i.decrease();
		}	
	}
	
}
