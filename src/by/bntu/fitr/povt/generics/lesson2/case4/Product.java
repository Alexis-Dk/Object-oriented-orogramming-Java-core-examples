package by.bntu.fitr.povt.generics.lesson2.case4;


import by.bntu.fitr.povt.generics.lesson2.case4.interfaces.B;
import by.bntu.fitr.povt.generics.lesson2.case4.interfaces.C;
import by.bntu.fitr.povt.generics.lesson2.case4.interfaces.D;

public class Product implements B, C, D {

    String name = "Product Name";
    String price = "Product Price";

    public Product() {
    }

    public Product(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
