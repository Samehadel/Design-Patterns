package strategy_pattern.behaviors;

public class NurseBehavior implements EmployeeBehavior{
    @Override
    public void performDuties() {
        drawBlood();
        cleanPatientArea();
    }
    private void drawBlood(){
        System.out.println("Drawing Blood ...");
    }
    private void cleanPatientArea(){
        System.out.println("Clean Patient Area ...");
    }
}
