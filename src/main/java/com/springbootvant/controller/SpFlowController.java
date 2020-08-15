package com.springbootvant.controller;

import com.springbootvant.entity.SpFlow;
import com.springbootvant.repository.SpFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.UUID;

/**
 * @author LiuJiang
 * @date 2020/8/14 12:43
 */
@RestController
@RequestMapping("SpFlow")
public class SpFlowController {

    @Autowired
    private SpFlowRepository spFlowRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<SpFlow> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest pageable = PageRequest.of(page-1,size);
        return spFlowRepository.findAll(pageable);
    }

    public String uuid(){
        String uuid = UUID.randomUUID().toString();	//获取UUID并转化为String对象
        uuid = uuid.replace("-", "");//因为UUID本身为32位只是生成时多了“-”，所以将它们去点就可
        return uuid;
    }
    @PostMapping("/save")
    public String save(@RequestBody SpFlow spFlow){
        spFlow.setId(uuid());
        SpFlow result = spFlowRepository.save(spFlow);
        if(result != null){
            return "success";
        }else {
            return "error";
        }

    }

    @GetMapping("/findSpById/{id}")
    public SpFlow findSpById(@PathVariable("id") String id){
        return spFlowRepository.findSpById(id);
    }

    @PutMapping("/update")
    public String update(@RequestBody SpFlow spFlow){
        SpFlow result = spFlowRepository.save(spFlow);
        if(result != null){
            return "success";
        }else {
            return "error";
        }
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") String id){
        spFlowRepository.deleteBySpId(id);
    }

}
