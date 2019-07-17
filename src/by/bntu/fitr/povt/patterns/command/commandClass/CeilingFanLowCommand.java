package by.bntu.fitr.povt.patterns.command.commandClass;

import by.bntu.fitr.povt.patterns.command.device.CeilingFan;

public class CeilingFanLowCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }


    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        }
        else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        }
        else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        }
        else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}