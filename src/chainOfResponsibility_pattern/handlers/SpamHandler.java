package chainofresponsiblity.handlers;

import chainofresponsiblity.main.EmailTypes;
import chainofresponsiblity.main.MailDetectorAI;

public class SpamHandler extends Handler{

    public SpamHandler(Handler successor) {
        super(successor);
    }

    
    @Override
    public void handleRequest(int n) {
        EmailTypes type  = MailDetectorAI.detect(n);
        
        if(type == EmailTypes.SPAM)
            System.out.println("Forwarded to delete box");
        else{
            if(this.getSuccessor() != null)
                this.getSuccessor().handleRequest(n);
            else
                System.out.println(type +" Failed to be handled");
        }
            
    }
    
}
