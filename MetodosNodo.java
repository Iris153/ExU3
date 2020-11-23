package clientes;

public class MetodosNodo {

    CrearNodo raizA = null;
    CrearNodo raizB = null;

    CrearNodo cimaA = null;
    CrearNodo cimaB = null;

    int tamaño = 0;

    public void Insertar(String tipoClientes, int turno) {
        if (tipoClientes.equals("Vip")) {

            CrearNodo nodoVip = new CrearNodo(tipoClientes, turno);

            if (raizA == null) {
                raizA = nodoVip;
                cimaA = nodoVip;
            } else {
                cimaA.apuntador = nodoVip;
                cimaA = nodoVip;
            }

        } else {
            CrearNodo nodoComun = new CrearNodo(tipoClientes, turno);

            if (raizB == null) {
                raizB = nodoComun;
                cimaB = nodoComun;
            } else {
                cimaB.apuntador = nodoComun;
                cimaB = nodoComun;
            }

        }

        MostrarColas();
    }

    public void PasarVentanilla() {
        CrearNodo ventanilla1 = null;
        CrearNodo ventanilla2 = null;
        CrearNodo ventanilla3 = null;

        if (raizA == null || raizB == null) {
            System.out.println("No hay clientes en la cola");

        }
        if (raizA != null && ventanilla1 == null) {
            ventanilla1 = raizA;
            raizA = raizA.apuntador;
        }
        if (raizA != null && ventanilla2 == null) {
            ventanilla2 = raizA;
            raizA = raizA.apuntador;
        }
        if (raizA != null && ventanilla3 == null) {
            ventanilla3 = raizA;
            raizA = raizA.apuntador;

        }
        if(raizB !=null && ventanilla1==null){
            ventanilla1=raizB;
            raizB=raizB.apuntador;
        }
        if(raizB !=null && ventanilla2==null){
            ventanilla2=raizB;
            raizB=raizB.apuntador;
        }
        if(raizB !=null && ventanilla3==null){
            ventanilla3=raizB;
            raizB=raizB.apuntador;
        }

        MostrarVentanillas(ventanilla1, ventanilla2, ventanilla3);
    }

    public void MostrarColas() {
        CrearNodo dato1 = raizA;
        CrearNodo dato2 = raizB;

        while (dato1 != null) {
            System.out.println("Vip: " + dato1.tipoClientes + " " + dato1.turno);
            dato1 = dato1.apuntador;
        }

        while (dato2 != null) {
            System.out.println("Comun: " + dato2.tipoClientes + " " + dato2.turno);
            dato2 = dato2.apuntador;
        }
        System.out.println("");
    }

    public void TerminarVentanilla() {
        CrearNodo dato1 = raizA;
        CrearNodo dato2 = raizB;

        if (dato1 == null) {
            System.out.println("No existen elementos en ventanilla");

        } else {
            dato1 = dato1.apuntador;
            tamaño--;
            System.out.println("ventanilla vacia");

            if (dato2 == null) {
                System.out.println("No existen elementos en ventanilla");

            } else {
                dato2 = dato2.apuntador;
                tamaño--;
                System.out.println("Ventanilla vacia");
            }
        }

    }

    public void MostrarVentanillas(CrearNodo ventanilla1, CrearNodo ventanilla2, CrearNodo ventanilla3) {

        System.out.println("ventanilla 1: " + ventanilla1.tipoClientes);
        System.out.println("ventanilla 2: " + ventanilla2.tipoClientes);
        System.out.println("Ventanilla 3: " + ventanilla3.tipoClientes);

    }

}
