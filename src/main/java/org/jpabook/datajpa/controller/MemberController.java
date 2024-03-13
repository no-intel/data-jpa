package org.jpabook.datajpa.controller;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.jpabook.datajpa.entity.Member;
import org.jpabook.datajpa.repository.MemberRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    @PostConstruct
    public void init() {
        memberRepository.save(new Member("userA"));
    }

    @GetMapping("/members/{id}")
    public String findMember(@PathVariable("id") Long id) {
        return memberRepository.findById(id).get().getUsername();
    }


    @GetMapping("/members2/{id}")
    public String findMember2(@PathVariable("id") Member member) {
        return member.getUsername();
    }

}
