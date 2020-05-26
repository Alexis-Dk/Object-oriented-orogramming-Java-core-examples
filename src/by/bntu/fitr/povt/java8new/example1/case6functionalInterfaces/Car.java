package by.bntu.fitr.povt.java8new.example1.case6functionalInterfaces;

public class Car {
    private String name;
    private boolean isFullDrive;
    private boolean isGasEngine;

    public Car(String name, boolean isFullDrive, boolean isGasEngine) {
        this.name = name;
        this.isFullDrive = isFullDrive;
        this.isGasEngine = isGasEngine;
    }

    public boolean isFullDrive() {
        return isFullDrive;
    }

    public boolean isGasEngine() {
        return isGasEngine;
    }

    @Override
    public String toString() {
        return name;
    }
}
