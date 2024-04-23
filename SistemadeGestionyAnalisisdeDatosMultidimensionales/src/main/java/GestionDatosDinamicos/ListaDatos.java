package GestionDatosDinamicos;
import java.util.ArrayList;
import java.util.List;

public class ListaDatos {
    private List<String> listaDatosReales;
    private List<Pareja> listaDatosPareja;

    public ListaDatos() {
        this.listaDatosReales = new ArrayList<String>();
        this.listaDatosPareja = new ArrayList<>();
    }

    // Métodos para datos reales
    public void agregarDatoReal(String dato) {
        listaDatosReales.add(dato);
    }

    public void eliminarDatoReal(double dato) {
        listaDatosReales.remove(dato);
    }

    public List<String> getListaDatosReales() {
        return listaDatosReales;
    }

    // Métodos para datos de pareja
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
}

