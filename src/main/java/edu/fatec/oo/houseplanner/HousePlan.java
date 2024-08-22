package edu.fatec.oo.houseplanner;

import java.util.List;

public class HousePlan {

    final private List<Shape> rooms;

    public HousePlan(final List<Shape> rooms) {
        this.rooms = rooms;
    }

    public List<Shape> getRooms() {
        return this.rooms;
    }

    public Double getTotalArea() {
        Double total = 0.0;
        for (Shape room : this.rooms) {
            total += room.area();
        }
        return total;
    }

    @Override
    public String toString() {
        return "HousePlan{" +
                "rooms=" + rooms +
                '}';
    }



}
