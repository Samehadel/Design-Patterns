package chainofresponsiblity.handlers;

import chainofresponsiblity.pattern.EmailTypes;
import chainofresponsiblity.pattern.MailDetectorAI;

public class SpamHandler extends Handler{

    @Override
    public void handleRequest() {
        EmailTypes type  = MailDetectorAI.detect();
        
        if(type == EmailTypes.SPAM)
            System.out.println("Forwarded to delete box");
        else
            this.getSuccessor().handleRequest();
    }
    
}
