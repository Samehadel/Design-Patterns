package chainofresponsiblity.pattern;

import java.util.Random;

/*
Acts as an AI mail classifier
*/
public class MailDetectorAI {
    public static EmailTypes detect(int n){
        
        return EmailTypes.values()[n];
    }
}
