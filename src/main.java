import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
8.10
Utilizar una lista doblemente enlazada para controlar una lista de pasajeros de una linea aérea. El programa
principal debe ser controlado por men+u y permitir al usuario visualizar los datos de un pasajero determinado,
insertar un nodo (siempre por el final) y eliminar un pasajero de la lista. A la lista se accede por 2 variables,
una referencia al primer nodo y la otra al último nodo.
 */




class Autobus_1 {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Lista_Doble ld = new Lista_Doble();

        int opcion;
        String dato;
        boolean si = true;

        //Insertar pasajeros
        ld.insertarFin("Elmer");
        ld.insertarFin("Enrique");
        ld.insertarFin("Alejandro");
        ld.insertarFin("Josselyne");



        //Desplegar Menú
        while(si)
        {
            System.out.println("------- AEROLINEA ---------");
            System.out.println("Indica la opcion deseada: ");
            System.out.println("Agregar pasajero:  1");
            System.out.println("Eliminar pasajero:  2");
            System.out.println("Ver datos del pasajero: 3");
            System.out.println("---------------------------");

            opcion = Integer.parseInt(entrada.readLine());


            switch(opcion)
            {
                //Opción1. Agregar pasajero
                case 1:  System.out.println("Agrega un pasajero");
                    dato = (entrada.readLine());
                    ld.insertarFin(dato);
                    System.out.println("Los pasajeros son: ");
                    ld.Mostrar();
                    break;

                    //Opcion2. Eliminar pasajero
                case 2: System.out.println("¿Qué pasajero quiere eliminar?");
                    dato = (entrada.readLine());
                    ld.eliminaDato(dato);
                    System.out.println("Los pasajeros son: ");
                    ld.Mostrar();
                    break;

                    //Opcion 3. Ver datos del pasajero
                case 3: System.out.println("Nombre del pasajero");
                    dato = (entrada.readLine());
                    System.out.print(ld.buscar(dato));
                    break;

                    //Mandar el mensaje si no se eligen las opciones del menú
                default: System.out.println("Lo siento, no entendí, vuelva más tarde.");
                    si = false;
                    break;
            }
        }
    }
}

