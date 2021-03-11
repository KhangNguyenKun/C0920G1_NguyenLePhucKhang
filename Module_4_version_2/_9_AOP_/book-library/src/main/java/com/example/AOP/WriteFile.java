package com.example.AOP;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Aspect
public class WriteFile {
    public static String name;
    @AfterReturning(pointcut = "execution(public * com.example.controller.BookController.showCreate(*))")
    public void afterCreateBook() throws IOException {
        FileWriter fileWriter = new FileWriter("E:\\C0920G1_NguyenLePhucKhang\\Module_4_version_2\\_9_AOP_\\book-library\\src\\main\\resources\\static\\history.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Add new book successful: " + name);
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
    @AfterReturning(pointcut = "execution(public * com.example.controller.CustomerController.borrowed(*))")
    public void afterBorrowBook() throws IOException {
        FileWriter fileWriter = new FileWriter("E:\\C0920G1_NguyenLePhucKhang\\Module_4_version_2\\_9_AOP_\\book-library\\src\\main\\resources\\static\\history.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Borrow a book successful: " + name);
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
