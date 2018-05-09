package services.digitalpartner.demo.emulator.web.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import services.digitalpartner.demo.emulator.web.vo.ErrorResponse
import services.digitalpartner.demo.emulator.web.vo.ReqError

/**
 * Created by prakashb on 8/05/18.
 */
@ControllerAdvice
@EnableWebMvc
class ExceptionHandler {

  @org.springframework.web.bind.annotation.ExceptionHandler(ResourceNotFoundException.class)
  @ResponseBody
  ResponseEntity<ErrorResponse> irdNumberNotFoundExceptionHandler(ResourceNotFoundException exception) {
    List<ReqError> errorMsgs = [ReqError.builder().type("result").message("IR number not found").build()]
    new ResponseEntity<ErrorResponse>(ErrorResponse.builder().errors(errorMsgs).build(), HttpStatus.NOT_FOUND)
  }

}
