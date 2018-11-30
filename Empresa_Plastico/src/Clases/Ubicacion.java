package Clases;

import java.io.Serializable;

public class Ubicacion implements Serializable{
    String pasillo, almacen;
    int posicion;

    public Ubicacion(String almacen, String pasillo, int posicion) {
        this.almacen = almacen;
        this.pasillo = pasillo;
        this.posicion = posicion;
    }

    public String getPasillo() {
        return pasillo;
    }

    public int getPosicion() {
        return posicion;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setPasillo(String pasillo) {
        this.pasillo = pasillo;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    @Override
    public String toString() {
        return almacen+ " - " + pasillo+" , "+posicion;
    }

}
