package chainofresponsiblity.handlers;

import chainofresponsiblity.main.EmailTypes;
import chainofresponsiblity.main.MailDetectorAI;


public class FanHandler extends Handler{

    public FanHandler(Handler successor) {
        super(successor);
    }
    
    @Override
    public void handleRequest(int n) {
        EmailTypes type  = MailDetectorAI.detect(n);
        
        if(type == EmailTypes.FAN)
            System.out.println("Forwarded to CEO inbox");
        else{
            if(this.getSuccessor() != null)
                this.getSuccessor().handleRequest(n);
            else
                System.out.println(type +" Failed to be handled");
        }
    }
}
