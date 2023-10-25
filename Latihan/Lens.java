public class Lens {
    public String brand;
    public int focalLenght;

    public Lens(String brand, int focalLenght) {
        this.brand = brand;
        this.focalLenght = focalLenght;
    }

    @Override
    public String toString() {
        return "Lens " + brand + " (" + focalLenght + "mm)"; 
    }
}
