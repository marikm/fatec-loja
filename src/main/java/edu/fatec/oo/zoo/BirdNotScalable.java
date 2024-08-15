package edu.fatec.oo.zoo;


// SRP - single responsiblity principle - too much / sabe mais / faz-tudo
// nao escala - para cada passirinho, ela cresce,
// falta encapsulamento

public class BirdNotScalable {
    final Integer numberOfCoconuts = 10;
    final Boolean isNailed = false;

    double getSpeed(BirdType type) {

        if (type == BirdType.EUROPEAN) {
            return getBaseSpeed();

        } else if (type == BirdType.AFRICAN) {
            return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;

        } else if (type == BirdType.NORWEGIAN_BLUE) {
            return (isNailed) ? 0 : getBaseSpeed();

        }

        throw new RuntimeException("I only know 3 types, I should not get to this point.");
    }

  private Double getLoadFactor() {
    return null;
  }

  private double getBaseSpeed() {
    return 0;
  }

}

