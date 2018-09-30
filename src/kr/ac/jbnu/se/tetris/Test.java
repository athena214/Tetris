package kr.ac.jbnu.se.tetris;

public class Test {

	
	public static void main(String[] args) {
		System.out.println(BikeType.values()[1]);
	}

	
	
	
	
	
	
	
	public enum BikeType {
		Two, Three, Four;

		@Override
		public String toString() {
			switch (this) {
			case Two:
				return "두발자전거";

			case Three:
				return "세발자전거";

			case Four:
				return "네발자전거";

			default:
				return null;
			}
		}
	}
}
