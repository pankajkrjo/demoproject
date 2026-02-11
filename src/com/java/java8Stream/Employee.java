package com.java.java8Stream;

import java.util.Objects;

public class Employee {

   private int id;
   private String name;
   private String dep;

    public Employee(int id, String name, String dep) {
        this.id = id;
        this.name = name;
        this.dep = dep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dep='" + dep + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(dep, employee.dep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dep);
    }
}

