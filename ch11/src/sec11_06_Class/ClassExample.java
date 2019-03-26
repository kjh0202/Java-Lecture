package sec11_06_Class;

import sec11_03_04_deepclone.Car;

public class ClassExample {

	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage());
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("sec11_03_04_deepclone.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
