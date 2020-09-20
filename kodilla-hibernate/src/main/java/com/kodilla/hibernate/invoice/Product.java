package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCT")
public final class Product {
    private int id;
    private String name;
    private Item item;

    public Product() {  }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {return id;}

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    public Item getItem() { return item;    }
    public void setItem(Item item) { this.item = item;  }

//    //***uwagi 4sie:
//    @OneToMany(targetEntity = Item.class,
//    mappedBy =  "product",
//    cascade = CascadeType.ALL,
//    fetch = FetchType.LAZY)
//   public List<Item> getItem() {return  item;}


    @NotNull
    @Column(name = "NAME")
    public String getName() {return name;}

    private void setId(int id) {this.id = id;}

    private void setName(String name) {this.name = name;}

}
