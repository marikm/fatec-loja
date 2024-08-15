package edu.fatec.oo.zoo.bird_v2;

class AfricanBird extends Bird {
    final private Integer numberOfCoconuts;
    final private Double loadFactor;

    public AfricanBird(final Double loadFactor, final Integer numberOfCoconuts) {
        this.loadFactor = loadFactor;
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    double getSpeed() {
        return getBaseSpeed() - getLoadFactor() * getNumberOfCoconuts();
    }

    public Integer getNumberOfCoconuts() {
        return numberOfCoconuts;
    }

    public Double getLoadFactor() {
        return loadFactor;
    }
}
