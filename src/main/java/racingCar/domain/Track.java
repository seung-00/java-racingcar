package racingCar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Track {
	private final List<Car> carList;

	public Track(List<Car> carList) {
		this.carList = carList;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public static Track create() {
		List<Car> carList = new ArrayList<>();

		return new Track(carList);
	}

	public void putRaceCar(Car... carList) {
		for (Car car : carList) {
			this.carList.add(car);
		}
	}

	public void run(int round) {
		for (int i = 0; i < round; i++) {
			raceAround();
		}
	}

	public void raceAround() {
		for (Car car : carList) {
			car.drive();
		}
	}

	public List<Car> findWinners() {
		Car maxDistanceCar = findCarWithMaxDistance();

		return carList.stream()
			.filter(car -> car.isSameDistance(maxDistanceCar))
			.collect(Collectors.toList());
	}

	private Car findCarWithMaxDistance() {
		return carList.stream()
			.sorted()
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("자동차가 존재하지 않습니다."));
	}
}
