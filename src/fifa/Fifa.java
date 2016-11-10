/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifa;

/**
 *
 * @author usuario
 */
public class Fifa {

    static String presidente = "Paco";
    static Federacion[] federaciones = new Federacion[2];
    static Division[] divisiones = new Division[3];
    static Equipo[] equipos = new Equipo[20];
    private static int f;

    public static void rellenarDatos() {

        Division[] div;
        Equipo[] equipos;
        Jugador[] jugadores;

        for (int f = 0; f < federaciones.length; f++) {
            federaciones[f] = new Federacion();
            federaciones[f].setNombre("FEDERACION " + f);
            federaciones[f].setPais("PAIS " + f);
            div = federaciones[f].getDivisiones();
            for (int d = 0; d < div.length; d++) {
                div[d] = new Division();
                div[d].setNombre("div " + f + d);
                div[d].setPatrocinador("patrocinador " + f + d);

                equipos = div[d].getEquipos();
                for (int e = 0; e < equipos.length; e++) {
                    equipos[e] = new Equipo();
                    equipos[e].setNombre("equipo " + e);
                    equipos[e].setCiudad("ciudad " + e);
                    equipos[e].setEntrenador("entrenador " + e);

                    jugadores = equipos[e].getJugadores();
                    for (int j = 0; j < jugadores.length; j++) {
                        jugadores[j] = new Jugador();
                        jugadores[j].setNombre("messi " + j);
                        jugadores[j].setGoles(f + d + e + j);
                    }
                }
            }
        }
    }

    public static void ejercicio01() {
        // MOSTRAR EL NOMBRE DEL PRESIDENTE

        System.out.println(presidente);

    }

    public static void ejercicio02() {
        // MOSTRAR EL NOMBRE Y LOS PAISES DE LAS FEDERACIONES

        for (int f = 0; f < federaciones.length; f++) {
            System.out.println(federaciones[f].getNombre());

            System.out.println(federaciones[f].getPais());
        }
    }

    public static void ejercicio03() {
        // MOSTRAR EL NOMBRE Y EL PATROCINADOR DE CADA DIVISION

        for (int d = 0; d < divisiones.length; d++) {
            System.out.println(federaciones[f].getDivisiones());
//            System.out.println(divisiones[d].getPatrocinador());
        }

    }

    public static void ejercicio04() {
        // MOSTRAR EL NOMBRE DE TODOS LOS EQUIPOS
        for (int e = 0; e < equipos.length; e++) {
            System.out.println(equipos[e].getNombre());
        }
    }

    public static void ejercicio05() {
        // MOSTRAR LAS CIUDADES DE TODOS LOS EQUIPOS
        for (int e = 0; e < equipos.length; e++) {
            System.out.println(equipos[e].getCiudad());
        }
    }

    public static void ejercicio06() {
        //MOSTRAR EL ENTRENADOR Y EL NUMERO DE JUGADORES
        for (int e = 0; e < equipos.length; e++) {
            System.out.println(equipos[e].getEntrenador());
            System.out.println(equipos[e].getJugadores());
        }
    }

    public static void ejercicio07() {
        //MOSTRAR EL ENTRENADOR Y EL NOMBRE DE LOS JUGADORES

    }

    public static void ejercicio08() {
        //MOSTRAR EL MAXIMO GOLEADOR POR FEDERACION
        for (int f = 0; f < federaciones.length; f++) {
            int maxGoles=0;
            Jugador maximoGoleador= null;
            for (int d = 0; d < federaciones[f].getDivisiones().length; d++) {
                for (int e = 0; e < federaciones[f].getDivisiones()[d].getEquipos().length; e++) {
                    for (int j = 0; j < federaciones[f].getDivisiones()[d].getEquipos()[e].getJugadores().length; j++) {

                    }
                }
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        rellenarDatos();
        //ejercicio01();
        //ejercicio02();
        //ejercicio03();
        //ejercicio04();
        //ejercicio05();
        //ejercicio06();
        //ejercicio07();
        ejercicio08();
    }

}
