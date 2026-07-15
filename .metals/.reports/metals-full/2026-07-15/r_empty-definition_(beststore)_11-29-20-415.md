error id: file:///C:/Users/sheng/projects/beststore/beststore/src/main/java/com/joe/beststore/models/Product.java:
file:///C:/Users/sheng/projects/beststore/beststore/src/main/java/com/joe/beststore/models/Product.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 468
uri: file:///C:/Users/sheng/projects/beststore/beststore/src/main/java/com/joe/beststore/models/Product.java
text:
```scala
package com.joe.beststore.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;;

@Entity
@Table (name = "products")
public class Product {
    @Id
    @GeneratedValue(stragety= GenerationType.IDETITY)

    private int Id;
    
    private String name; 
    private String@@ brand;
    



}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 