package by.bntu.fitr.povt.generics.lesson3.case1;

public class Phone extends Product {

    private Double diagonal = 5.0;

    public Double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Double diagonal) {
        this.diagonal = diagonal;
    }

    public int subCompare(Product o) {
        if (o instanceof Phone) {
            return 0;
        }
        return 0;
    }

}
