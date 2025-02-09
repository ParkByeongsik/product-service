package com.example.productservice;

import com.example.productservice.entity.Category;
import com.example.productservice.entity.ProductEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional
@Rollback(false)
class ProductEntityTest {
    @PersistenceContext
    EntityManager em;

    @Test
    public void test() {
        Category categoryEntity1 = new Category("NameTest1","InfoTest1");
        Category categoryEntity2 = new Category("NameTest2","InfoTest2");
        Category categoryEntity3 = new Category("NameTest3","InfoTest3");

        ProductEntity productEntity1 = new ProductEntity("NameTest1","InfoTest1", 10000 ,1 );
        ProductEntity productEntity2 = new ProductEntity("NameTest2","InfoTest2", 20000 ,2);
        ProductEntity productEntity3 = new ProductEntity("NameTest3","InfoTest3", 30000 ,3);

        List<ProductEntity> historyEntityList = new ArrayList<>();
        historyEntityList.add(new ProductEntity("NameTest1","InfoTest1", 10000 ,1 ));
        historyEntityList.add(new ProductEntity("NameTest2","InfoTest2", 20000 ,2));
        historyEntityList.add(new ProductEntity("NameTest3","InfoTest3", 30000 ,3));

        Category emp =new Category("name","info", historyEntityList);
        em.persist(emp);
//        em.persist(categoryEntity1);
//        em.persist(productEntity2);
//        em.persist(productEntity3);

    }

    @Test
    public void test2() {

    }
}