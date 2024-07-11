package com.example.kiem_tra_email_hop_le.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Product")

public class ProductEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id ;
    @Column(name = "ProductName")
    private String ProductName ;
    @Column(name = "Origin")
    private String Origin ;


    // phải có getter và setter

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserId")
    private UserEntity userEntity ;

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    //
//    @ManyToMany(mappedBy = "productEntities" , fetch = FetchType.LAZY)
//    private List<UserEntity> userEntities = new ArrayList<>();


    public ProductEntity(String productName, String origin) {
        ProductName = productName;
        Origin = origin;
    }

    public ProductEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }
}
