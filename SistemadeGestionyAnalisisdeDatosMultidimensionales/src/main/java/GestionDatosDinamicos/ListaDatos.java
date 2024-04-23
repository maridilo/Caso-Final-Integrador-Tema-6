package GestionDatosDinamicos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaDatos {
    private static List<String> listaDatosReales;
    private List<Pareja> listaDatosPareja;

    public ListaDatos() {
        this.listaDatosReales = new ArrayList<>();
        this.listaDatosPareja = new ArrayList<>();
    }

    public void agregarDatoReal(String dato) {
        listaDatosReales.add(dato);
    }

    public void eliminarDatoReal(double dato) {
        listaDatosReales.remove(dato);
    }

    public static List<String> getListaDatosReales() {
        return listaDatosReales;
    }

    // Métodos para datos de pareja

    public void ordenarDatosReales() {
        Collections.sort(ListaDatos.getListaDatosReales());

    }

    public void limpiarListaDatosReales() {
        listaDatosReales.clear();
    }

    public void agregarDatoPareja(Pareja pareja) {
        listaDatosPareja.add(pareja);
    }

    public void eliminarDatoPareja(Pareja pareja) {
        listaDatosPareja.remove(pareja);
    }

    public void modificarDatoReal(int indice, String nuevoDato) {
        if (indice >= 0 && indice < listaDatosReales.size()) {
            listaDatosReales.set(indice, nuevoDato);
        }
    }

    public List<Pareja> getListaDatosPareja() {
        return listaDatosPareja;
    }

    public String obtenerDatoReal(int indice) {
        if (indice >= 0 && indice < listaDatosReales.size()) {
            return listaDatosReales.get(indice);
        } else {
            return null;
        }
    }

    private void eliminarDato(List<?> lista, Object dato) {
        lista.remove(dato);
    }

    public void ordenarDatos() {
    }
}


