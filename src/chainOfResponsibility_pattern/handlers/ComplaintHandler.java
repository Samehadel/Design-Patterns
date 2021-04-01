package chainofresponsiblity.handlers;

import chainofresponsiblity.pattern.EmailTypes;
import chainofresponsiblity.pattern.MailDetectorAI;


public class ComplaintHandler extends Handler {

    public ComplaintHandler(Handler successor) {
        super(successor);
    }
    
    
    @Override
    public void handleRequest(int n) {
        EmailTypes type  = MailDetectorAI.detect(n);
        
        if(type == EmailTypes.COMPLAINT)
            System.out.println("Forwarded to business development inbox");
        else{
            if(this.getSuccessor() != null)
                this.getSuccessor().handleRequest(n);
            else
                System.out.println(type +" Failed to be handled");
        }
            
    }
}
