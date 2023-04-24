package ch01;

public class RobotCommand {
    private final String _name;

    public RobotCommand(String name) {
        this._name = name;
    }

    @Override
    public String toString() {
        return "[ RobotCommand: " + _name + " ]";
    }
}
