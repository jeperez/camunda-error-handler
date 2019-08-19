/*
 * Copyright (c) 2019.
 * For internal use only — Not for external distribution.
 * It contains proprietary and confidential information.
 * This source code is the property of Bank Respublika ©1992 - 2019.
 * If you encountered with this code on public resources, please contact with admin@bankrespublika.az
 *
 * az.bankrespublika.camunda.demo.camundafirsttouch.entity.TestEntity
 *
 * @Project:  camunda-demo-standalone
 * @Author:   RashadKh
 * @Created:  8/13/2019
 */

package az.bankrespublika.camunda.demo.camundafirsttouch.entity;

import java.io.Serializable;

public class TestEntity implements Serializable {
    String name;
    Integer age;
    Boolean isfrozen;

    public TestEntity() {
    }

    public boolean isIsfrozen() {
        return isfrozen;
    }

    public void setIsfrozen(boolean isfrozen) {
        this.isfrozen = isfrozen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
