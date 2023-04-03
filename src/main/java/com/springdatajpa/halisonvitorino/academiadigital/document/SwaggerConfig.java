package com.springdatajpa.halisonvitorino.academiadigital.document;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.Arrays;
import java.util.HashSet;
@EnableSwagger2
public class SwaggerConfig {
    private ApiInfoBuilder informacoesAPI() {

        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder
                .title("Curso Spring Boot REST API")
                .description("Um exemplo de aplicação Spring Boot REST API")
                .version("1.0.0")
                .license("HalisonVitorino - Quality Service")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .contact(new Contact("Halison Vitorino",
                                     "https://treinaweb.com.br",
                                     "halisonvitorino@gmail.com"));
        return apiInfoBuilder;
    }

    @Bean
    public Docket detalheApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.springdatajpa.halisonvitorino.academiadigital.controler"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.informacoesAPI().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));
        return docket;
    }
}

