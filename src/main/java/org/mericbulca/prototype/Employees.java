package org.mericbulca.prototype;

import java.util.ArrayList;
import java.util.List;

/*
Prototype design pattern is used to provide a way of copying object for preventing the execution of
expensive operations. Instead, we copy an already existing object and modifying it.
 */
public class Employees implements Cloneable {
    private List<String> empList;

    public Employees(List<String> empList) {
        this.empList = empList;
    }

    public Employees() {
        this.empList = new ArrayList<String>();
    }

    public void loadData(){
        //reading operation from database which is expensive
        empList.add("Meric");
        empList.add("İrem");
        empList.add("Melih");
        empList.add("Mehmet");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empList=" + empList +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> newList = new ArrayList<String>(this.getEmpList());
        return new Employees(newList);
    }
}
