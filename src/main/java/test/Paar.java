package test;

public class Paar {
    private int index1;
    private int index2;

    public Paar(int index1, int index2) {
        this.index1 = index1;
        this.index2 = index2;
    }

    public int getIndex1() {
        return index1;
    }

    public int getIndex2() {
        return index2;
    }

    @Override
    public String toString() {
        return "Paar{" +
                "index1=" + index1 +
                ", index2=" + index2 +
                '}';
    }
}
