package com.didwlsdbs.dockerTest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepository{
    private final EntityManager em;

    @Override
    public List findAll() {
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }
}
