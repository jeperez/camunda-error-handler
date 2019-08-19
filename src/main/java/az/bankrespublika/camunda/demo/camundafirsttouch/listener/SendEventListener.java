/*
 * Copyright (c) 2019.
 * For internal use only — Not for external distribution.
 * It contains proprietary and confidential information.
 * This source code is the property of Bank Respublika ©1992 - 2019.
 * If you encountered with this code on public resources, please contact with admin@bankrespublika.az
 *
 * az.bankrespublika.camunda.demo.camundafirsttouch.listener.SendEventListener
 *
 * @Project:  camunda-demo-standalone
 * @Author:   RashadKh
 * @Created:  8/16/2019
 */

package az.bankrespublika.camunda.demo.camundafirsttouch.listener;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

public class SendEventListener implements ExecutionListener {

    @Override
    public void notify(DelegateExecution execution) throws Exception {
        System.out.println("Hello world. There was an event '" + execution.getEventName() + "'! It came from activity '"+execution.getCurrentActivityId()+"' for process instance '" + execution.getProcessInstanceId() + "'");
    }

}