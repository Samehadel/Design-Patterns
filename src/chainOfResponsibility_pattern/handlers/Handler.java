package chainofresponsiblity.handlers;

public abstract class Handler {
    private Handler successor; 
    
    public abstract void handleRequest();

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public Handler getSuccessor() {
        return successor;
    }
    
}
