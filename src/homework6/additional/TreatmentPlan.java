package homework6.additional;

public class TreatmentPlan {
    private int code;
    private Doctor doctor;
    private Patient patient;
    public TreatmentPlan(int code) {
        this.code = code;
        switch (code) {
            case 1:
                this.doctor = new Surgeon();
                break;
            case 2:
                this.doctor = new Dentist();
                break;
            default:
                this.doctor = new Therapist();
        }
    }
}
