package chainofresponsiblity.handlers;

import chainofresponsiblity.pattern.EmailTypes;
import chainofresponsiblity.pattern.MailDetectorAI;


public class ComplaintHandler extends Handler {
    
    @Override
    public void handleRequest() {
        EmailTypes type  = MailDetectorAI.detect();
        
        if(type == EmailTypes.COMPLAINT)
            System.out.println("Forwarded to business development inbox");
        else
            System.out.println(type +" Failed to be handled");;
    }
}
