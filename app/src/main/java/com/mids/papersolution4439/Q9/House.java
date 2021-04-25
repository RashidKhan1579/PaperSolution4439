package com.mids.papersolution4439.Q9;

public class House {
    private String price;
    private String place;
    private String city;
    private String category;
    private String area;
    public House(String price, String place, String city, String category, String area) {
        this.price = price;
        this.place = place;
        this.city = city;
        this.category = category;
        this.area = area;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
}
