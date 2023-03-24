package PaqC08;


public class Hub {
    private Contenedor[][] Hub;


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

        for (int i = 0; i <Hub[0].length ; i++) {
            if(Con.getPrioridad()==i){ // si la prioridad del contenedor es igual a la columna del hub

                    Hub[Hub.length-1][i]=Con; // se guarda el contenedor en la ultima fila de esa columna

            }

        }
    }

    public void desapilar( int columna) {
        for (int i = 0; i <Hub[0].length ; i++) {
            if(columna==i){

                Hub[Hub.length-1][i]=null;

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
