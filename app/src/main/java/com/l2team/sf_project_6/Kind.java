package com.l2team.sf_project_6;

public class Kind {
    int id;
    String name;

    // constructors
    public Kind() {
    }

    public Kind(String name) {
        this.name = name;
    }

    public Kind(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getters
    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
