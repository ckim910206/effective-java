package com.item.ac;

public class JavaBeansPattern {

	// Required parameters
	private final int servingSize;
	private final int servings;

	// Optional parameters
	private int calories = 0;
	private int fat = 0;
	private int carbohydrate = 0;
	private int sodium = 0;

	public JavaBeansPattern(int servingSize, int servings) {
		this.servingSize = servingSize;
		this.servings = servings;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	
	
}
