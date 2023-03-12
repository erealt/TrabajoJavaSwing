package PaqC08;


public class Hub {
    private Contenedor[][] Hub;
    private int c1 = 9;
    private int c2 = 9;
    private int c3 = 9;
    private int c4 = 3;

    public Hub() {
        Hub = new Contenedor[10][12];
    }

    public String toString() {
        String x = new String();
        for (int i = 0; i < Hub.length; i++) {
            for (int j = 0; j < Hub[0].length; j++)
                x = x + "\nFila " + (i + 1) + ", columna " + (j + 1) + ":\n" + Hub[i][j];
        }
        return x;
    }

    public void apilar(Contenedor Con) {

        if (Con.getPrioridad() == 1) {
            if (c1 >= 0) {
                Hub[c1][0] = Con;
                c1--;
            }
        } else if (Con.getPrioridad() == 2) {
            if (c2 >= 0) {
                Hub[c2][1] = Con;
                c2--;
            }
        } else if (Con.getPrioridad() == 3) {
            if (c3 >= 0 && c4 <= 12) {
                for (int i = 2; i < c4; i++) {
                    Hub[c3][i] = Con;
                }
                c3--;
                c4++;
            }
        }
    }

    public void desapilar(int fila, int columna) {
        Hub[fila - 1][columna - 1] = null;

        if (columna == 1) {
            for (int i = fila; i < Hub.length; i++) {
                for (int j = columna; j < Hub[0].length; j++) {
                    Hub[i - 1][j - 1] = Hub[i - 2][j - 1];
                }
            }
            c1++;
        } else if (columna == 2) {
            for (int i = fila; i < Hub.length; i++) {
                for (int j = columna; j < Hub[0].length; j++) {
                    Hub[i - 1][j - 1] = Hub[i - 2][j - 1];
                }
            }
            c2++;
        } else if (columna == 3) {
            for (int i = fila; i < Hub.length; i++) {
                for (int j = columna; j < Hub[0].length; j++) {
                    Hub[i - 1][j - 1] = Hub[i - 2][j - 1];
                }
            }
        }
    }

    public String mostrarDatosContenedor(int NIC) {
        for (int i = 0; i < Hub.length; i++) {
            for (int j = 0; j < Hub[0].length; j++) {
                if (Hub[i][j] != null && Hub[i][j].getNIC() == NIC) {
                    return Hub[i][j].toString();
                }
            }
        }
        return "El contenedor no está en el hub.";
    }

    public int contenedoresPais(String pais) {
        int contador=0;
        for (int i = 0; i < Hub.length; i++) {
            for (int j = 0; j < Hub[0].length; j++) {

                if (Hub[i][j] != null && Hub[i][j].getPais() == pais) {
                    contador=contador +1;
                }
            }


        }
        return contador;
    }
}
