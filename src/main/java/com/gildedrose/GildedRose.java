package com.gildedrose;

class GildedRose {
	
    Item[] items;
    
    private static final String agedBrie = "Aged Brie";
    private static final String sulfuras = "Sulfuras, Hand of Ragnaros";
    private static final String backstagePasses = "Backstage passes to a TAFKAL80ETC concert";
    private static final String conjured = "Conjured";

    public GildedRose(Item[] items) {
        this.items = items;
    }
    /*
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
    
    */
    
    public void updateQuality() {
    	for(Item i : items) {
    		updateCase(i);
    		decrementSellIn(i);
    	}
    }
    
    private void updateCase(Item i) {
    	UpdateItem item;
    	switch(i.name) {
		case agedBrie:
			item = new UpdaterIncrease();
			item.updateItem(i);
			break;
		case backstagePasses:
			item = new UpdaterIncreaseBackStage();
			item.updateItem(i);
			break;
		case conjured:
			item = new ConjuredUpdate();
			item.updateItem(i);
			break;
		case sulfuras:
			item = new Sulfuras();
			item.updateItem(i);
			break;
		default:
			item = new DecreaseDefault();
			item.updateItem(i);
			break;
		}
    }
    
    public void decrementSellIn(Item i) {
    	if(!i.name.equals(sulfuras)) {
    		i.sellIn--;
    	}
    }   
    
    
 /*   
    public void increaseAgedBrieQuality(Item i) {	
    	if(i.quality < 50) {
    		i.quality++;
    	}
    }
    
    public void increaseNotMaxBackstage(Item i) {	
    	if(i.quality < 50) {
    		i.quality++;
    	} else if (i.quality <= 10) {
    		i.quality += 2;
    	} else {
    		i.quality += 3;
    	}
    }
    
    public void decreaseQuality(Item i) {
    	decreaseQualityNotMin(i);
    	if(i.sellIn <= 0) {
    		decreaseQualityNotMin(i);
    	}
    }
    
    public void decreaseQualityNotMin(Item i) {
    	i.quality--;
    }
*/
   
    

    
    
    
}

