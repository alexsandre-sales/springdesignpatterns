package designprojetos.configswagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI api() {
    return new OpenAPI()
            .info(new Info()
                    .title("Api Design Patterns")
                    .description("Implementação de alguns patterns" +
                            "(Singleton/Strategy/Facade)")
                    .version("V1.0")
            );
  }
}
