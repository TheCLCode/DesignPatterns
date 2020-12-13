package creational.factorymethod;

import creational.factorymethod.product.Media;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Client {

    private static final Logger logger = LogManager.getLogger(Client.class);

    public static void main(String[] args) {

        Media media;
        logger.info("Consuming music media...");
        media = Store.getStore().consumeMedia(Store.MediaType.MUSIC);
        useMedia(media);

        logger.info("Consuming video media...");
        media = Store.getStore().consumeMedia(Store.MediaType.VIDEO);
        useMedia(media);

        logger.info("Consuming print media...");
        media = Store.getStore().consumeMedia(Store.MediaType.PRINT);
        useMedia(media);

    }

    public static void useMedia(Media media){
        media.publishMedia();
        media.sellMedia();
    }

}
