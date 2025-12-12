import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Tarea {
    Scanner sc = new Scanner(System.in);
    public  void  detalleFactura(){
        String detalle;
        double precioProduct1, precioProduct2;

        System.out.println("Ingrese la descripcio de la factura: ");
        detalle = sc.nextLine();

        System.out.println("Ingrese el precio del primer producto: ");
        precioProduct1 = sc.nextDouble();

        System.out.println("Ingrese el precio del segundo producto: ");
        precioProduct2 = sc.nextDouble();

        double precioBruto = precioProduct1 + precioProduct2;
        double impuesto = precioBruto * 0.19;
        double total = precioBruto + impuesto;

        String mensaje = "La "+detalle+" tiene un total bruto de "+ precioBruto +", con un impuesto de "+impuesto+" y el monto después de impuesto es de " + total;
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        Tarea prueba = new Tarea();
        prueba.detalleFactura();
    }
}
