package edu.fatec.oo.houseplanner;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HousePlanTest {

    @Test
    void shouldReturnTotalAreaOfTheHouse() {
        final List<Shape> rooms = new ArrayList<>();
        rooms.add(new Rectangle(2.0, 3.0));
        rooms.add(new Circle(2.0));

        HousePlan h1 = new HousePlan(rooms);
        assertEquals(18.566370614359172,h1.getTotalArea());
    }

    @Test
    void shouldReturnTheListOfHouseRooms() {
        final List<Shape> rooms = new ArrayList<>();
        rooms.add(new Rectangle(2.0, 3.0));
        rooms.add(new Circle(2.0));

        HousePlan h2 = new HousePlan(rooms);
        assertEquals("[Rectangle{y=3.0, x=2.0}, Circle{r=2.0}]", h2.getRooms().toString());
    }

    @Test
    void housePlanToString() {
        final List<Shape> rooms = new ArrayList<>();
        rooms.add(new Rectangle(3.0, 5.0));
        rooms.add(new Rectangle(6.0, 2.0));

        HousePlan h3 = new HousePlan(rooms);
        assertEquals("HousePlan{rooms=[Rectangle{y=5.0, x=3.0}, Rectangle{y=2.0, x=6.0}]}", h3.toString());
    }
}