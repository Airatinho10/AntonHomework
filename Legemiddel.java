public abstract class Legemiddel {
    private String name;
    private int price;
    private double activeIngredient;
    private int id;
    private static int countId;

    public Legemiddel(String name, int price, double activeIngredient) {
        this.name = name;
        this.price = price;
        this.activeIngredient = activeIngredient;
        id = ++ countId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getActiveIngredient() {
        return activeIngredient;
    }

    public int getId() {
        return id;
    }

    public void setNewPrice(int price) {
        this.price = price;
    }
}
