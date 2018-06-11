package com.qn.wechat.dao;

import com.qn.wechat.dao.entity.SysConfig;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface   SysConfigDao extends JpaRepository<SysConfig,Integer> {

    List<SysConfig> selectByCode(@Param("code")String code);
}