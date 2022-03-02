package ss12_java_collection_framework.bai_tap.sort;

import ss12_java_collection_framework.bai_tap.product.Product;

import java.util.Comparator;

public class SortUp implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getValue() - o2.getValue());
    }

}
