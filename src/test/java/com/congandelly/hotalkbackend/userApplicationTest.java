package com.congandelly.hotalkbackend;

import static org.junit.jupiter.api.Assertions.*;

import javax.xml.crypto.Data;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.congandelly.hotalkbackend.mapper.user.UserMasterMapper;

@SpringBootTest
@RunWith(SpringRunner.class)
class userApplicationTest {
	
	@Autowired
	private UserMasterMapper userMasterMapper;
	
	@Test
	void 유저출력() {
		userMasterMapper.selectAll().forEach(data -> System.out.println(data));
	}

}
