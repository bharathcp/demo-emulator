package services.digitalpartner.demo.emulator.web.controller

import io.swagger.annotations.ApiOperation
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import services.digitalpartner.demo.emulator.web.exception.ResourceNotFoundException
import services.digitalpartner.demo.emulator.web.vo.FMIRRequest
import services.digitalpartner.demo.emulator.web.vo.FMIRResponse

/**
 * Created by prakashb on 8/05/18.
 */
@RestController
@RequestMapping(path = "/ir_number")
@ConfigurationProperties(prefix = "mock")
class FMIRController {
  Map data;

  @PostMapping
  @ApiOperation("whats my IR individual")
  FMIRResponse findmyir(@Validated @RequestBody FMIRRequest request) {
    Map.Entry persona = data.find {
      it.value.firstName.equalsIgnoreCase(request.firstName) && it.value.lastName.equalsIgnoreCase(request.lastName) && it.value.dob==request.dob
    }

    if (persona) {
      FMIRResponse.builder().ir_number(persona.value.ir_number).build();
    }else{
      throw new ResourceNotFoundException(firstName: request.firstName, lastName: request.lastName)
    }
  }

}
