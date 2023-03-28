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

    public boolean apilar(Contenedor c){
        boolean x =false;
        if (c.getPrioridad()==1){
            for (int i= Hub.length;i>0;i--){
                if (Hub[i-1][0]==null){ Hub[i-1][0]=c;
                    x=true
                ;break;}

            }


        }
        if (c.getPrioridad()==2){
            for (int i=Hub.length;i>0;i--){
                if (Hub[i-1][1]==null){ Hub[i-1][1]=c;
                    x=true;
                    break;}

            }


        }
        if (c.getPrioridad()==3){
            boolean salir=false;;
            for (int j=2;j<Hub[0].length;j++){
                for (int i=Hub.length;i>0;i--){

                    if (Hub[i-1][j]==null){Hub[i-1][j]=c;
                        x=true;
                        salir=true;
                        break;}
                }
                if (salir==true) break;
            }
        }
        return x;//devuelve si esta o no con true o false
    }

    public Contenedor desapilar(int col) {
        for (int i = 0; i < Hub.length; i++) {
            if (Hub[i][col - 1] != null) {
                {
                    Contenedor c = Hub[i][col - 1];
                    Hub[i][col - 1] = null;
                    return c;
                }
            }
        }
        return null;
    }

    public String mostrarDatosContenedor(int NIC) {
        for (int i = 0; i < Hub.length; i++) {
            for (int j = 0; j < Hub[0].length; j++) {
                if (Hub[i][j] != null && Hub[i][j].getNIC() == NIC) {
                    return Hub[i][j].toString();
                }
            }
        }
        return null;
    }

    public int contenedoresPais(String pais) {
        int contador=0;
        for (int i = 0; i < Hub.length; i++) {
            for (int j = 0; j < Hub[0].length; j++) {

                if (Hub[i][j] != null && Hub[i][j].getPais().equals(pais)) {
                    contador=contador +1;
                }
            }


        }
        return contador;
    }
}
