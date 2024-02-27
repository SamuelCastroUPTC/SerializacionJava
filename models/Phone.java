package models;

import java.io.Serializable;

public class Phone implements Serializable{
    private int memoria;
    private int precio;


    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Celular [memoria=" + memoria + ", precio=" + precio + "]";
    }

}
