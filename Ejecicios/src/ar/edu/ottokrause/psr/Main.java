package ar.edu.ottokrause.psr;

public class Main {

    public static void main(String[] args) {
        int[] lala = new int[] {1,2,3};

        int ultimovalor = lala[lala.length - 1]; // ultimo valor lo guardamos para que no se pierda.

        int ultimaposicion = lala.length - 1;


        for (int j= ultimaposicion; j > -1; j--) {
            if (j - 1 > -1) {
                lala[j] = lala[j - 1];
            } else {
                lala[0] = ultimovalor;
            }
        }









        IntegerList list = new IntegerArrayList(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.set(4, 9);


        System.out.println(list.size());
        list.remove(2);
        System.out.println(list.size());
        list.add(0, 10);
        list.add(11);
    }
}
