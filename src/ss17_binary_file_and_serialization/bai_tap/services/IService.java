package ss17_binary_file_and_serialization.bai_tap.services;

import ss17_binary_file_and_serialization.bai_tap.models.Product;

public interface IService {
    void create(Product product);
    void read();
    void update();
    void delete();
}
