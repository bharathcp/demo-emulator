package services.digitalpartner.demo.emulator.web

import com.google.common.base.Predicates
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.HandlerMapping
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport
import org.springframework.web.servlet.handler.AbstractHandlerMapping
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

/**
 * Created by prakashb on 25/01/18.
 */
@Configuration
@EnableSwagger2
class SwaggerConfig extends WebMvcConfigurationSupport {

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("**/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
    registry.addResourceHandler("**/webjars/**").addResourceLocations("classpath:/META-INF/resources/");

  }
  @Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).ignoredParameterTypes(MetaClass)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(Predicates.not(PathSelectors.regex("/error")))
				.build();
	}
  @Override
  @Bean
  public HandlerMapping resourceHandlerMapping() {
    AbstractHandlerMapping handlerMapping = super.resourceHandlerMapping();
    handlerMapping.setOrder(-1);  // one ahead of annotated controllers
    return handlerMapping;
  }

}