package chainofresponsiblity.handlers;

import chainofresponsiblity.pattern.EmailTypes;
import chainofresponsiblity.pattern.MailDetectorAI;


public class FanHandler extends Handler{
    
    @Override
    public void handleRequest() {
        EmailTypes type  = MailDetectorAI.detect();
        
        if(type == EmailTypes.FAN)
            System.out.println("Forwarded to CEO inbox");
        else
            this.getSuccessor().handleRequest();
    }
}
