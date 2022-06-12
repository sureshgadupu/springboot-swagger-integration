package dev.fullstackcode.eis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build();
//    }



    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("dev.fullstackcode.eis"))
                .paths(PathSelectors.any())
                //.paths(PathSelectors.ant("/employee/**"))
                .build();
    }

    private ApiInfo getApiInfo() {


        return new ApiInfoBuilder()
                .title("FullStackCode EIS")
                .description("This page lists API of Employee Information System")
                .version("1.0")
                .license("v2.0")
                .licenseUrl("https://www.fullstackcode.dev/licence.html")
                .contact(new Contact("Suresh", "https://www.fullstackcode.dev/","suresh@fullstackcode.dev"))
                .build();
    }
}
