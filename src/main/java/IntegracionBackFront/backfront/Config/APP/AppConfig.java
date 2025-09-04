package IntegracionBackFront.backfront.Config.APP;

import IntegracionBackFront.backfront.Utils.JWTUtils;
import IntegracionBackFront.backfront.Utils.JwtCookieAuthFilter;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    public JwtCookieAuthFilter jtwCookieAuthFilter(JWTUtils jwtUtils){
        return new JwtCookieAuthFilter(jwtUtils);
    }
}
