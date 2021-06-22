package facade_pattern.main;


public class FacadePatternRunner {


    public static void main(String[] args) {
        //Client
        CarOperations operations = new CarOperations();
        
        operations.turnEngineOn();
        
        
        operations.turnEngineOff();
    }
    
}
