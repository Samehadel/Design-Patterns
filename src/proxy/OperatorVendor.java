package proxy;

public class OperatorVendor implements Operator{
    @Override
    public void operate() {
        System.out.println("Some operation");

    }

    public static class OperatorProxy implements Operator {
        private Operator operator;

        public OperatorProxy(Operator operator) {
            this.operator = operator;
        }

        @Override
        public void operate() {
            System.out.println("Some operations before");
            operator.operate();
            System.out.println("Some operations after");
        }
    }
}
