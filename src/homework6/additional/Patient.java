package homework6.additional;

public class Patient {
    private String name;
    public Patient(String name) {
        this.name = name;
    }
    public void addTreatmentPlan(TreatmentPlan treatmentPlan) {
       // this.treatmentPlan = treatmentPlan;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
