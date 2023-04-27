package racingCar.domain;

public class Distance implements Comparable<Distance> {
	private final int amount;

	public int getAmount() {
		return amount;
	}

	public Distance(int amount) {
		this.amount = amount;
	}

	public static Distance from(int amount) {
		return new Distance(amount);
	}

	public Distance add(Distance distance) {
		return new Distance(distance.amount + 1);
	}

	public static Distance create() {
		return new Distance(0);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Distance) {
			Distance distance = (Distance) obj;
			return this.amount == distance.amount;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return amount;
	}

	@Override
	public int compareTo(Distance otherDistance) {
		return Integer.compare(this.amount, otherDistance.amount);
	}
}
