package edu.fatec.oo.houseplanner;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HousePlanTest {

    @Test
    public void test() {
        final List<Shape> rooms = new ArrayList<>();
        rooms.add(new Rectangle(2.0, 3.0));
        rooms.add(new Circle(2.0));

        HousePlan h1 = new HousePlan(rooms);

        assertEquals(2, rooms.size());

        assertEquals(6.0,h1.getRooms().get(0).area());
        assertEquals(12.566370614359172,h1.getRooms().get(1).area());
        assertEquals(18.566370614359172,h1.getTotalArea());
    }

}