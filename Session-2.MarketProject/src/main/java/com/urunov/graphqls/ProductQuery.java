package com.urunov.graphqls;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.urunov.dataresource.ProductResource;
import com.urunov.input.Product;

import java.util.Optional;

public class ProductQuery implements GraphQLQueryResolver {

    private ProductResource productResource;

    public ProductQuery(ProductResource productResource) {
        this.productResource = productResource;
    }

    public Iterable<Product> findAllProducts(){
        return productResource.findAll();
    }

    public long countProduct(){
        return productResource.count();
    }

    public Optional<Product> findById(Long id){
        return productResource.findById(id);
    }

}
