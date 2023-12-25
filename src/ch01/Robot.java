package ch01;

import static ch01.Robot.Command.*;

public class Robot {
    private final String _name;

    public Robot(String name) {
        this._name = name;
    }

    public void order(Robot.Command command) {
        if (command == WALK) {
            System.out.println(_name + " walks");
        } else if (command == STOP) {
            System.out.println(_name + " stops.");
        } else if (command == JUMP) {
            System.out.println(_name + " jumps.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }

    enum Command {
        WALK, STOP, JUMP;
    }
}
