public abstract class WhiteResept extends Resept{
    public WhiteResept(Legemiddel legemiddel, Doctor doctor, int patientId, int reit) {
        super(legemiddel, doctor, patientId, reit);
    }

    public WhiteResept(Legemiddel legemiddel, Doctor doctor, int patientId) {
        super(legemiddel, doctor, patientId);
    }

    @Override
    public String color() {
        return "white";
    }
}
