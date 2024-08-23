package edu.fatec.oo.gamerobot;

import org.junit.jupiter.api.Test;

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

            if(robot instanceof Level2Robot) {
                Level2Robot robot2 = (Level2Robot) robot;
                robot2.flyAndFire();
            } else {
                robot.fire();
            }


            lives--;
        }


    }

}