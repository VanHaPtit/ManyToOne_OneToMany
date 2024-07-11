package com.example.kiem_tra_email_hop_le.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="User")
public class UserEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Long id ;
    @Column(name="Name")
    private String name ;
    @Column(name = "UserPhone")
    private String Phone ;
    @Column(name = "Address")
    private String Address ;


    // phải có getter setter
    @OneToMany(mappedBy = "User" , fetch = FetchType.LAZY)
    private List<ProductEntity> productEntities = new ArrayList<>();

    public List<ProductEntity> getProductEntities() {
        return productEntities;
    }

    public void setProductEntities(List<ProductEntity> productEntities) {
        this.productEntities = productEntities;
    }


    //    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(
//            name = "User_Product",
//            joinColumns = @JoinColumn(name = "userId" , nullable = false),
//            inverseJoinColumns = @JoinColumn(name = "ProductId" , nullable = false))
//    private List<ProductEntity> productEntities = new ArrayList<>() ;


    public UserEntity() {
    }

    public UserEntity(String name, String phone, String address) {
        this.name = name;
        Phone = phone;
        Address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
