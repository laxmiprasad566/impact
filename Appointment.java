// class AppoitmentSchedular method bookAppointment overload method using 1.doctor specialization 2.doctor specialization & patient age 3.doctor specialization,time slot and emergency priority
class AppointmentScheduler {

    void bookAppointment(String specialization) {
        System.out.println("Booking appointment with a " + specialization + " doctor.");
    }

    void bookAppointment(String specialization, int age) {
        System.out.println("Booking appointment with a " + specialization + " doctor for a patient aged " + age + ".");
    }

    void bookAppointment(String specialization, String timeSlot, boolean isEmergency) {
        String priority = isEmergency ? "Emergency" : "Regular";
        System.out.println("Booking " + priority + " appointment with a " + specialization +
                " doctor at " + timeSlot + ".");
    }
}

public class Appointment {
    public static void main(String[] args) {
        AppointmentScheduler scheduler = new AppointmentScheduler();

        scheduler.bookAppointment("Cardiologist");
        scheduler.bookAppointment("Pediatrician", 8);
        scheduler.bookAppointment("Neurologist", "10:30 AM", false);
    }
}
