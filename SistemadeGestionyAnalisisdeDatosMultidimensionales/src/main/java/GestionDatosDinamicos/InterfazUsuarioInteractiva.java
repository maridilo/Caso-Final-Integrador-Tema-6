package GestionDatosDinamicos;

import java.io.*;
import java.util.Collections;
import java.util.List;

public class InterfazUsuarioInteractiva {
    private ListaDatos listaDatos;

    // Constructor
    public InterfazUsuarioInteractiva() {
        this.listaDatos = new ListaDatos();
    }

    public void agregarDatoReal(double dato) {
        listaDatos.agregarDatoReal(dato);
    }

    public void agregarDatoPareja(int primero, int segundo) {
        Pareja pareja = new Pareja(primero, segundo);
        listaDatos.agregarDatoPareja(pareja);
    }

    public void eliminarDatoReal(double dato) {
        listaDatos.eliminarDatoReal(dato);
    }

    public void eliminarDatoPareja(int primero, int segundo) {
        Pareja pareja = new Pareja(primero, segundo);
        listaDatos.eliminarDatoPareja(pareja);
    }

    public List<Double> obtenerListaDatosReales() {
        return listaDatos.getListaDatosReales();
    }

    public List<Pareja> obtenerListaDatosPareja() {
        return listaDatos.getListaDatosPareja();
    }

    public boolean buscarDatoReal(double dato) {
        return listaDatos.getListaDatosReales().contains(dato);
    }

    public void ordenarListaDatosReales() {
        Collections.sort(listaDatos.getListaDatosReales());
    }

    public void guardarDatosEnArchivo(String nombreArchivo) {
        try (FileOutputStream fos = new FileOutputStream(nombreArchivo);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(listaDatos.getListaDatosReales());
            oos.writeObject(listaDatos.getListaDatosPareja());
            System.out.println("Datos guardados en el archivo '" + nombreArchivo + "'.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }
    }
    public void cargarDatosDesdeArchivo(String nombreArchivo) {
        try (FileInputStream fis = new FileInputStream(nombreArchivo);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            List<Double> datosReales = (List<Double>) ois.readObject();
            List<Pareja> datosPareja = (List<Pareja>) ois.readObject();
            listaDatos.getListaDatosReales().addAll(datosReales);
            listaDatos.getListaDatosPareja().addAll(datosPareja);
            System.out.println("Datos cargados desde el archivo '" + nombreArchivo + "'.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos desde el archivo: " + e.getMessage());
        }
    }
    public void limpiarListaDatos() {
        listaDatos.getListaDatosReales().clear();
        listaDatos.getListaDatosPareja().clear();
    }
}
