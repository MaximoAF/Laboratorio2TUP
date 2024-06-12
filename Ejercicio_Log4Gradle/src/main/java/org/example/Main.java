package org.example;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

class Main {
    final Level VERBOSE = Level.forName("VERBOSE",150);
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Main app = new Main();

        if(logger.isErrorEnabled())
            logger.error("Esto es un error");
        logger.info("Entering application.");
        logger.debug("esto es debug Logging!");
        logger.log(app.VERBOSE, "a verbose massage");

    }
}