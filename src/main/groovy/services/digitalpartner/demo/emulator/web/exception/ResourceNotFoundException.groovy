package services.digitalpartner.demo.emulator.web.exception

import groovy.transform.ToString
import groovy.transform.builder.Builder

/**
 * Created by prakashb on 8/05/18.
 */
@Builder
@ToString
class ResourceNotFoundException extends RuntimeException{
  private String firstName;
  private String lastName;
}
