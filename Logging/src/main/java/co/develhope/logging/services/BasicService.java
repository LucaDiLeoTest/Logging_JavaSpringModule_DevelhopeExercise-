package co.develhope.logging.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    @Value("${customEnvs.envValue1}")
    private Integer envValue1;

    @Value("${customEnvs.envValue2}")
    private Integer envValue2;

    Logger logger = LoggerFactory.getLogger(BasicService.class);

    public Integer calculateExponent(){
        logger.debug("Start exponent's calculation");
        Integer exponent= (int) Math.pow(envValue1, envValue2);
        logger.debug("End exponent's calculation");
        return exponent;
    }
}
