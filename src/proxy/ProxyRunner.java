package proxy;

public class ProxyRunner {
    public static void main(String [] args){
        Operator op = new OperatorVendor();
        Operator opProxy = new OperatorVendor.OperatorProxy(op);

        opProxy.operate();
    }
}
