package racing.model;

import racing.strategy.GoStraightStrategy;

import java.util.Random;

public class Car implements Comparable<Car> {

//    private int currentLocation;

    private CurrentLocation currentLocation;

    private Name name;

    public Car(int startLocation, String name) {
        this(new Name(name),new CurrentLocation(startLocation));
    }

    public Car(Name name,CurrentLocation startLocation) {
        this.name = name;
        this.currentLocation = startLocation;
    }

    public String getName() {
        return name.getName();
    }

    public int getCurrentLocation() {
        return currentLocation.getCurrentLocation();
    }

    public void goStraight(GoStraightStrategy goStraightStrategy) {
        if (goStraightStrategy.isGoStraight()) {
            this.currentLocation.geStraight();
        }
    }
    public boolean isSameCurrentLocation(Car comparisonCar){
        return currentLocation.isSameCurrentLocation(comparisonCar.currentLocation);
    }

    @Override
    public int compareTo(Car o) {
        return currentLocation.compareCurrentLocation(o.currentLocation);
    }
}