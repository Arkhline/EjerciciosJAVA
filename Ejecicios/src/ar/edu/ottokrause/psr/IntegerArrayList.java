package ar.edu.ottokrause.psr;

public class IntegerArrayList implements IntegerList {


    private int[] elements;

    public IntegerArrayList(int size) {
        this.elements = new int [size];
    }

    /**
     * Ingresa los datos a la variable.
     *
     * @param index
     * @param element
     * @return
     */
    public Integer set(int index, int element){
        //Ingresa los datos a la variable
        return this.elements[index]= element;
    }



    public void resize(int newSize){
        //Define arreglo de integer newElements y se le copia los valores de este a el arreglo integer newSize
        int[] newElements = new int[newSize];
        System.arraycopy(this.elements, 0, newElements, 0, Math.min(this.size(), newSize));
        this.elements = newElements;
    }



    @Override
    public boolean add(Integer element) {
        try {
            this.resize(this.size() +1 );
            this.elements[this.elements.length - 1] = element;
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public void add(int index, Integer element) {
        this.resize(this.size() + 1);
        int longCorrimientos = this.size() - 1 - index;
        System.arraycopy(this.elements, index, this.elements, index + 1, longCorrimientos);
        this.elements[index] = element;
    }

    @Override
    public boolean addAll(IntegerList aList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, IntegerList aList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Integer element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer get(int index) {
        //Lee los datos de la variable
        return this.elements[index];
    }

    @Override
    public int indexOf(Integer element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Integer element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int remove(int index) {
        int res = this.elements[index];
        System.arraycopy(this.elements, index + 1, this.elements, index, this.size() - 1 - index);
        this.resize(this.size() - 1);
        return res;
    }

    @Override
    public void set(int index, Integer element) {
        this.elements[index] = element;
    }

    @Override
    public int size() {
        //Devuelve el tamaño de elements
        return this.elements.length;
    }

    @Override
    public IntegerList subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}