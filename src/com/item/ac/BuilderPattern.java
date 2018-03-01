package com.item.ac;

public class BuilderPattern {
	
	// Required parameters
	private final int servingSize;
	private final int servings;
	
	// Optional parameters
	private final int calories;
	private final int fat;
	private final int carbohydrate;
	private final int sodium;
	
	private BuilderPattern(Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.carbohydrate = builder.carbohydrate;
		this.sodium = builder.sodium;
	}
	
	// Avoid using the same name for inner class with interface. It can get confusing.
	public static class Builder implements BuilderInterface<BuilderPattern> { 
		
		// Required parameters
		private final int servingSize;
		private final int servings;
		
		// Optional parameters
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;		
		
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int calories) {
			this.calories = calories;
			return this;
		}
		
		public Builder fat(int fat) {
			this.fat = fat;
			return this;
		}
		
		public Builder carbohydrate(int carbohydrate) {
			this.carbohydrate = carbohydrate;
			return this;
		}
		
		public Builder sodium(int sodium) {
			this.sodium = sodium;
			return this;
		}
		
		public BuilderPattern build() {
			return new BuilderPattern(this);
		}
		
	}

}
