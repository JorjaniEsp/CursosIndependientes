package com.clinic;

import com.clinic.controller.PatientController;
import com.clinic.model.PatientRepository;
import com.clinic.view.PatientView;

public class ClinicApp {
    public static void main(String[] args) {
        // Crear instancias
        PatientRepository model = PatientRepository.getInstance();
        PatientView view = new PatientView();
        PatientController controller = new PatientController(model, view);
        // Iniciar aplicación
        controller.start();
    }
}
