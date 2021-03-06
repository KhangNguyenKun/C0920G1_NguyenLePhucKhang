package Service;

import Model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1 , "Samsung Note 10" , "Samsung", "1000"));
        products.put(2, new Product(2 , "Samsung Note 9" , "Samsung", "1000"));
        products.put(3, new Product(3 , "Samsung Note 0" , "Samsung", "1000"));
        products.put(4, new Product(4 , "Samsung Note 8" , "Samsung", "1000"));
        products.put(5, new Product(5 , "Samsung Note 10" , "Samsung", "1000"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int  id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }
}
