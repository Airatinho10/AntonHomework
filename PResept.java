public class PResept extends WhiteResept{
    private static final int discount = 108;

    public PResept(Legemiddel legemiddel, Doctor doctor, int patientId) {
        super(legemiddel, doctor, patientId);
    }

    @Override
    public int toPrice() {
        if (getLegemiddel().getPrice() - discount < 0) {
            return 0;
        }
        return getLegemiddel().getPrice() - discount;
    }
}
