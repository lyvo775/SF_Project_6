package com.l2team.sf_project_6;

public class Items {

        int id;
        String name;
        String brand;
        String color;

        // constructors
        public Items() {
        }

        public Items(String name, String brand, String color) {
            this.name = name;
            this.brand = brand;
            this.color = color;
        }

        public Items(int id, String name, String brand, String color) {
            this.id = id;
            this.name = name;
            this.brand = brand;
            this.color = color;
        }

        // setters
        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // getters
        public long getId() {
            return this.id;
        }

        public String getName(){
            return this.name;
        }

    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return this.color;
    }


}
