package strategy_pattern.behaviors;

public class DoctorBehavior implements EmployeeBehavior{
    @Override
    public void performDuties() {
        doSurgery();
        diagnose();
    }
    private void doSurgery(){
        System.out.println("Doing Surgery ...");
    }
    private void diagnose(){
        System.out.println("Diagnosing ...");
    }
}
