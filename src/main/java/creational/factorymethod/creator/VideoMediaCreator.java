package creational.factorymethod.creator;

import creational.factorymethod.product.Media;
import creational.factorymethod.product.VideoMedia;

public class VideoMediaCreator implements MediaCreator {

    public Media createMedia() {
        Media media = new VideoMedia();
        return media;
    }

}
