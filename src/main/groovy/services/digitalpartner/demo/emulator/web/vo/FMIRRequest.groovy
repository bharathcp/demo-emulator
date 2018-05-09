package services.digitalpartner.demo.emulator.web.vo

import groovy.transform.ToString
import groovy.transform.builder.Builder
import io.swagger.annotations.ApiModelProperty

/**
 * Created by prakashb on 8/05/18.
 */
@Builder
@ToString
class FMIRRequest {
  @ApiModelProperty(required = true, example = "Julie")
  String firstName
  @ApiModelProperty(required = true, example = "LN")
  String lastName
  @ApiModelProperty(value = "should be a past date in YYYY-MM-DD format",required = true, example = "1995-05-19")
  String dob
  @ApiModelProperty(example = "julie.doe@emailprovider.com")
  String email
}
