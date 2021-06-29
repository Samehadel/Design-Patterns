package strategy_pattern;

import strategy_pattern.behaviors.EmployeeBehavior;

public class Employee {
    private EmployeeBehavior behavior;

    public void startWork(){
        behavior.performDuties();
    }
    public void setBehavior(EmployeeBehavior behavior) {
        this.behavior = behavior;
    }
}
