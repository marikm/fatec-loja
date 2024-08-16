package edu.fatec.oo.zoo.bird_v2;

import java.util.ArrayList;
import java.util.List;

public class BirdCage {

    private final List<Bird> birds;

    public BirdCage() {
        this.birds = new ArrayList<>();
    }

    public void addBird(Bird typeBird) {
        if(getSizeBirdsList() <= 3) {
            birds.add(typeBird);
        } else {
            throw new ArrayIndexOutOfBoundsException("The cage only fits three birds");
        }
    }

    public Integer getSizeBirdsList() {
        return birds.size();
    }

    public List<Bird> getBirds() {
        return birds;
    }

    public Double getAverageSpeed() {
        double totalSpeed = 0.0;
        for(Bird value : birds){
            totalSpeed += value.getSpeed();
        }
        return totalSpeed/getSizeBirdsList();
    }

    @Override
    public String toString() {
        return "BirdCage{" +
                "birds=" + birds +
                '}';
    }
}
