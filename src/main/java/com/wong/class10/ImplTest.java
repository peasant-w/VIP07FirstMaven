package com.wong.class10;

/**
 * @author wong
 * @date Created in 2020/8/3 21:38
 * @Description: 接口测试类
 * @Version 1.0
 */
public class ImplTest {
    public static void main(String[] args) {
        EmployerImpl emp = new EmployerImpl();
        Employer.drink();
        String test = emp.moYu(3);
        emp.work();
        System.out.println("心情很"+test);
    }
}
