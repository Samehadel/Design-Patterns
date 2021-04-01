package chainofresponsiblity.pattern;

import chainofresponsiblity.handlers.FanHandler;
import chainofresponsiblity.handlers.SpamHandler;
import chainofresponsiblity.handlers.Handler;
import chainofresponsiblity.handlers.ComplaintHandler;

public class Main {

    public static void main(String[] args) {

        Handler spamHandler = new SpamHandler();
        Handler fanHandler = new FanHandler();
        Handler comHandler = new ComplaintHandler();
        
        
        spamHandler.setSuccessor(fanHandler);
        fanHandler.setSuccessor(comHandler);
        
        spamHandler.handleRequest();
    }
    
}
