package com.zqq.demeter;

import java.util.ArrayList;
import java.util.List;

public class Demeter1 {
    public static void main(String[] args) {
        System.out.println("使用 Demeter 法则的改进...");
        SchoolManager schoolManager=new SchoolManager();  //创建了学校管理类
        schoolManager.printAllEmployee(new CollegeManager());
    }
}
class Employee{   //学校总部员工
    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
class CollegeEmployee{  //学院员工类
    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
class CollegeManager{   //管理学院员工的类
    public List<CollegeEmployee> getAllEmployee(){
        ArrayList<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {  //增加了10个员工到list
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("学院员工id="+i);
            list.add(employee);
        }
        return list;
    }
    public void printEmployee(){
        List<CollegeEmployee> list1 = this.getAllEmployee();  //输出到学院员工信息
        System.out.println("---------分公司员工-----------");
        for (CollegeEmployee employee : list1) {
            System.out.println(employee.getId());
        }
    }
}
class SchoolManager{   //学校的管理类
    public List<Employee> getAllEmployee(){
        ArrayList<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {  //增加了5个员工到list
            Employee employee = new Employee();
            employee.setId("学校总部员工id="+i);
            list.add(employee);
        }
        return list;
    }
    void printAllEmployee(CollegeManager sub){   //该方法完成输出学校总部和学院员工信息的方法
        sub.printEmployee();
        List<Employee> list2 = this.getAllEmployee();        //获取到学校总部员工信息
        System.out.println("---------学校总部员工----------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}