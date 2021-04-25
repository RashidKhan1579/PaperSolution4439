package com.mids.papersolution4439.Q4;

public class Contact {
    private int imgContact;
    private String name;
    private String phone;

    public Contact(int imgContact, String name, String phone) {
        this.imgContact = imgContact;
        this.name = name;
        this.phone = phone;
    }

    public int getImgContact() {
        return imgContact;
    }

    public void setImgContact(int imgContact) {
        this.imgContact = imgContact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
