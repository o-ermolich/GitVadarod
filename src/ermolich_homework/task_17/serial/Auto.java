package ermolich_homework.task_17.serial;

import java.io.Serializable;

public class Auto implements Serializable {
    private String brand;
    private int maxSpeed;
    private String country;

    public Auto(String brand, int maxSpeed, String country) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        Auto auto = (Auto) o;
        return (brand.equals(auto.getBrand()) && maxSpeed == auto.getMaxSpeed() && country.equals(auto.getCountry()));

    }

    public int hashCode() {
        int result = (brand.hashCode() + maxSpeed + country.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", country='" + country + '\'' +
                '}';
    }
}
