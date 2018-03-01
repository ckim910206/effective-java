package com.item.ac;

public class TelescopingConstructorPattern {

	// Required parameters
	private final int servingSize;
	private final int servings;

	// Optional parameters
	private int calories = 0;
	private int fat = 0;
	private int carbohydrate = 0;
	private int sodium = 0;

	public TelescopingConstructorPattern(int servingSize, int servings) {
		this.servingSize = servingSize;
		this.servings = servings;
	}

	public TelescopingConstructorPattern(int servingSize, int servings, int calories) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
	}

	public TelescopingConstructorPattern(int servingSize, int servings, int calories, int fat) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
	}

	public TelescopingConstructorPattern(int servingSize, int servings, int calories, int fat, int carbohydrate) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.carbohydrate = carbohydrate;
	}

	public TelescopingConstructorPattern(int servingSize, int servings, int calories, int fat, int carbohydrate,
			int sodium) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.carbohydrate = carbohydrate;
		this.sodium = sodium;
	}

}
