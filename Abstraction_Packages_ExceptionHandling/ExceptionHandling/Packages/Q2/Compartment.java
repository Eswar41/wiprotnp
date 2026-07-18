package Abstraction_Packages_ExceptionHandling.ExceptionHandling.Packages.Q2;

public class Compartment {
    private int height;
    private int width;
    private int breadth;

    public Compartment(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println("Height : " + height);
        System.out.println("Width  : " + width);
        System.out.println("Breadth: " + breadth);
    }
