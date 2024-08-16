package edu.fatec.oo.zoo.bird_v2;

class EuropeanBird extends Bird {

    @Override
    double getSpeed() {
        return getBaseSpeed();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
