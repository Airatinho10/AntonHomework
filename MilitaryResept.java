public class MilitaryResept extends WhiteResept {
    public MilitaryResept(Legemiddel legemiddel, Doctor doctor, int patientId, int reit) {
        super(legemiddel, doctor, patientId, reit);
    }

    @Override
    public int toPrice() {
        return 100;
    }
}
