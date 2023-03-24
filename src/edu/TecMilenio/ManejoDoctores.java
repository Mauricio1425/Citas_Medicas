package edu.TecMilenio;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ManejoDoctores {
    private static BufferedReader Captura = new BufferedReader(new InputStreamReader(System.in));
    public static void MenuDoctores() {
        String opcion = "";
        try {
            System.out.println(" Manejo de consultas Medicas - Doctores\n");
            System.out.println("  1 - Altas");
            System.out.println("  2 - Cambios");
            System.out.println("  3 - Bajas");
            System.out.println("  esc - Regresar Menu Consulta Medica.");
            System.out.print("Especificar la opción deseada: ");

            opcion = Captura.readLine().toString().trim().toUpperCase();

            switch (opcion) {
                case "1":
                    Alta();
                    break;
                case "2":
                    Cambios();
                    break;
                case "3":
                    Borrar();
                    break;
                case "esc":
                    break;
                default:
                    System.out.println("");
                    System.out.println("El tipo de dato ingresado no es correcto, ingresar un dato valido.");
                    System.out.println("");
                    MenuDoctores();
                    break;
            }
        }
        catch (Exception ex){}
        finally { }

    }

    public static void Alta() {
        try {

        }
        catch (Exception ex){
            System.out.println("¡¡ ERROR !!" + ex.getMessage());
        }
    }
    public static void Cambios() {
        try {

        }
        catch (Exception ex){
            System.out.println("¡¡ ERROR !!" + ex.getMessage());
        }
    }
    public static void Borrar() {
        try {

        }
        catch (Exception ex){
            System.out.println("¡¡ ERROR !!" + ex.getMessage());
        }
    }
    public static void Consulta() {
        try {

        }
        catch (Exception ex){
            System.out.println("¡¡ ERROR !!" + ex.getMessage());
        }
    }
}
