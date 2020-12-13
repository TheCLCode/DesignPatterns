package creational.factorymethod.product;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MusicMedia implements Media {

    private Logger logger = LogManager.getLogger(MusicMedia.class);

    public void publishMedia() {
        logger.info("Publishing media to music streaming sites...");
    }

    public void sellMedia() {
        logger.info("Selling media to music stores...");
    }
}
