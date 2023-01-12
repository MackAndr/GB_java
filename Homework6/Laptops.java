package homework6;

public class Laptops {
    /**
     * Марка ноутбука
     */
    private String brand;
    /**
     * Модель ноутбука
     */
    private String model;
    /**
     * Оперативная память
     */
    private int ram;
    /**
     * Объем жесткого диска
     */
    private int ssd;
    /**
     * Операционная система
     */
    private String operatingSystem;
    /**
     * Цвет
     */
    private String color;

    public Laptops(String brand, String model, int ram, int ssd, String operatingSystem, String color) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.ssd = ssd;
        this.operatingSystem = operatingSystem;
        this.color =color;
    }

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getRam(){
        return ram;
    }
    public int getSsd(){
        return ssd;
    }
    public String getOperatingSystem(){
        return operatingSystem;
    }
    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
