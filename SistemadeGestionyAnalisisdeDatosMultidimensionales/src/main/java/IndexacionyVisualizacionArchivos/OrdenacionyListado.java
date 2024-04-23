package IndexacionyVisualizacionArchivos;
import java.io.File;
import java.util.Arrays;


public class OrdenacionyListado {

        public static void main(String[] args) {
            String directorio = "ruta/del/directorio";

            File dir = new File(directorio);

            if (dir.exists() && dir.isDirectory()) {
                File[] archivos = dir.listFiles();

                if (archivos != null && archivos.length > 0) {
                    Arrays.sort(archivos);

                    for (File archivo : archivos) {
                        System.out.println(archivo.getAbsolutePath());
                    }
                } else {
                    System.out.println("El directorio está vacío.");
                }
            } else {
                System.out.println("La ruta no es válida o no es un directorio.");
            }
        }
    }
