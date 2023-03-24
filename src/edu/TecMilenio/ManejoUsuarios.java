package edu.TecMilenio;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ManejoUsuarios {
    private static BufferedReader Captura = new BufferedReader(new InputStreamReader(System.in));
    public static String Valida(String sUser, String sPass){
        String Resultado = "";
        try {

            Resultado = "";
        }
        catch (Exception ex) {
            Resultado = "Usuario o Contraseña incorrectos.";
        }
        return  Resultado;
    }

    public static void MenuUsuarios() {
        String Opcion = "";
        try {
            System.out.println(" Manejo de consultas Medicas - Usuarios\n");
            System.out.println("  1 - Altas");
            System.out.println("  2 - Cambios");
            System.out.println("  3 - Bajas");
            System.out.println("  esc - Regresar Menu Consulta Medica.");
            System.out.print("Especificar la opción deseada: ");

            Opcion = Captura.readLine().toString().trim().toUpperCase();

            switch (Opcion) {
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
                    MenuUsuarios();
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
