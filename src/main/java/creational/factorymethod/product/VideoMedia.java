package creational.factorymethod.product;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class VideoMedia implements Media {

    Logger logger = LogManager.getLogger(VideoMedia.class);

    public void publishMedia() {
        logger.info("Publishing media to video streaming websites...");
    }

    public void sellMedia() {
        logger.info("Selling media to video stores and video streaming websites...");
    }
}
