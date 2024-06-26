package cherhy.example.plugins.service

import cherhy.example.plugins.domain.Role
import cherhy.example.plugins.domain.UserId
import cherhy.example.plugins.repository.AuthorityRepository
import com.cherhy.common.annotation.ReadService

@ReadService
class ReadAuthorityService(
    private val authorityRepository: AuthorityRepository,
) {
    suspend fun get(userId: UserId) =
        authorityRepository.findByUserId(userId)
            .map { Role.valueOf(it.role) }
}