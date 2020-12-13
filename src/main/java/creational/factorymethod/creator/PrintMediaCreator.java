package creational.factorymethod.creator;

import creational.factorymethod.product.Media;
import creational.factorymethod.product.PrintMedia;

public class PrintMediaCreator implements MediaCreator {

    public Media createMedia() {
        Media media = new PrintMedia();
        return media;
    }

}
