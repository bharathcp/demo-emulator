package services.digitalpartner.demo.emulator.web.vo

import groovy.transform.ToString
import groovy.transform.builder.Builder;


/**
 * Created by prakashb on 12/12/17.
 */
@Builder
@ToString
class ReqError {
  String type;
  String message;
}
