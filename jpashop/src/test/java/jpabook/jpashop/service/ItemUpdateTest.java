package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

@SpringBootTest
public class ItemUpdateTest {

    @Autowired
    EntityManager em;

    @Test
    @DisplayName("updateTest")
    void updateTest() throws Exception {

        Book book = em.find(Book.class, 1L);

        //TX
        book.setName("asdfasdf");

        //변경감지 == dirty checking
        //TX commit

    }
}
