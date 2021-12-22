package com.geekbrains.backend.test.miniMarket;

import com.geekbrains.backend.test.miniMarket.model.Product;
import com.geekbrains.backend.test.miniMarket.model.ProductResponse;
import jdk.jfr.Category;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class MiniMarketService {

    private final MiniMarketApi api;
    private Object object;

    public MiniMarketService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8189/market/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(MiniMarketApi.class);
    }

    /* Изменили на ProductResponse
    public Product getProduct(Long id) throws IOException {
        Response<Product> response = api.getProduct(id).execute();
        if (response.isSuccessful()) {
            return response.body();
        } else {
            throw new RuntimeException("product not found");
        }
    }*/

    public ProductResponse getProduct(Long id) throws IOException {
        Response<Product> response = api.getProduct(id).execute();  // execute значит отправить запрос
        ProductResponse productResponse = new ProductResponse();

        if (response.isSuccessful()) {
            productResponse.setProduct(response.body());
            return productResponse;
        } else {
            productResponse.setError(response.errorBody().string());
            return productResponse;
        }

    }


    //public ProductResponse[] getProducts() throws IOException {
    public Product[] getProducts() throws IOException {
        Response<List<Product>> response = api.getProducts().execute();
        //ProductResponse[] productResponse = new ProductResponse[response.body().size()];
        Product[] products = new Product[response.body().size()];

        //ProductResponse prodResponse = new ProductResponse();
        Product prod = new Product();

        for (int i = 0; i < response.body().size(); i++) {

            //prodResponse.setProduct(response.body().get(i));
            prod = response.body().get(i);

            //productResponse[i] = prodResponse;
            products[i] = prod;

        }
        //return productResponse;
        return products;
    }


//  работает
    public String createProduct(Product product) throws IOException {
        Response<Object> response = api.createProduct(product).execute();  // execute значит отправить запрос

        if (response.isSuccessful()) {
            return "Ok";
        } else {
            return "error";
        }
    }

//    public ProductResponse createProduct(Object product) throws IOException {
//        Response<Product> response = api.createProduct(product).execute();
//        ProductResponse productResponse = new ProductResponse();
//
//     if (response.isSuccessful()) {
//        //Product product1 = new Product();
//        //String a = response.body().toString();
//
//        //productResponse.setProduct(response.body());
//        //return productResponse;
//        return "Ok";
//    } else {
////            productResponse.setError(response.errorBody().string());
////            return productResponse;
//        return "error";
//    }
//}










//    public Product setProduct(product) throws IOException {
//
//
//        Response<Object> response = api.createProduct(product).execute();
//        if (response.isSuccessful()) {
//            return product; //response.body();
//        } else {
//            throw new RuntimeException("123");
//        }
//    }

    public String updateProduct(Product product) throws IOException {
        Response<Object> response = api.createProduct(product).execute();  // execute значит отправить запрос

        if (response.isSuccessful()) {
            return "Ok";
        } else {
            return "error";
        }
    }

    public ProductResponse deleteProduct(Long id) throws IOException {
        Response<Product> response = api.getProduct(id).execute();  // execute значит отправить запрос
        ProductResponse productResponse = new ProductResponse();

        if (response.isSuccessful()) {
            productResponse.setProduct(response.body());
            return productResponse;
        } else {
            productResponse.setError(response.errorBody().string());
            return productResponse;
        }

    }


    public ProductResponse getCategory(Long id) throws IOException {
        Response<Category> response = api.getCategory(id).execute();  // execute значит отправить запрос
        ProductResponse productResponse = new ProductResponse();

        if (response.isSuccessful()) {
            productResponse.setProduct(response.body());
            return productResponse;
        } else {
            productResponse.setError(response.errorBody().string());
            return productResponse;
        }

    }










}
