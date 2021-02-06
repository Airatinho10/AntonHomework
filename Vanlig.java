public class Vanlig extends Legemiddel{
    public Vanlig(String name, int price, double activeIngredient) {
        super(name, price, activeIngredient);
    }

    @Override
    public String toString() {
        return "Vanlig info:" +" Id = "+getId()+ ", name = " + getName() + ", price = " + getPrice() +
                " $, active ingredient = " + getActiveIngredient();
    }

}
