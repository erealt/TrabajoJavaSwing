package PaqC08;

public class Puerto  {
    private Hub[]p;
    private boolean [] lleno;

    public Puerto() {
        p = new Hub[3];
        p[0]=new Hub();
        p[1]=new Hub();
        p[2]=new Hub();

        lleno=new boolean[3];

    }
    public Hub[] getP() {
        return p;
    }

    public void setP(Hub[] p) {

        this.p = p;
    }

    public boolean[] getLleno() {
        return lleno;
    }

    public void setLleno(boolean[] lleno) {
        this.lleno = lleno;
    }

    public boolean apilar_contenedor(Contenedor c){
        boolean r=false;
        for (int i=0;i<p.length;i++){

            r=p[i].apilar(c);
            if (r==true) break;

        }
        return r;

    }
    public Contenedor desapilar(int columna){// tiene que devolver un Contenedor
        Contenedor contenedor;
        for (int i =p.length-1; i <-1  ; i++) {
            contenedor=p[i].desapilar(columna);//desapilamos la columna que se pase por argumento
            if(contenedor !=null){ // si el contenedor esta lleno
                return contenedor;
            }

        }
        return null;
    }
}
