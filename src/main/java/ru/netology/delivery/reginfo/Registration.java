package ru.netology.delivery.reginfo;
public class Registration {

    private String city;
    private String date;
    private String name;
    private String phone;

    public Registration(String city, String data, String name, String phone) {
        this.city = city;
        this.date = date;
        this.name = name;
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getData() {
        return date;
    }

    public void setData(String data) {
        this.date = data;
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
