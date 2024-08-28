package edu.fatec.oo.zoo.bird_v2;



public abstract class Bird {

    public abstract double getSpeed();

    public double getBaseSpeed() {
        return 2.0;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
