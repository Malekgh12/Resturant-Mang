package com.university.Restaurant_management.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUser")
    private long idUser;

    @Column(name = "NameUser")
    private String NameUser;

    @Column(name="PrenomUser")
    private String PrenomUser;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Password")
    private String Password;

    @Column(name = "numeroTélephone")
    private String numeroTélephone;

    public User() {
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return NameUser;
    }

    public void setNameUser(String nameUser) {
        NameUser = nameUser;
    }

    public String getPrenomUser() {
        return PrenomUser;
    }

    public void setPrenomUser(String prenomUser) {
        PrenomUser = prenomUser;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getNumeroTélephone() {
        return numeroTélephone;
    }

    public void setNumeroTélephone(String numeroTélephone) {
        this.numeroTélephone = numeroTélephone;
    }
}
