package com.minhao.springbootmall.service;

import com.minhao.springbootmall.dto.ProductRequest;
import com.minhao.springbootmall.model.Product;
import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
