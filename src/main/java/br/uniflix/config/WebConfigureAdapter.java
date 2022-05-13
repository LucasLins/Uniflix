package br.uniflix.config;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

<<<<<<< HEAD
import javax.validation.constraints.NotNull;

=======
>>>>>>> main
@EnableWebMvc
public class WebConfigureAdapter implements WebMvcConfigurer {

    @Override
<<<<<<< HEAD
    public void addResourceHandlers(@NotNull ResourceHandlerRegistry registry) {
=======
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
>>>>>>> main
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> main
