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
public class diemMAE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mid;
    
    private float mmark;
    
    private String mstatus;
    
    @ManyToOne
    @JoinColumn(name = "student")
    private Student student;
    
    public diemMAE(int mid, float mmark, Student student){
        this.mid = mid;
        this.mmark = mmark;
        this.student = student;
        if(mmark>=5) mstatus = "PASSED";
        else mstatus = "NOT PASSED";
    }
    
    public diemMAE(float mmark, Student student){
        this.mmark = mmark;
        this.student = student;
        if(mmark>=5) mstatus = "PASSED";
        else mstatus = "NOT PASSED";
    }
    
    public int getMid(){
        return mid;
    }
    
    public void setMid(int mid){
        this.mid = mid;
    }
    
    public float getMmark(){
        return mmark;
    }
    
    public void setMmark(float mmark){
        this.mmark = mmark;
        if(mmark >= 5){
    mstatus = "PASSED"; 
} else {
    mstatus = "NOT PASSED";
}
    }
    
    public String getMstatus(){
        return mstatus;
    }
    
    public Student getStudent(){
        return student;
    }
    
    public void setStudent(Student student){
        this.student = student;
    }
}
