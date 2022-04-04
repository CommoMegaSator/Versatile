package com.versatile;

import com.versatile.domain.dto.UserDTO;
import com.versatile.domain.entity.UserEntity;
import com.versatile.util.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class VersatileApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	void testMapper() {
		UserEntity userEntity = new UserEntity();
		userEntity.setNickname("Alphonse");

		UserDTO userDTO = userMapper.userEntityToDTO(userEntity);
		assertEquals(userEntity.getNickname(), userDTO.getNickname());
	}
}
