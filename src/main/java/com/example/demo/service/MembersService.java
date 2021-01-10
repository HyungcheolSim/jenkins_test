package com.example.demo.service;


import com.example.demo.dto.Member;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MembersService {
    List<Member> getAllMembers();
    Member getMemberByKey(Integer user_key);
    void insertMember(Member member);
    Integer deleteMember(Integer user_key);

    Member updateMember(Integer user_key, Member member);
}

