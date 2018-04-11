package ProjSpring;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.collections4.*;
import org.joda.time.DateTime;
import org.springframework.format.datetime.joda.JodaTimeContext;
import java.time.*;

import java.util.regex.*;


public class Brud {



    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[^m]");
        Matcher matcher = pattern.matcher
                ("Lorem Ipsum");

        System.out.println(matcher.find());
        System.out.println(matcher.find());

//

        System.out.println("Hello World!");
        System.out.println("it's me, Wombat!");

        String a = new String ("TEST");
        String b = new String ("TEST");

        String c = "Test";

        if(a == b) {
            System.out.println ("TRUE");
        } else {
            System.out.println("FALSE");
        }



        }

}
