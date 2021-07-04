package builder_pattern;

public class Guitar {
    private String serialNumber;
    private String name;
    private float price;

    public Guitar(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public Guitar name(String name){
        this.name = name;
        return this;
    }

    public Guitar price(float price){
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "serialNumber='" + serialNumber + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
