package com.kushan.dea.entity.Users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SysUsers{

    @Id 
    @GeneratedValue( strategy=GenerationType.AUTO )
    private long UID;

    private int UniReg_ID;
    
    private String UniReg_Name;

    @Column(columnDefinition="tinyint(1) default 0")
    private boolean staff;

    public int getUniReg_ID() {
        return UniReg_ID;
    }

    public void setUniReg_ID(int uniReg_ID) {
        UniReg_ID = uniReg_ID;
    }

    public String getUniReg_Name() {
        return UniReg_Name;
    }

    public void setUniReg_Name(String uniReg_Name) {
        UniReg_Name = uniReg_Name;
    }

    public boolean isStaff() {
        return staff;
    }

    public void setStaff(boolean staff) {
        this.staff = staff;
    }
    


        
}