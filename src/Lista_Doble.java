
public class Lista_Doble {

    private Nodo inicio;
    private Nodo fin;

    public Lista_Doble() {
        inicio = null;
        fin = null;
    }


    //Incertar al final
    public void insertarFin(String dato) {
        if(inicio == null) {
            fin = new Nodo(dato, null, null);
            inicio = fin;
        }

        else {
            Nodo nuevo = new Nodo(dato, fin, null);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    //Eliminar
    public void eliminaDato(String dato) {
        if (inicio != null) {
            Nodo sig = inicio;
            Nodo ant = null;
            while (ant != null)
            {
                if (sig.getDato().equals(dato) ) {
                    if (ant.equals(null)) {
                        inicio = inicio.getSiguiente();
                        sig.setSiguiente(null);
                        ant= inicio;

                    }
                    else {
                        ant.setSiguiente(ant.getSiguiente());
                        sig.setSiguiente(null);
                        sig = ant.getSiguiente();
                    }
                }
                else {
                    ant = sig;
                    sig = sig.getSiguiente();
                }
            }
        }

    }

    // Buscar
    public Boolean buscar (String dato) {
        Nodo temp = inicio;
        while(temp != null) {
            if(temp.getDato().equals(dato)) {
                return true;
            }
            temp = temp.getSiguiente();
        }
        return false;
    }

    public void Mostrar() {
        Nodo temp = inicio;
        while(temp != null) {
            System.out.println(temp.getDato());
            temp = temp.getSiguiente();
        }
    }
}