public class BlueResept extends Resept{
    public BlueResept(Legemiddel legemiddel, Doctor doctor, int patientId, int reit) {
        super(legemiddel, doctor, patientId, reit);
    }

    @Override
    public String color() {
        return "blue";
    }

    @Override
    public int toPrice() {
        return (int)Math.round(getLegemiddel().getPrice()*0.75);
    }


}
