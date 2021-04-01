package com.kushan.dea.Repository;

import com.kushan.dea.entity.Users.SysUsers;

import org.springframework.data.repository.CrudRepository;

public interface AddSysUser extends CrudRepository<SysUsers, Long>{
    //making a  find user by their Uni registration ID
    SysUsers findByUniReg_ID(int UniReg_ID);
}
