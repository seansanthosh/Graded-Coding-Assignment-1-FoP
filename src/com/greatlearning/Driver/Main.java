package com.greatlearning.Driver;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HRDepartment;
import com.greatlearning.model.TechDepartment;

import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        HRDepartment hr = new HRDepartment();
        TechDepartment tech = new TechDepartment();
        AdminDepartment adm = new AdminDepartment();
        System.out.println("Welcome to "+ adm.departmentName()+"\n"+adm.getTodaysWork()+"\n"+adm.getWorkDeadline()+"\n"+adm.isTodayAHoliday());
        System.out.println();

        System.out.println("Welcome to "+ hr.departmentName()+"\n"+hr.doActivity()+"\n"+hr.getTodaysWork()+"\n"+hr.getWorkDeadline()+"\n"+hr.isTodayAHoliday());
        System.out.println();

        System.out.println("Welcome to "+tech.departmentName()+"\n"+tech.getTodaysWork()+"\n"+tech.getWorkDeadline()+"\n"+tech.getTechStackInformation()+"\n"+tech.isTodayAHoliday());
        System.out.println();
    }


}
