package MapasyAsociacionDatos;
import java.util.Map;
import java.util.HashMap;

public class RecuperacionEficiente {

        private Map<String, String> datos;

            this.datos = new HashMap<>();
        }

        // Método para agregar datos asociados a una clave
        public void agregarDato(String clave, String dato) {
            datos.put(clave, dato);
        }

        // Método para recuperar datos asociados a una clave
        public String obtenerDato(String clave) {
            return datos.get(clave);
        }

        // Método para eliminar datos asociados a una clave
        public void eliminarDato(String clave) {
            datos.remove(clave);
        }

        // Método para verificar si una clave existe en el mapa
        public boolean existeClave(String clave) {
            return datos.containsKey(clave);
        }
    }

}
