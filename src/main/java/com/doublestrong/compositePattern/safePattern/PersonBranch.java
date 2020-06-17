package com.doublestrong.compositePattern.safePattern;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Double strong
 * @date 2020/6/13 17:16
 *
 */
@Data
@ToString
public class PersonBranch  extends PersonMode {

//    保存其子类的引用集合，并管理

private List<PersonMode> personModeList=new ArrayList<>();

    public PersonBranch(){
        super();
    }
    public PersonBranch(String name, String sex, int age) {
        super(name, sex, age);
    }
    public void addPerson(PersonMode person){
        this.personModeList.add(person);
    }
}
