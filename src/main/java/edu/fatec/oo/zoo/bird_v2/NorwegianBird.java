package edu.fatec.oo.zoo.bird_v2;

class NorwegianBird extends Bird {

    final private Boolean isNailed;

    public NorwegianBird(final Boolean isNailed) {
        this.isNailed = isNailed;
    }

    @Override
    double getSpeed() {
        if (getNailed()) {
            return 0;
        }

        return getBaseSpeed();
    }

    public Boolean getNailed() {
        return isNailed;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
