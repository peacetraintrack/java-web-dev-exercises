package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Area area = new Area();
        area.areaOfACircle();
    }
    public void areaOfACircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the radius of the circle? ");
        try {
            boolean keepOnLooping = true;
            while (keepOnLooping){
            Double myRadius = scanner.nextDouble();
                if (myRadius < 0) {
                    System.out.println("Input must be a positive number!");
                } else {
                    Double area = Circle.getArea(myRadius);
                    System.out.println("Your area is: " + area.toString());
                    keepOnLooping = false;
                }

            }
        } catch (Exception error) {
            System.out.println("You must provide a numeric input!");
        }
    }
}