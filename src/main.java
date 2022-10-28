import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Autobus_1 {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Lista_Doble ld = new Lista_Doble();

        int opcion;
        String dato;
        boolean si = true;

        ld.insertarFin("Elmer");
        ld.insertarFin("Enrique");
        ld.insertarFin("Alejandro");
        ld.insertarFin("Josselyne");



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
                case 1:  System.out.println("Agrega un pasajero");
                    dato = (entrada.readLine());
                    ld.insertarFin(dato);
                    System.out.println("Los pasajeros son: ");
                    ld.Mostrar();
                    break;

                case 2: System.out.println("¿Qué pasajero quiere eliminar?");
                    dato = (entrada.readLine());
                    ld.eliminaDato(dato);
                    System.out.println("Los pasajeros son: ");
                    ld.Mostrar();
                    break;

                case 3: System.out.println("Nombre del pasajero");
                    dato = (entrada.readLine());
                    System.out.print(ld.buscar(dato));
                    break;

                default: System.out.println("Lo siento, no entendí, vuelva más tarde.");
                    si = false;
                    break;
            }
        }
    }
}

