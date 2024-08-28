package edu.fatec.oo.gamerobot;

import edu.fatec.PessoaFisica;
import org.junit.jupiter.api.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class RobotTest {


    @Test
    public void testBasicRobot() {


        int lives = 10;
        final Random randomGenerator = new Random();
        while(lives > 0) {

            Robot robot = null;

            int r = randomGenerator.nextInt(100);
            if (r % 2 == 0) {
                robot = new Level1Robot();
            } else {
                robot = new Level2Robot();
            }
            System.out.println(robot instanceof Level1Robot);
            System.out.println(robot instanceof Level2Robot);


            robot.fire();

            lives--;
        }


    }


    @Test
    public void testInterfaces() {

        SuperRobot robot = new Level1Robot();
        robot.fire();
        robot.fly();
        robot.runFast();
        printInstanceOf(robot);

        robot = new Level2Robot();
        robot.fire();
        robot.fly();
        robot.runFast();
        printInstanceOf(robot);
    }

    private static void printInstanceOf(final Robot robot) {
        System.out.println("robot is BaseRobot? " + (robot instanceof BaseRobot));
        System.out.println("robot is Level1Robot? " + (robot instanceof Level1Robot));
        System.out.println("robot is Level2Robot? " + (robot instanceof Level2Robot));
        System.out.println("robot can CanFly? " + (robot instanceof CanFly));
        System.out.println("robot has SuperSpeed? " + (robot instanceof SuperSpeed));
        System.out.println();
    }

}