package services.digitalpartner.demo.emulator.web.controller

import io.swagger.annotations.ApiOperation
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
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
@RequestMapping(path = "/data")
@ConfigurationProperties(prefix = "mock")
class MockDataController {
  Map data;

  @GetMapping
  @ApiOperation("Mock data available")
  Map getdata() {
    data
  }

}
