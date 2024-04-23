package MapasyAsociacionDatos;
import java.util.HashMap;
import java.util.Map;

public class GestionRelaciones {
    private Map<Integer, String> numerosEscritos;

    public GestionRelaciones() {
        this.numerosEscritos = new HashMap<>();
    }

    public void agregarNumeroEscrito(int numero, String escritura) {
        numerosEscritos.put(numero, escritura);
    }

    public String obtenerEscritura(int numero) {
        return numerosEscritos.get(numero);
    }

    public void eliminarNumero(int numero) {
        numerosEscritos.remove(numero);
    }

    public boolean existeNumero(int numero) {
        return numerosEscritos.containsKey(numero);
    }

    public void mostrarNumerosEscritos() {
        System.out.println("Números y sus escrituras:");
        for (Map.Entry<Integer, String> entry : numerosEscritos.entrySet()) {
            int num = entry.getKey();
            String escritura = entry.getValue();
            System.out.println(num + " -> " + escritura);
        }
    }
}


