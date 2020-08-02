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
    public void testInvoiceDaoSave() {

        //given
        Product product1 = new Product("laptop");
        Product product2 = new Product("baterie AAA");
        Product product3 = new Product("myszka");
        Product product4 = new Product("kabel");

        Item item1 = new Item(product1,new BigDecimal(1000),3,new BigDecimal(3000));
        Item item2 = new Item(product2,new BigDecimal(2),10,new BigDecimal(20));
        Item item3 = new Item(product3,new BigDecimal(100),3,new BigDecimal(300));

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
