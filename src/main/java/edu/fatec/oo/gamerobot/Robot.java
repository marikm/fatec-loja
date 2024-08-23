package edu.fatec.oo.gamerobot;

public abstract class Robot {

    public abstract Double getDamageRate();

    public void fire() {
        System.out.println("fire-dmg: " + getDamageRate());
    }

}

class Level1Robot extends Robot  {

    @Override
    public Double getDamageRate() {
        return 1.0;
    }

}

class Level2Robot extends Robot {

    @Override
    public Double getDamageRate() {
        return 2.0;
    }

    public void flyAndFire() {
        System.out.println("I'm flying and fire-dmg: " + getDamageRate());
    }
}

