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
public class diemCSI {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    
    private float cmark;
    
    private String cstatus;
    
    @ManyToOne
    @JoinColumn(name = "student")
    private Student student;
    
    public diemCSI(int cid, float cmark, Student student){
        this.cid = cid;
        this.cmark = cmark;
        this.student = student;
        if(cmark>=5) cstatus = "PASSED";
        else cstatus = "NOT PASSED";
    }
    
    public diemCSI(float cmark, Student student){
        this.cmark = cmark;
        this.student = student;
        if(cmark>=5) cstatus = "PASSED";
        else cstatus = "NOT PASSED";
    }
    
    public int getCid(){
        return cid;
    }
    
    public void setCid(int cid){
        this.cid = cid;
    }
    
    public float getCmark(){
        return cmark;
    }
    
    public void setCmark(float cmark){
        this.cmark = cmark;
        if(cmark >= 5){
    cstatus = "PASSED"; 
} else {
    cstatus = "NOT PASSED";
}
    }
    
    public String getCstatus(){
        return cstatus;
    }
    
    public Student getStudent(){
        return student;
    }
    
    public void setStudent(Student student){
        this.student = student;
    }
}
