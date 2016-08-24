package org.vicykie.config.feign;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 李朝衡 on 2016/8/22.
 */
@Configuration
public class FeignConfig extends AbstractFeignConfig {
    @Bean
    public ErrorDecoder errorDecoder(){
        ErrorDecoder errorDecoder = new ErrorDecoder.Default();

        return errorDecoder;
    }

}
