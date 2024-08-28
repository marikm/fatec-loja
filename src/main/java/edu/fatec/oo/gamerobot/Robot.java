package edu.fatec.oo.gamerobot;

// interface = trait = contrato
public interface Robot {
    Double getDamageRate();

    void fire();
}

interface CanFly {
    void fly();
}

interface SuperSpeed {
    void runFast();
}

interface SuperRobot extends Robot, CanFly, SuperSpeed {

}


abstract class BaseRobot implements Robot {
    @Override
    public void fire() {
        System.out.println(this.getClass().getSimpleName() + " fire=" + getDamageRate());
    }
}

class Level1Robot extends BaseRobot implements SuperRobot {
    @Override
    public Double getDamageRate() {
        return 0.0;
    }

    @Override
    public void fly() {
        System.out.println("Leve1Robot flying...");
    }

    @Override
    public void runFast() {
        System.out.println("Leve1Robot running really fast...");
    }
}

class Level2Robot extends BaseRobot implements SuperRobot {
    @Override
    public Double getDamageRate() {
        return 2.0;
    }

    @Override
    public void fly() {
        System.out.println("Leve2Robot flying...");
    }

    @Override
    public void runFast() {
        System.out.println("Leve2Robot running really fast...");
    }
}
