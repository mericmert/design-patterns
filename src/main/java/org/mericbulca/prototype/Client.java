package org.mericbulca.prototype;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.loadData();
        System.out.println(employees);

        try{
            Employees employees1 = (Employees) employees.clone();
            List<String> empList = employees1.getEmpList();
            empList.remove("İrem");
            empList.add("Nuray");
            System.out.println(empList);

        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
