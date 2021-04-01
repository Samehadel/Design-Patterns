package chainofresponsiblity.pattern;

import chainofresponsiblity.handlers.FanHandler;
import chainofresponsiblity.handlers.SpamHandler;
import chainofresponsiblity.handlers.Handler;
import chainofresponsiblity.handlers.ComplaintHandler;
import java.util.Random;

/*
Note: Instead of passing an email to actual AI classifier, using (int n) as simulation to a real scenario
*/
public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int n = random.nextInt(3); //Get a random type of email
        
        Handler comHandler = new ComplaintHandler(null); //Final in the chain
        Handler spamHandler = new SpamHandler(comHandler); //Second in the chain
        Handler fanHandler = new FanHandler(spamHandler); //First in the chain
        
        
        
        spamHandler.setSuccessor(fanHandler);
        fanHandler.setSuccessor(comHandler);
        
        spamHandler.handleRequest(n);
    }
    
}
