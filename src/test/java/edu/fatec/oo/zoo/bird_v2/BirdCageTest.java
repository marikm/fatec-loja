package edu.fatec.oo.zoo.bird_v2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BirdCageTest {

        final AfricanBird bird1 = new AfricanBird(2.0,3);//-4
        final EuropeanBird bird2 = new EuropeanBird();//2
        final NorwegianBird bird3 = new NorwegianBird(true);//0
        final EuropeanBird bird4 = new EuropeanBird();

    @Test
    void addBird() {
        BirdCage cage = new BirdCage();
        cage.addBird(bird1);
        cage.addBird(bird2);
        cage.addBird(bird3);
        cage.addBird(bird4);
        ArrayIndexOutOfBoundsException e = assertThrows(ArrayIndexOutOfBoundsException.class, () -> cage.addBird(bird4));
        assertEquals("The cage only fits three birds", e.getMessage());
    }

    @Test
    void getSizeBirdsList() {
        BirdCage cage = new BirdCage();
        cage.addBird(bird1);
        cage.addBird(bird2);
        cage.addBird(bird3);

        assertEquals(3, cage.getSizeBirdsList());
    }

    @Test
    void getBirds() {
        BirdCage cage = new BirdCage();
        cage.addBird(bird1);
        cage.addBird(bird2);
        cage.addBird(bird3);
        assertEquals("[AfricanBird, EuropeanBird, NorwegianBird]", cage.getBirds().toString());
    }

    @Test
    void shouldCalculateTheSpeedAverage() {
        BirdCage cage = new BirdCage();
        cage.addBird(bird1);
        cage.addBird(bird2);
        cage.addBird(bird3);
        assertEquals(-0.6666666666666666, cage.getAverageSpeed());

    }

    @Test
    void testToString() {
        BirdCage cage = new BirdCage();
        cage.addBird(bird1);
        cage.addBird(bird2);
        cage.addBird(bird3);
        assertEquals("BirdCage{birds=[AfricanBird, EuropeanBird, NorwegianBird]}", cage.toString());
    }
}