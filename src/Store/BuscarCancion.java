package Store;

import java.io.*;
import java.util.*;
public class BuscarCancion {
    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("canciones.txt");
        Scanner tcanciones = new Scanner(archivo);
        Scanner entrada = new Scanner(System.in);
        String cancion;
        System.out.print("¿Qué canción deseas buscar? ");
        cancion = entrada.nextLine();
        System.out.println();
        String linea;
        boolean contiene = false;
        while (tcanciones.hasNext()) { //leer cada linea del archivo
            linea = tcanciones.nextLine();
            if (linea.contains(cancion)) {   //si la línea contiene el texto buscado se muestra por pantalla
                System.out.println(linea);
                contiene = true;
            }
        } tcanciones.close();
        if (!contiene) { //si el archivo no contienen el texto se muestra un mensaje indicándolo
            System.out.println("No hay coincidencias");
        }
    }
}
