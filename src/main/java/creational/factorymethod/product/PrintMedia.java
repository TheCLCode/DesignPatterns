package creational.factorymethod.product;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class PrintMedia implements Media {

    Logger logger = LogManager.getLogger(PrintMedia.class);

    public void publishMedia() {
        logger.info("Publishing to magazines and newspapers...");
    }

    public void sellMedia() {
        logger.info("Selling to bookstores and eBook stores");
    }
}
