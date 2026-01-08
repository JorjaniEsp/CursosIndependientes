package com.clinic.view;

import com.clinic.model.Patient;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class PatientView {
    private Scanner scanner;
   
    public PatientView() {
        scanner = new Scanner(System.in);
    }
   
    public void showMenu() {
        System.out.println("\n=== SISTEMA DE GESTIÓN DE CLINICA ===");
        System.out.println("1. Mostrar todos los pacientes");
        System.out.println("2. Buscar paciente por cedula");
        System.out.println("3. Agregar nuevo paciente");
        System.out.println("4. Dar de alta a un paciente");
        System.out.println("5. Reingresar un paciente");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }
   
    public int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void displayPatients(List<Patient> patients) {
        System.out.println("\n--- LISTA DE PACIENTES ---");
        if (patients.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
        } else {
            // Ajuste de cabeceras: Cédula, Nombre, Teléfono, Edad, Estado
            System.out.printf("%-15s %-25s %-12s %-6s %-10s%n",
                    "CÉDULA", "NOMBRE", "TELÉFONO", "EDAD", "ACTIVO");
            System.out.println("-------------------------------------------------------------------");
            for (Patient patient : patients) {
                System.out.printf("%-15s %-25s %-12s %-6d %-10s%n",
                        patient.getCedula(),
                        patient.getNombre(),
                        patient.getTelefono(),
                        patient.getEdad(), // usa del metodo calculado
                        patient.isActivo() ? "Sí" : "No");
            }
        }
    }

    // este metodo pregunta la cedula del paciente
    public String getCedulaInput() {
        System.out.print("Ingrese el número de Cédula: ");
        return scanner.nextLine();
    }

    // metodo muestra los detlles de un paciente
    public void showPatientDetails(Patient patient) {
        if (patient == null) {
            System.out.println("Paciente no encontrado.");
        } else {
            System.out.println("\n--- EXPEDIENTE DEL PACIENTE ---");
            System.out.println("Cédula: " + patient.getCedula());
            System.out.println("Nombre: " + patient.getNombre());
            System.out.println("Fecha Nacimiento: " + patient.getFechaNacimiento());
            System.out.println("Edad: " + patient.getEdad());
            System.out.println("Género: " + patient.getGenero());
            System.out.println("Tipo Sangre: " + patient.getTipoSangre());
            System.out.println("Teléfono: " + patient.getTelefono());
            System.out.println("Correo: " + patient.getCorreo());
            System.out.println("Dirección: " + patient.getDireccion());
            System.out.println("Estado: " + (patient.isActivo() ? "Activo" : "Inactivo"));
        }
    }

    // metodo consulta al usuario los datos del paciente
    public Patient getNewPatientData() {
        System.out.println("\n--- REGISTRO DE NUEVO PACIENTE ---");

        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();

        System.out.print("Nombre Completo: ");
        String nombre = scanner.nextLine();

        // Captura de fecha para convertir a LocalDate
        System.out.print("Año de nacimiento (YYYY): ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Mes de nacimiento (1-12): ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.print("Día de nacimiento (1-31): ");
        int day = Integer.parseInt(scanner.nextLine());
        LocalDate fechaNac = LocalDate.of(year, month, day);

        System.out.print("Género: ");
        String genero = scanner.nextLine();

        System.out.print("Tipo de Sangre: ");
        String tipoSangre = scanner.nextLine();

        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("Correo Electrónico: ");
        String correo = scanner.nextLine();

        System.out.print("Dirección de residencia: ");
        String direccion = scanner.nextLine();

        // Retorno con los 8 parámetros requeridos por el constructor de Patient
        return new Patient(cedula, nombre, fechaNac, genero, tipoSangre, telefono, correo, direccion);
    }
   
    public void showMessage(String message) {
        System.out.println(message);
    }
   
    public void close() {
        scanner.close();
    }
}
