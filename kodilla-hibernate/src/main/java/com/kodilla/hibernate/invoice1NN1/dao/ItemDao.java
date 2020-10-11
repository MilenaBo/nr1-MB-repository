package com.kodilla.hibernate.invoice1NN1.dao;


import com.kodilla.hibernate.invoice1NN1.Item;
import com.kodilla.hibernate.invoice1NN1.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface ItemDao extends CrudRepository<Item, Integer> {
    List<Item> findByProduct(Product product);
}
