package ch01;

import static ch01.Robot.Command.*;
import static ch01.Robot.Command.JUMP;

/**
 * 1. 매직 넘버 -> 기호 상수 변경
 * 2. 기호 상수로만 호출되도록 변경
 */
public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Andrew");
        robot.order(WALK); // walk
        robot.order(STOP); // stop
        robot.order(JUMP); // jump
    }
}
