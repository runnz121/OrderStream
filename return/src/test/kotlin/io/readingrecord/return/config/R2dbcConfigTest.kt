package io.readingrecord.`return`.config

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.r2dbc.connection.R2dbcTransactionManager
import org.springframework.transaction.reactive.TransactionalOperator
import kotlin.test.assertNotNull

@SpringBootTest
class R2dbcConfigTest {

    @Autowired
    lateinit var transactionManager: R2dbcTransactionManager

    @Autowired
    lateinit var transactionalOperator: TransactionalOperator

    @Test
    fun `컨텍스트에 빈들이 등록된다`() {

        assertNotNull(transactionManager)
        assertNotNull(transactionalOperator)
    }
}
