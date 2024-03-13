package org.jpabook.datajpa.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.jpabook.datajpa.entity.Member;

import java.util.List;

@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom {

    private final EntityManager em;

    @Override
    public List<Member> findMemberCustom() {
        return em.createQuery("SELECT m FROM Member m", Member.class)
                .getResultList();
    }
}
