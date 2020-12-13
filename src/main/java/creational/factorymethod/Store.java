package creational.factorymethod;

import creational.factorymethod.creator.MediaCreator;
import creational.factorymethod.creator.MusicMediaCreator;
import creational.factorymethod.creator.PrintMediaCreator;
import creational.factorymethod.creator.VideoMediaCreator;
import creational.factorymethod.product.Media;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class Store {

    private static Store INSTANCE;

    private Store() {

    }

    public static Store getStore() {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        synchronized (Store.class) {
            if (INSTANCE == null) {
                INSTANCE = new Store();
            }
        }
        return INSTANCE;
    }


    Logger logger = LogManager.getLogger(Store.class);

    public Media consumeMedia(MediaType type) {
        switch (type) {
            case MUSIC:
                return MediaType.MUSIC.creator.createMedia();
            case VIDEO:
                return MediaType.VIDEO.creator.createMedia();
            case PRINT:
                return MediaType.PRINT.creator.createMedia();
            default:
                logger.info("Cannot find media!");
                return null;
        }
    }


    enum MediaType {
        MUSIC(new MusicMediaCreator()), VIDEO(new VideoMediaCreator()), PRINT(new PrintMediaCreator());

        MediaCreator creator;

        MediaType(MediaCreator creator) {
            this.creator = creator;
        }
    }


}
