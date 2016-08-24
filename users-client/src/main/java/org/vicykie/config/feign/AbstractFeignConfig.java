package org.vicykie.config.feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * Created by 李朝衡 on 2016/8/22.
 */
public class AbstractFeignConfig {
    @Bean
    public Logger.Level feignLogger(){
        return Logger.Level.FULL;
    }

}
