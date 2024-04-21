package GestionDatosDinamicos;
import java.util.ArrayList;
import java.util.List;

public class ListaDatos {
    private List<Double> listaDatosReales;
    private List<Pareja> listaDatosPareja;

    public ListaDatos() {
        this.listaDatosReales = new ArrayList<>();
        this.listaDatosPareja = new ArrayList<>();
    }

    // Métodos para datos reales
    public void agregarDatoReal(double dato) {
        listaDatosReales.add(dato);
    }

    public void eliminarDatoReal(double dato) {
        listaDatosReales.remove(dato);
    }

    public List<Double> getListaDatosReales() {
        return listaDatosReales;
    }

    // Métodos para datos de pareja
    public void agregarDatoPareja(Pareja pareja) {
        listaDatosPareja.add(pareja);
    }

    public void eliminarDatoPareja(Pareja pareja) {
        listaDatosPareja.remove(pareja);
    }

    public List<Pareja> getListaDatosPareja() {
        return listaDatosPareja;
    }
}

