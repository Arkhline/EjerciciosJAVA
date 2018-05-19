package ar.edu.ottokrause.psr;

public class Matrix {

    private double[][] matriz;

    public Matrix(int sizeX, int sizeY) {
        this.matriz = new double[sizeX][sizeY];
    }

    public void pasarAderecha(){
        for(int i=0; i < this.matriz.length; i++) {
            int ultpos = this.matriz[i].length - 1;
            double ultimovalor = this.matriz[i][ultpos]; // ultimo valor lo guardamos para que no se pierda.

            for(int j=ultpos; j > -1; j--) {
                if (j -1  > -1) {
                    this.matriz[i][j] = this.matriz[i][j - 1];
                } else {
                    this.matriz[i][0] = ultimovalor;
                }
            }
        }
    }

    public void pasarAIzquierda(){
        for(int i=0; i < this.matriz.length; i++) {
            int ultpos = this.matriz[i].length - 1;
            double primervalor = this.matriz[i][0]; // nos guardamos el primer valor para colocarlo a lo ultimo.

            for (int j= 0; j < this.matriz[i].length; j++) {
                if (j + 1 < ultpos) {
                    this.matriz[i][j] = this.matriz[i][j + 1];
                }else {
                    this.matriz[i][ultpos] = primervalor;
                }
            }
        }
    }
}
