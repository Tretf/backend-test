package com.geekbrains.backend.test;

import com.geekbrains.backend.test.miniMarket.MiniMarketService;
import com.geekbrains.backend.test.miniMarket.model.Product;
import com.geekbrains.backend.test.miniMarket.model.ProductResponse;

import java.io.IOException;
import java.util.List;

public class TestMiniMarket {

    public static void main(String[] args) throws IOException {
        MiniMarketService service = new MiniMarketService();

        ProductResponse product = service.getProduct(2L);
        System.out.println(product);



//        ProductResponse[] products = service.getProducts();
//        for (ProductResponse prod : products) {
//            System.out.println(prod);
//        }
        Product[] products = service.getProducts();
        for (Product prod : products) {
            System.out.println(prod);
        }



        Product productNew = new Product();
        productNew.setId(null);
        productNew.setTitle("Butter");
        productNew.setPrice(125);
        productNew.setCategoryTitle("Food");

        // работает
        String product2 = service.createProduct(productNew);
        System.out.println(product2);




        Product productNew2 = new Product();
        productNew2.setId(7L);
        productNew2.setTitle("ButterBroad");
        productNew2.setPrice(25);
        productNew2.setCategoryTitle("Food");


        String product3  = service.updateProduct(productNew2);
        System.out.println(product2);


        ProductResponse product4 = service.deleteProduct(6L);
        System.out.println(product4);




    }

}


