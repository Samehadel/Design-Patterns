package chainofresponsiblity.pattern;

import java.util.Random;

/*
Acts as an AI mail classifier
*/
public class MailDetectorAI {
    public static EmailTypes detect(){
        Random random = new Random();
    
        return EmailTypes.values()[random.nextInt(2)];
    }
}
