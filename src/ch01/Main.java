package ch01;

import static ch01.Robot.*;

/**
 * 1. 매직 넘버 -> 기호 상수 변경
 * 2. 기호 상수로만 호출되도록 변경
 */
public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Andrew");
        robot.order(COMMAND_WALK); // walk
        robot.order(COMMAND_STOP); // stop
        robot.order(COMMAND_JUMP); // jump
//        robot.order(0); // walk
//        robot.order(1); // stop
//        robot.order(2); // jump
    }
}
