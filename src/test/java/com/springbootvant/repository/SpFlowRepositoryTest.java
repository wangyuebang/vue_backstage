package com.springbootvant.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author LiuJiang
 * @date 2020/8/14 11:40
 */
@SpringBootTest
class SpFlowRepositoryTest {

    @Autowired
    private SpFlowRepository spFlowRepository;

    @Test
    void findAll(){
        System.out.println(spFlowRepository.findAll());
    }

}