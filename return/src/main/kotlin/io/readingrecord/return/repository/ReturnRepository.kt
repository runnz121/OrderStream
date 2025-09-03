package io.readingrecord.`return`.repository

import io.readingrecord.`return`.model.Return
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ReturnRepository : ReactiveCrudRepository<Return, Long> {

}
