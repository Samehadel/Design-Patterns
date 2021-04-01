package chainofresponsiblity.handlers;

public abstract class Handler {
    private Handler successor; 
    
    Handler(Handler successor){
        this.successor = successor;
    }
    public abstract void handleRequest(int n);

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public Handler getSuccessor() {
        return successor;
    }
    
}
