package com.springbootvant.repository;

import com.springbootvant.entity.SpFlow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

/**
 * @author LiuJiang
 * @date 2020/8/14 11:23
 */
public interface SpFlowRepository extends JpaRepository<SpFlow,Integer> {

    @Query(name = "select  * from SpFlow where id = ?1")
    SpFlow findSpById(String id);

    @Modifying
    @Transactional
    @Query("delete from SpFlow es where es.id = ?1")
    int deleteBySpId(String id);
}
