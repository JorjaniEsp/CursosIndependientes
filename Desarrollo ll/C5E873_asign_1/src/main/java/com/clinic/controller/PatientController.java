package com.clinic.controller;

import com.clinic.model.Patient;
import com.clinic.model.PatientRepository;
import com.clinic.view.PatientView;
import java.util.List;

public class PatientController {
    private PatientRepository model;
    private PatientView view;
    private boolean running;
   
    public PatientController(PatientRepository model, PatientView view) {
        this.model = model;
        this.view = view;
        this.running = true;
    }
   
    public void start() {
        while (running) {
            view.showMenu();
            int choice = view.getUserChoice();
            processChoice(choice);
        }
        view.close();
    }
   
    private void processChoice(int choice) {
        switch (choice) {
            case 1:
                showAllPatients();
                break;
            case 2:
                searchPatientByCedula();
                break;
            case 3:
                addNewPatient();
                break;
            case 4:
                dischargePatient();
                break;
            case 5:
                readmitPatient();
                break;
            case 6:
                exit();
                break;
            default:
                view.showMessage("Opción no válida. Intente de nuevo.");
        }
    }
   
    private void showAllPatients() {
        List<Patient> patients = model.getAllPatients();
        view.displayPatients(patients);
    }
   
    private void searchPatientByCedula() {
        String cedulaPatient = view.getCedulaInput();
        Patient patient = model.findPatientByCedula(cedulaPatient);

        view.showPatientDetails(patient);
    }
   
    private void addNewPatient() {
        Patient patient = view.getNewPatientData();
        model.addPatient(patient);
        view.showMessage("Paciente agregado exitosamente.");
    }
   
    private void dischargePatient() {
        String cedula = view.getCedulaInput();
        boolean success = model.updatePatientStatus(cedula);
        if (success) {
            view.showMessage("Paciente correctamente de alta.");
        } else {
            view.showMessage("No se pudo dar de alta al paciente. Verifique la cedula o estado.");
        }
    }

    private void readmitPatient() {
        String cedulaPatient = view.getCedulaInput();
        boolean success = model.reactivatePatientStatus(cedulaPatient);
        if (success) {
            view.showMessage("Paciente reingresado exitosamente.");
        } else {
            view.showMessage("No se pudo reingresar el paciente. Verifique la cedula.");
        }
    }


    private void exit() {
        view.showMessage("Saliendo del sistema...");
        running = false;
    }
}
