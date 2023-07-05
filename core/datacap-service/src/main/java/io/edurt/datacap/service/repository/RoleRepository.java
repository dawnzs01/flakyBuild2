package io.edurt.datacap.service.repository;

import io.edurt.datacap.service.entity.RoleEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface RoleRepository
        extends PagingAndSortingRepository<RoleEntity, Long>
{
    Optional<RoleEntity> findByName(String name);
}
