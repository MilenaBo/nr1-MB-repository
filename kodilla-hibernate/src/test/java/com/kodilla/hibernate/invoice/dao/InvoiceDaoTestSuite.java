package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
      //given
        Product product1 = new Product("PRODUCT_1");
        Product product2 = new Product("PRODUCT_2");
        Product product3 = new Product("PRODUCT_3");
        Product product4 = new Product("PRODUCT_4");

        Item item1 = new Item(product2, new BigDecimal(100),3,new BigDecimal(300));
        Item item2 = new Item(product3, new BigDecimal(200),1,new BigDecimal(200));
        Item item3 = new Item(product4, new BigDecimal(10),3,new BigDecimal(30));

        item1.setProduct(product2);
        item2.setProduct(product3);
        item3.setProduct(product4);

        Invoice invoice = new Invoice("number1001");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //when
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0,id);
        //cleanUp
        invoiceDao.deleteById(id);
    }
}
