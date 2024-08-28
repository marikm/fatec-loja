package edu.fatec.oo.zoo.bird_v2;

import java.util.Objects;

class AfricanBird extends Bird {
    final private Integer numberOfCoconuts;
    final private Double loadFactor;

    public AfricanBird(final Double loadFactor, final Integer numberOfCoconuts) {
        this.loadFactor = loadFactor;
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed() - getLoadFactor() * getNumberOfCoconuts();
    }

    public Integer getNumberOfCoconuts() {
        return numberOfCoconuts;
    }

    public Double getLoadFactor() {
        return loadFactor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AfricanBird that = (AfricanBird) o;
        return Objects.equals(numberOfCoconuts, that.numberOfCoconuts) && Objects.equals(loadFactor, that.loadFactor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfCoconuts, loadFactor);
    }
}
