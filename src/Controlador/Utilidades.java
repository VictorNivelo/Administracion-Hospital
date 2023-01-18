/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author vivic
 */
public class Utilidades {

    private final Integer LIMITE_DATOS = 100;

    public static <T> boolean contains(final T[] array, final T v) {
        for (final T e : array) {
            if (e == v || v != null && v.equals(e)) {
                return true;
            }
        }

        return false;
    }
    
    public static int ultimoIndiceOcupado(Object array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("i -> " + i);
            if (array[i] == null) {
                return i;
            }
        }

        return -1;
    }

    public static void guardar(Object expresiones[]) throws IOException {
        Gson json = new Gson();
        Integer ocupados = ultimoIndiceOcupado(expresiones);

        Object[] expresionesCompletas = new Object[ocupados];
        System.arraycopy(expresiones, 0, expresionesCompletas, 0, expresionesCompletas.length);

        String jsons = json.toJson(expresionesCompletas);
        FileWriter fw = new FileWriter("ObjectsArray" + ".json");
        fw.write(jsons);
        fw.flush();
    }

    public static int cargar(Object expresiones[]) {
        int counter = 0;

        try {
            Gson json = new Gson();
            FileReader fr = new FileReader("ObjectsArray" + ".json");
            StringBuilder jsons = new StringBuilder();
            int valor = fr.read();
            while (valor != -1) {
                jsons.append((char) valor);
                valor = fr.read();
            }
            Object[] aux = json.fromJson(jsons.toString(), Object[].class);
            for (int i = 0; i < aux.length; i++) {
                expresiones[i] = aux[i];
                counter += 1;
            }

        } catch (Exception e) {
            System.out.println("No se encontraron objetos guardados en el json!");
        } finally {
            return counter;
        }
    }
}
