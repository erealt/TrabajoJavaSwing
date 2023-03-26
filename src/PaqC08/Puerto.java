package PaqC08;

public class Puerto extends Hub {
    private Hub[]p;
    private boolean [] duplas;

    public Puerto() {
        p = new Hub[3];
    }
    public Hub[] getP() {
        return p;
    }

    public void setP(Hub[] p) {
        this.p = p;
    }

    public boolean[] getDuplas() {
        return duplas;
    }

    public void setDuplas(boolean[] duplas) {
        this.duplas = duplas;
    }

    public void apilar_contenedor(Contenedor c){
        for (int i = 0; i <p.length ; i++) {
            if (p[i] == null) { // si hay un elemento con null es que esta vacio y apila ahi
                apilar(c);
            }

            }

    }
    public  Hub desapilar(int hub,int columna){// tiene que devolver un Hub
        Hub h=new Hub();
        for (int i = 0; i <p.length  ; i++) {
            if(hub==i){

                desapilar(columna);

            }

        }
        return h;
    }
}
