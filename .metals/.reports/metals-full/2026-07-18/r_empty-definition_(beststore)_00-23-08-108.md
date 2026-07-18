error id: file:///C:/Users/sheng/projects/beststore/beststore/src/main/java/com/joe/beststore/controllers/ProductController.java:_empty_/ProductDto#
file:///C:/Users/sheng/projects/beststore/beststore/src/main/java/com/joe/beststore/controllers/ProductController.java
empty definition using pc, found symbol in pc: _empty_/ProductDto#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 970
uri: file:///C:/Users/sheng/projects/beststore/beststore/src/main/java/com/joe/beststore/controllers/ProductController.java
text:
```scala
package com.joe.beststore.controllers;

import com.joe.beststore.models.Product;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joe.beststore.services.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProductController{

    @Autowired
    private ProductRepository repo;

    @GetMapping({"", "/"})
    public String showProductList(Model model){
        List<Product> products = repo.findAll(Sort.by(Sort.Direction.DESC,"id"));
        model.addAttribute("products",products);
        return "products/index";
    }

    @GetMapping({"/create"})
    public String showCreatePage(Model model){
        Pro@@ductDto productDto = new ProductDto();
        model.addAttribute("productDto", productDto);
        return "products/CreateProduct";
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/ProductDto#