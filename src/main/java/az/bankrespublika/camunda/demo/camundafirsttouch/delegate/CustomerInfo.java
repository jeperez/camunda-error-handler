/*
 * Copyright (c) 2019.
 * For internal use only — Not for external distribution.
 * It contains proprietary and confidential information.
 * This source code is the property of Bank Respublika ©1992 - 2019.
 * If you encountered with this code on public resources, please contact with admin@bankrespublika.az
 *
 * az.bankrespublika.camunda.demo.camundafirsttouch.delegate.CustomerInfo
 *
 * @Project:  camunda-firsttouch
 * @Author:   RashadKh
 * @Created:  8/9/2019
 */

package az.bankrespublika.camunda.demo.camundafirsttouch.delegate;

import az.bankrespublika.camunda.demo.camundafirsttouch.entity.TestEntity;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.Variables;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerInfo implements JavaDelegate {
    @Autowired
    Logger logger;

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        logger.info("Hi from Customer");

        TestEntity en = new TestEntity();
        en.setIsfrozen(false);


        execution.setVariable("testEntity", Variables.objectValue(en).create());

    }
}
