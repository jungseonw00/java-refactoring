package ch08.before;

import java.util.StringTokenizer;

import static ch08.before.Command.*;

public class Robot {
    private final String name;
    private final Position position = new Position(0, 0);
    private final Direction direction = new Direction(0, 1);

    public Robot(String name) {
        this.name = name;
    }

    void execute(String commandSequence) {
        StringTokenizer tokenizer = new StringTokenizer(commandSequence);
        try {
            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                executeCommand(token);
            }
        } catch (InvalidCommandException e) {
            System.out.println("Invalid command: " + e.getMessage());
        }
    }

    void executeCommand(String commandString) throws InvalidCommandException {
        Command command = Command.parseCommand(commandString);
        executeCommand(command);
    }

    void executeCommand(Command command) throws InvalidCommandException {
        if (command == FORWARD) {
            position.relativeMove(direction.x, direction.y);
        } else if (command == BACKWARD) {
            position.relativeMove(-direction.x, -direction.y);
        } else if (command == TURN_RIGHT) {
            direction.setDirection(direction.y, -direction.x);
        } else if (command == TURN_LEFT) {
            direction.setDirection(-direction.y, direction.x);
        } else {
            throw new InvalidCommandException();
        }
    }

    @Override
    public String toString() {
        return "[ Robot: " + name + " " + "position(" + position.x + ", " + position.y +"), "
            + "direction(" + direction.x + ", " + direction.y + ") ]";
    }
}
