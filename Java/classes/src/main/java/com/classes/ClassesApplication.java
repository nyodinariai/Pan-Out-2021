package com.classes;

import com.classes.table.Products;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ClassesApplication {

   public static void main(String[] args) {
      SpringApplication.run(ClassesApplication.class, args);

      Products product1 = new Products();
      product1.setDescription("Luva");
      product1.setValue(20.5);

      System.out.println(product1);
      System.out.println(product1.getDescription());
      System.out.println(product1.getValue());
   }

}