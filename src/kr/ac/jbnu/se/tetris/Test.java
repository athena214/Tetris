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
				return "�ι�������";

			case Three:
				return "����������";

			case Four:
				return "�׹�������";

			default:
				return null;
			}
		}
	}
}
