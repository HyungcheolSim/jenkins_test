package com.example.demo.service;


import com.example.demo.dto.Member;

import java.util.List;


public interface MembersService {
    List<Member> getAllMembers();
    Member getMemberByKey(Integer user_key);
    void insertMember(Member member);
    Integer deleteMember(Integer user_key);

    Member updateMember(Integer user_key, Member member);
}

