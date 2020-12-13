package creational.factorymethod.creator;

import creational.factorymethod.product.Media;
import creational.factorymethod.product.MusicMedia;

public class MusicMediaCreator implements MediaCreator {

    public Media createMedia() {
        Media media = new MusicMedia();
        return media;
    }
}
