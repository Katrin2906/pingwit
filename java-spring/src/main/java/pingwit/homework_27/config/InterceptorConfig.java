package pingwit.homework_27.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pingwit.homework_27.interceptor.LoggerInterceptor;


@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    private final LoggerInterceptor loggerInterceptor;

    public InterceptorConfig(LoggerInterceptor loggerInterceptor) {
        this.loggerInterceptor = loggerInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loggerInterceptor);
    }
}
