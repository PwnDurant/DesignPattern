package com.zqq.uml.dependency;

public class PersonServiceBean {
    private String test;
    private PersonDao personDao;
    public void save(Person person){

    }
    public IDCard getIDCard(Integer personId){
        return new IDCard();
    }
    public void modify(){
        Department department = new Department();
    }
}


