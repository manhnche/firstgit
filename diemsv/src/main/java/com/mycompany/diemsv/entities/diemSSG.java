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
public class diemSSG {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
    
    private float smark;
    
    private String sstatus;
    
    @ManyToOne
    @JoinColumn(name = "student")
    private Student student;
    
    public diemSSG(int sid, float smark, Student student){
        this.sid = sid;
        this.smark = smark;
        this.student = student;
        if(smark>=5) sstatus = "PASSED";
        else sstatus = "NOT PASSED";
    }
    
    public diemSSG(float smark, Student student){
        this.smark = smark;
        this.student = student;
        if(smark>=5) sstatus = "PASSED";
        else sstatus = "NOT PASSED";
    }
    
    public int getSid(){
        return sid;
    }
    
    public void setSid(int sid){
        this.sid = sid;
    }
    
    public float getSmark(){
        return smark;
    }
    
    public void setSmark(float smark){
        this.smark = smark;
        if(smark >= 5){
    sstatus = "PASSED"; 
} else {
    sstatus = "NOT PASSED";
}
    }
    
    public String getSstatus(){
        return sstatus;
    }
    
    public Student getStudent(){
        return student;
    }
    
    public void setStudent(Student student){
        this.student = student;
    }
}
