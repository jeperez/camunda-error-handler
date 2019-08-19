/*
 * Copyright (c) 2019.
 * For internal use only — Not for external distribution.
 * It contains proprietary and confidential information.
 * This source code is the property of Bank Respublika ©1992 - 2019.
 * If you encountered with this code on public resources, please contact with admin@bankrespublika.az
 *
 * az.bankrespublika.camunda.demo.camundafirsttouch.JerseyConfiguration
 *
 * @Project:  camunda-firsttouch
 * @Author:   RashadKh
 * @Created:  8/8/2019
 */

package az.bankrespublika.camunda.demo.camundafirsttouch;

import org.camunda.bpm.spring.boot.starter.rest.CamundaJerseyResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/camunda-api")
public class JerseyCamundaConfiguration extends CamundaJerseyResourceConfig {
}
