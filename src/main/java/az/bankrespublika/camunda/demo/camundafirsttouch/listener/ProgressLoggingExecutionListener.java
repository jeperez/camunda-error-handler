/*
 * Copyright (c) 2019.
 * For internal use only — Not for external distribution.
 * It contains proprietary and confidential information.
 * This source code is the property of Bank Respublika ©1992 - 2019.
 * If you encountered with this code on public resources, please contact with admin@bankrespublika.az
 *
 * az.bankrespublika.camunda.demo.camundafirsttouch.listener.ProgressLoggingExecutionListener
 *
 * @Project:  camunda-demo-standalone
 * @Author:   RashadKh
 * @Created:  8/16/2019
 */

package az.bankrespublika.camunda.demo.camundafirsttouch.listener;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class ProgressLoggingExecutionListener implements ExecutionListener {

    @Autowired
    Logger LOGGER;

    // static value list to see in the UNIT test if the execution listener was executed
    public static List<String> progressValueList = new ArrayList<String>();

    private String propertyValue;

    public ProgressLoggingExecutionListener(){}
    public ProgressLoggingExecutionListener(String value) {
        this.propertyValue = value;
    }

    // notify method is executed when Execution Listener is called
    public void notify(DelegateExecution execution) throws Exception {
        progressValueList.add(propertyValue);

        // logging statement to see which value have the property 'progress'
        LOGGER.info("value of service task extension property 'progress': " + propertyValue);
    }
}