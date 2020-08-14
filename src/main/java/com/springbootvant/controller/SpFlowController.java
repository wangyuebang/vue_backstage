package com.springbootvant.controller;

import com.springbootvant.entity.SpFlow;
import com.springbootvant.repository.SpFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LiuJiang
 * @date 2020/8/14 12:43
 */
@RestController
@RequestMapping("SpFlow")
public class SpFlowController {

    @Autowired
    private SpFlowRepository spFlowRepository;

    @GetMapping("/findAll")
    public List<SpFlow> findAll(){
        return spFlowRepository.findAll();
    }
}
