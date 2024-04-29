// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.

import java.util.Objects;

public class Laptop {
    private String brand;
    private String model;
    private String buildCode;
    private int ram;
    private int storage;
    private String storageType;
    private String processor;
    private String graphCard;
    private String operatingSys;
    private double dispDiagonal;
    private int battary;
    private String color;
    private double weight;
    private int quantity;
    private int price;

    public Laptop(String brand, String model, String buildCode, int ram, int storage, String storageType,
            String processor,
            String grapfCard, String operatingSys, double dispDiagonal, int battary, String color, double weight,
            int quantity, int price) {
        this.brand = brand;
        this.model = model;
        this.buildCode = buildCode;
        this.ram = ram;
        this.storage = storage;
        this.storageType = storageType;
        this.processor = processor;
        this.graphCard = grapfCard;
        this.operatingSys = operatingSys;
        this.dispDiagonal = dispDiagonal;
        this.battary = battary;
        this.color = color;
        this.weight = weight;
        this.quantity = quantity;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getbuildCode() {
        return buildCode;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getStorageType() {
        return storageType;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGraphCard() {
        return graphCard;
    }

    public String getOperatingSys() {
        return operatingSys;
    }

    public double getDispDiagonal() {
        return dispDiagonal;
    }

    public int getBattary() {
        return battary;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setbuildCode(String buildCode) {
        this.buildCode = buildCode;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setGraphCard(String graphCard) {
        this.graphCard = graphCard;
    }

    public void setOperatingSys(String operatingSys) {
        this.operatingSys = operatingSys;
    }

    public void setDispDiagonal(double dispDiagonal) {
        this.dispDiagonal = dispDiagonal;
    }

    public void setBattary(int battary) {
        this.battary = battary;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(
                "Brand: %s\nModel: %s\nBuild code: %s\nRAM: %d GB\nStorage: %d GB\nStorage type: %s\nProcessor: %s\nGraphic card: %s\nOperating system: %s\nDisplay diagonal: %.1f\"\nBattery: %d Wh\nColor: %s\nWeight: %.1f KG\nQuantity: %d PC\nPrice: %,d RUB\n",
                brand, model, buildCode, ram, storage, storageType, processor, graphCard, operatingSys, dispDiagonal,
                battary, color, weight, quantity, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return brand.equals(laptop.brand) &&
                model.equals(laptop.model) &&
                buildCode.equals(laptop.buildCode) &&
                ram == laptop.ram &&
                storage == laptop.storage &&
                storageType.equals(laptop.storageType) &&
                processor.equals(laptop.processor) &&
                graphCard.equals(laptop.graphCard) &&
                operatingSys.equals(laptop.operatingSys) &&
                dispDiagonal == laptop.dispDiagonal &&
                battary == laptop.battary &&
                color.equals(laptop.color) &&
                weight == laptop.weight &&
                quantity == laptop.quantity &&
                price == laptop.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, buildCode, ram, storage, storageType, processor, graphCard, operatingSys,
                dispDiagonal, battary, color, weight, quantity, price);
    }

}