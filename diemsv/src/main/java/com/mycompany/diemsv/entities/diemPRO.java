/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diemsv.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author manhnche186093
 */
@Entity
public class diemPRO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    
    private float pmark;
    
    private String pstatus;
    
    @ManyToOne
    @JoinColumn(name = "student")
    private Student student;
    
    public diemPRO(int pid, float pmark, Student student){
        this.pid = pid;
        this.pmark = pmark;
        this.student = student;
        if(pmark>=5) pstatus = "PASSED";
        else pstatus = "NOT PASSED";
    }
    
    public diemPRO(float pmark, Student student){
        this.pmark = pmark;
        this.student = student;
        if(pmark>=5) pstatus = "PASSED";
        else pstatus = "NOT PASSED";
    }
    
    public int getPid(){
        return pid;
    }
    
    public void setPid(int pid){
        this.pid = pid;
    }
    
    public float getPmark(){
        return pmark;
    }
    
    public void setPmark(float pmark){
        this.pmark = pmark;
        if(pmark >= 5){
    pstatus = "PASSED"; 
} else {
    pstatus = "NOT PASSED";
}
    }
    
    public String getPstatus(){
        return pstatus;
    }
    
    public Student getStudent(){
        return student;
    }
    
    public void setStudent(Student student){
        this.student = student;
    }
    
}
