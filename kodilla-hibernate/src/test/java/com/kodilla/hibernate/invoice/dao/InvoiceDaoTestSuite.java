package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    InvoiceDao invoiceDao;
    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");
        Product product3 = new Product("Product 3");

        Item  item1 = new Item(new BigDecimal(15),1,new BigDecimal(15));
        Item  item2 = new Item(new BigDecimal(25),2,new BigDecimal(50));
        Item  item3 = new Item(new BigDecimal(10),10,new BigDecimal(100));

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        product1.getItem().add(item1);
        product2.getItem().add(item2);
        product3.getItem().add(item3);


        Invoice invoice = new Invoice("Jeden");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        //Then
        Assert.assertNotEquals(0, id);
    }
}
