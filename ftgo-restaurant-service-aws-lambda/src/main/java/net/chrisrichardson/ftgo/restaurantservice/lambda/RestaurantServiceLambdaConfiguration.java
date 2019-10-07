package net.chrisrichardson.ftgo.restaurantservice.lambda;

import io.eventuate.tram.messaging.common.spring.TramMessagingCommonAutoConfiguration;
import io.eventuate.tram.messaging.producer.jdbc.spring.TramMessageProducerJdbcConfiguration;
import net.chrisrichardson.ftgo.restaurantservice.domain.RestaurantServiceDomainConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({RestaurantServiceDomainConfiguration.class, TramMessageProducerJdbcConfiguration.class, TramMessagingCommonAutoConfiguration.class})
@EnableAutoConfiguration
public class RestaurantServiceLambdaConfiguration {
}
