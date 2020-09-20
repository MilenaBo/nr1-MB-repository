package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ITEM")
public class Item {
    private  int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;
    private List<Product> products = new ArrayList<>();

    public Item() {}

    public Item(Product product, BigDecimal price, int quantity, BigDecimal value) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {return id;}
    private void setId(int id) {
        this.id = id;
    }

    //***uwagi 4sie:
    @ManyToOne
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {return invoice;}
    public void  setInvoice(Invoice invoice) { this.invoice = invoice;   }
    //KOLUMNA
    public Product getProduct() { return product;   }
    public void setProduct(Product product) {  this.product = product;   }

//    //***uwagi 4sie:
//    @ManyToOne
//    @JoinColumn(name = "PRODUCT_ID")
//    public Product getProduct() {
//        return product;
//    }

    @OneToMany(
            targetEntity = Product.class,
            mappedBy = "item",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    public List<Product> getProducts() { return products; }
    private void setProducts(List<Product> products) { this.products = products;  }

    @Column(name = "PRICE")
    public BigDecimal getPrice() { return price;  }
    private void setPrice(BigDecimal price) { this.price = price;  }

    @Column(name = "QUANTITY")
    public int getQuantity() {  return quantity;     }
    private void setQuantity(int quantity) {  this.quantity = quantity;   }

    @Column(name = "VALUE")
    public BigDecimal getValue() { return value;   }
    private void setValue(BigDecimal value) {  this.value = value;   }
}
