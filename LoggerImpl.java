package ProjSpring;

import java.util.Date;

public class LoggerImpl
implements Logger {

    private Logger logger;


    public void log(String message) {
        System.out.println(new Date()+
        ": " + message);

    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
