package org.jpabook.datajpa.repository;

import org.jpabook.datajpa.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {
    List<Member> findMemberCustom();
}
