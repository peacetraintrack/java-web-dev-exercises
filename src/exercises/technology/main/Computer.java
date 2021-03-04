package exercises.technology.main;

public class Computer extends AbstractEntity{

	private int screenWidth;

	private int screenHeight;

	private String manufactureYear;


	public Computer(int screenWidth, int screenHeight, String manufactureYear) {
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		this.manufactureYear = manufactureYear;
	}

	public int getScreenWidth() {
		return screenWidth;
	}

	public int getScreenHeight() {
		return screenHeight;
	}

	public String getManufactureYear() {
		return manufactureYear;
	}

	public  int processTwoPlusTwo(){
		return 2 + 2;
	}

	public void tellMeAJoke (){
		System.out.println("Why did the computer show up late for work? It had a hard drive!");
	}

}
