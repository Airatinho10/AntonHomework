public class Vannedannede extends Legemiddel{
    private int addictivePower;

    public Vannedannede(String name, int price, double activeIngredient, int addictivePower) {
        super(name, price, activeIngredient);
        this.addictivePower = addictivePower;
    }

    public int getAddictivePower() {
        return addictivePower;
    }

    @Override
    public String toString() {
        return "Vannedannede info:" +" Id = "+getId()+ ", name = " + getName() + ", price = " + getPrice() +
                " $ , active ingredient = " + getActiveIngredient() + ", addictive power = " +
                getAddictivePower();
    }
}
