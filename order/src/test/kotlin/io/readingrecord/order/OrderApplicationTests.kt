package io.readingrecord.order

import org.junit.jupiter.api.Test
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class OrderapplicationTests {

    @Test
    fun contextLoads(producerFactory: Producer, kafkaTemplate) {
    }

}
