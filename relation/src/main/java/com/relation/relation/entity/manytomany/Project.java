package com.relation.relation.entity.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;

    private String name;

    // @ManyToMany(mappedBy = "project")
    @ManyToMany
    // @JoinTable(name = "employee_project", joinColumns = @JoinColumn(name =
    // "project_id"), inverseJoinColumns = @JoinColumn(name = "employee_id"))
    private List<Employee> employee = new ArrayList<>();

    public Project(String name) {

        this.name = name;
    }

    public void projectemployee(Employee employee1) {
        employee.add(employee1);
    }

    public Project() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployee() {
        return this.employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

}
