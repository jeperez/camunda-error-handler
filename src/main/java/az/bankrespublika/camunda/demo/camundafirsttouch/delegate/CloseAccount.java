/*
 * Copyright (c) 2019.
 * For internal use only — Not for external distribution.
 * It contains proprietary and confidential information.
 * This source code is the property of Bank Respublika ©1992 - 2019.
 * If you encountered with this code on public resources, please contact with admin@bankrespublika.az
 *
 * az.bankrespublika.camunda.demo.camundafirsttouch.delegate.CloseAccount
 *
 * @Project:  camunda-firsttouch
 * @Author:   RashadKh
 * @Created:  8/9/2019
 */

package az.bankrespublika.camunda.demo.camundafirsttouch.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CloseAccount implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.err.println("ENDED");
    }
}
