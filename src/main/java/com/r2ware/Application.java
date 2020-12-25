package com.r2ware;

import com.r2ware.entity.Member;
import com.r2ware.type.SEX;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.nio.charset.StandardCharsets;

public class Application {
    public static void main(String[] args) {

        // EntityManagerFactory has to be used only once in the Application
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        // EntityManger has to be shared another place.
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            Member member = new Member();
            member.setId(101L);
            member.setName("Jae Sung");
            member.setContent("Hello");
            member.setIamge(new String("GOODI").getBytes(StandardCharsets.UTF_8));
            member.setSex(SEX.MAN);

            em.persist(member);

            tx.commit();
        } catch(Exception e) {
            tx.rollback();
        } finally {
            emf.close();
            emf.close();
        }



        System.out.println("Hello World!");
    }
}
