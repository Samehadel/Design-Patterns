package strategy_pattern;

import strategy_pattern.behaviors.DoctorBehavior;
import strategy_pattern.behaviors.EmployeeBehavior;
import strategy_pattern.behaviors.NurseBehavior;

public class StrategyRunner {
    public static void main(String [] args){

        Employee nurse = new Employee();
        Employee doctor = new Employee();

        nurse.setBehavior(new NurseBehavior());
        doctor.setBehavior(new DoctorBehavior());

        nurse.startWork();
        doctor.startWork();
    }
}
