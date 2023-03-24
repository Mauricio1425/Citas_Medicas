package edu.TecMilenio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsultaMedica {
    private static BufferedReader Captura = new BufferedReader(new InputStreamReader(System.in));

    private static String IngUsuario(String prompt){
        String Usuario = null;
        System.out.print(prompt);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            Usuario = br.readLine().trim();
        }
        catch (IOException e) {
            System.out.println("¡Error al ingresar tu nombre!");
            System.exit(1);
        }
        return Usuario;
    }

    private static String IngContrasenia(String prompt) {
        String contrasenia = "";
        //ConsoleEraser consoleEraser = new ConsoleEraser();
        System.out.print(prompt);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //consoleEraser.start();
        try {
            contrasenia = in.readLine();
        }
        catch (IOException e){
            System.out.println("¡Error al ingresar la contraseña!");
            System.exit(1);
        }
        //consoleEraser.halt();
        System.out.print("\b");
        return contrasenia;
    }
    private static class ConsoleEraser extends Thread {
        private boolean running = true;
        public void run() {
            while (running) {
                System.out.print("\b ");
                try {
                    Thread.currentThread().sleep(1);
                }
                catch(InterruptedException e) {
                    break;
                }
            }
        }
        public synchronized void halt() {
            running = false;
        }
    }

    public static void VerUsuario() {
        String iUsuario = "", iContrasenia = "";
        String cUsuarioContrasenia = "";
        try{
            iUsuario = IngUsuario("Ingresar el Usuario: ");
            iContrasenia = IngContrasenia("Ingresar la Contraseña: ");

            cUsuarioContrasenia = ManejoUsuarios.Valida(iUsuario, iContrasenia);
            if (cUsuarioContrasenia == "") {
                System.out.print("Usuario y Contraseña correctas '" + iUsuario + "' - '" + iContrasenia + "'");
                MenuAplicacion();
            }
            else {
                InUsuarioContrasenia(cUsuarioContrasenia + " Desea continuar en el aplicativo Consulta Medica: Si/S o No/N: ");
            }
        }
        catch (Exception ex) {
            System.out.print("¡¡¡ Error !!! '" + ex.getMessage() + "'");
        }
        finally{ }
    }

    private static void InUsuarioContrasenia(String sMensaje) {
        String Continuar = "";
        try{
            System.out.println();
            System.out.print(sMensaje);
            Continuar = Captura.readLine().toString().trim().toUpperCase();

            switch (Continuar){
                case "SI":
                case "S":
                    VerUsuario();
                    break;
                case "NO":
                case "N":
                    break;
                default:
                    InUsuarioContrasenia(sMensaje);
                    break;
            }

        }
        catch (Exception ex) { }
        finally{ }
    }

    private static void MenuAplicacion(){
        String opcionCitas = "";
        boolean SigeEvidencia = true;
        try {
            do{
                System.out.println("Manejo de consultas Medicas\n");
                System.out.println("  1 - Administra Pacientes");
                System.out.println("  2 - Administra Doctores");
                System.out.println("  3 - Administra Citas");
                System.out.println("  4 - Administra Usuarios");
                System.out.println("  esc - Regresar Menu Principal.\n");
                System.out.print("Favor de especificar la opción deseada: ");

                opcionCitas = Captura.readLine().toString().trim().toUpperCase();

                switch (opcionCitas) {
                    case "1":
                        ManejoClientes.MenuPacientes();
                        break;
                    case "2":
                        ManejoDoctores.MenuDoctores();
                        break;
                    case "3":
                        ManejoCitas.MenuCitas();
                        break;
                    case "4":
                        ManejoUsuarios.MenuUsuarios();
                        break;
                    case "esc":
                        SigeEvidencia = false;
                        break;
                    default:
                        System.out.println("");
                        System.out.println("El tipo de dato ingresado no es correcto, ingresar un dato valido.");
                        System.out.println("");
                        MenuAplicacion();
                        break;
                }
            } while (SigeEvidencia);
        }
        catch (Exception ex){}
        finally { }
    }
}
