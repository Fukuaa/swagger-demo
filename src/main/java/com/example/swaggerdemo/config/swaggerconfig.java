package com.example.swaggerdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class swaggerconfig {


    //配置swagger的docket bean实例
    @Bean
    public Docket docket(Environment environment){
        return new Docket(DocumentationType.SWAGGER_2)
                /*.apiInfo(apiInfo())*/;
        //获取项目的环境
        /*Profiles profile = Profiles.of("dev","text");
        environment.acceptsProfiles(profile);*/
    }

    //配置swagger的信息=apiInfo
    /*private ApiInfo apiInfo(){
        return new ApiInfo(
                "zqf",
                "",
                "",
                "",
                "",
                "",
                ""
        );
    }*/
}
