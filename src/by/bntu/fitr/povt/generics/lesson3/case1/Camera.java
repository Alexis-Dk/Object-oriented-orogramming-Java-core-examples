package by.bntu.fitr.povt.generics.lesson3.case1;

public class Camera extends Product {

    private Integer pixels = 1024;

    public Integer getPixels() {
        return pixels;
    }

    public void setPixels(Integer pixels) {
        this.pixels = pixels;
    }

    public int subCompare(Product o) {
        if (o instanceof Camera) {
            return 0;
        }
        return 0;
    }
}
