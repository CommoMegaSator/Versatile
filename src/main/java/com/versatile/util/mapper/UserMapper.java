package com.versatile.util.mapper;

import com.versatile.domain.dto.UserDTO;
import com.versatile.domain.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserEntity userDtoToEntity(UserDTO user);
    UserDTO userEntityToDTO(UserEntity user);
}
