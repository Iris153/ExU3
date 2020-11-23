package clientes;

public class CrearNodo {

    String tipoClientes;
    int turno;
    CrearNodo apuntador;

    public CrearNodo(String tipoClientes, int turno) {

        this.tipoClientes = tipoClientes;
        this.turno = turno;
        this.apuntador = null;
    }


}
