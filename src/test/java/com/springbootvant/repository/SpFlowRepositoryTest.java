package com.springbootvant.repository;

import com.springbootvant.entity.SpFlow;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

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

    @Test
    void spFlow(){
        String uuid = UUID.randomUUID().toString();	//获取UUID并转化为String对象
        uuid = uuid.replace("-", "");//因为UUID本身为32位只是生成时多了“-”，所以将它们去点就可
        System.out.println(uuid);
        SpFlow sp = new SpFlow();
        sp.setId(uuid);
        sp.setName("测试爬虫");
        SpFlow spFlow = spFlowRepository.save(sp);
        System.out.println(spFlow);
    }

    @Test
    void findById(){
        SpFlow spFlow = spFlowRepository.findSpById("a6d165416e5e441486e552fed1f5a5fe");
        System.out.println(spFlow);

    }

    @Test
    void update(){
        SpFlow spFlow = new SpFlow();
        spFlow.setId("a6d165416e5e441486e552fed1f5a5fe");
        spFlow.setName("房产局爬虫");
        SpFlow spFlow1 = spFlowRepository.save(spFlow);
        System.out.println(spFlow1);
    }

    @Test
    void delete(){
        spFlowRepository.deleteBySpId("a6d165416e5e441486e552fed1f5a5fe");
    }
}