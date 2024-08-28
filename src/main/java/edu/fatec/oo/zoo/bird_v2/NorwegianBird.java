package edu.fatec.oo.zoo.bird_v2;

import java.util.Objects;

class NorwegianBird extends Bird {

    final private Boolean isNailed;

    public NorwegianBird(final Boolean isNailed) {
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        if (getNailed()) {
            return 0;
        }

        return getBaseSpeed();
    }

    public Boolean getNailed() {
        return isNailed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NorwegianBird that = (NorwegianBird) o;
        return Objects.equals(isNailed, that.isNailed);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isNailed);
    }
}
