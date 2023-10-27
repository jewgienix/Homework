package homework6.clinic;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setPlanCode(3);

        TreatmentPlan plan = new TreatmentPlan();
        plan.setTreatmentPlan(patient.getPlanCode());
    }
}
