package Generics;

import java.util.*;

public class Solution<T>{
	private T t1;
	private List<T> list = new ArrayList<>();
	public void put(T t1){
		list.add(t1);
	}

	public T get (){
		T last = list.get(list.size() - 1);
		System.out.println(last);
		list.remove(list.size() - 1);
		return null;

	}

	public static void main(String[] args) {

		Solution<String> list = new Solution<>();

		list.put("5");
		list.put("dsa");
		list.put("dfghdfsfd");

		list.get();

		Solution<Integer> list1 = new Solution();
		list1.put(34);
		list1.put(12);
		list1.get();

		Solution<Car> list2 = new Solution();
		Car ferrari = new Car("Ferrari 360 Spider");
		Car lambo = new Car("Lamborghini Diablo");
		list2.put(ferrari);
		list2.put(lambo);
		list2.get();
	}
}
class Car {

	String model;

	public Car(String model) {
		this.model = model;
	}

}
           /*
    1. Create generic class Storage with 2 methods
    2. With in this class, create collection
    3. Create method put which saves object of any type to this collection
    4. Create method get which returns the latest added object from the collection and removes it from there
     */



