package api.client.client.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String userName;

    @Column(unique = true)
    private String licence;

    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date graduatedAt;

    public Client () {}

    public Client (Integer id, String userName, String firstName, String lastName, Date birthDate, String license, Date graduatedAt) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.licence = license;
        this.graduatedAt = graduatedAt;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public Date getGraduatedAt() {
        return graduatedAt;
    }

    public void setGraduatedAt(Date graduatedAt) {
        this.graduatedAt = graduatedAt;
    }
}
