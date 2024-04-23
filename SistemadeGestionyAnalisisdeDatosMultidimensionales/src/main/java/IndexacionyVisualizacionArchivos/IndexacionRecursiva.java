package IndexacionyVisualizacionArchivos;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IndexacionRecursiva {


        private List<String> archivosIndexados;

        public IndexacionRecursiva() {
            this.archivosIndexados = new ArrayList<>();
        }

        // Método para indexar archivos de manera recursiva
        public void indexarArchivos(String rutaDirectorio) {
            File directorio = new File(rutaDirectorio);
            if (directorio.exists() && directorio.isDirectory()) {
                indexarArchivosRecursivamente(directorio);
            } else {
                System.out.println("La ruta no es válida o no es un directorio.");
            }
        }

        private void indexarArchivosRecursivamente(File directorio) {
            File[] archivos = directorio.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isDirectory()) {
                        indexarArchivosRecursivamente(archivo);
                    } else {
                        archivosIndexados.add(archivo.getAbsolutePath());
                    }
                }
            }
        }

        // Método para ordenar alfabéticamente los nombres de archivos
        public void ordenarArchivos() {
            Collections.sort(archivosIndexados);
        }

        // Método para listar archivos junto con sus rutas completas
        public void listarArchivos() {
            for (String rutaArchivo : archivosIndexados) {
                System.out.println(rutaArchivo);
            }
        }

        public static void main(String[] args) {
            IndexacionRecursiva indexador = new IndexacionRecursiva();
            indexador.indexarArchivos("directorio/a/indexar");
            indexador.ordenarArchivos();
            indexador.listarArchivos();
        }
    }
