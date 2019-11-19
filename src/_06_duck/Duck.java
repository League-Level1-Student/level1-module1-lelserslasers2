package _06_duck;

public class Duck {
	String favoriteFood;
	int numberOfFriends;
	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
		System.out.println("i am alive");
	}
	void quack() {
		for (int i = 0; i < numberOfFriends; i++) {
			System.out.println("qquuuaccckkkkk");
		}
	}
}
