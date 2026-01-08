package com.clinic.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PatientRepository {
    private List<Patient> patients;
    private static PatientRepository instance;
   
    private PatientRepository() {
        patients = new ArrayList<>();
        // Datos de ejemplo
        patients.add(new Patient("1-0542-0984",
                "María Alfaro Rojas",
                LocalDate.of(1985, 5, 20),
                "Femenino",
                "A+",
                "8845-1234",
                "m.alfaro@gmail.com",
                "San José, Sabana Norte"));
        patients.add(new Patient("2-0321-0456",
                "Carlos Rodríguez Solano",
                LocalDate.of(1950, 11, 10),
                "Masculino",
                "O-",
                "8312-5678",
                "carlos.rs@gmail.com",
                "Alajuela, Central"));
    }
   
    public static synchronized PatientRepository getInstance() {
        if (instance == null) {
            instance = new PatientRepository();
        }
        return instance;
    }

    // este metodo muestra todos los pacientes
    public List<Patient> getAllPatients() {
        return new ArrayList<>(patients);
    }
   
    public Patient findPatientByCedula(String cedulaPatient) {
        return patients.stream()
            .filter( patient -> patient.getCedula().equals(cedulaPatient))
            .findFirst()
            .orElse(null);
    }
   
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
   
    public boolean updatePatientStatus(String cedulaPatient) {
        Patient patient = findPatientByCedula(cedulaPatient);
        if (patient != null && patient.isActivo()) {
            patient.setActivo(false);
            return true;
        }
        return false;
    }

    public boolean reactivatePatientStatus(String cedulaPatient) {
        Patient patient = findPatientByCedula(cedulaPatient);
        if (patient != null && !patient.isActivo()) {
            patient.setActivo(true);
            return true;
        }
        return false;
    }


}
