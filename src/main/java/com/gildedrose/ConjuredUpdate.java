package com.gildedrose;

public class ConjuredUpdate implements UpdateItem {

	@Override
	public void updateItem(Item i) {
		// TODO Auto-generated method stub
		if(i.sellIn <= 0) {
			i.quality -= 4;
		}
		else {
			i.quality -= 2;
		}
		
	}

}
