package GestionDatosDinamicos;

public class Pareja {
    private int primero;
    private int segundo;

    public Pareja(int primero, int segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    // getters y setters
    public int getPrimero() {
        return primero;
    }

    public void setPrimero(int primero) {
        this.primero = primero;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
}