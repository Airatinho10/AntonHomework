public abstract class Resept {
    private Legemiddel legemiddel;
    private Doctor doctor;
    private int patientId;
    private int reit;
    private int id;
    private static int countId;

    public Resept(Legemiddel legemiddel, Doctor doctor, int patientId, int reit) {
        this.legemiddel = legemiddel;
        this.doctor = doctor;
        this.patientId = patientId;
        this.reit = reit;
        id = ++countId;
    }

    public Resept(Legemiddel legemiddel, Doctor doctor, int patientId) {
        this.legemiddel = legemiddel;
        this.doctor = doctor;
        this.patientId = patientId;
        id = ++countId;
        this.reit = 3;
    }

    public Legemiddel getLegemiddel() {
        return legemiddel;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getReit() {
        return reit;
    }

    public int getId() {
        return id;
    }

    public boolean use () {
        reit--;
        return reit>0;
    }

    abstract public String color ();

    abstract public int toPrice ();

    @Override
    public String toString() {
        return "Resept{" +
                legemiddel.toString()+
                ". Doctor = " + doctor +
                ", patientId = " + patientId +
                ", reit = " + reit +
                ", id = " + id +
                ", color = " + color()+
                ", price = " + toPrice() +
                '}';
    }
}

class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}