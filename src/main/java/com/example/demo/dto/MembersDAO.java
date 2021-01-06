package com.example.demo.dto;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MembersDAO {
    List<Member> getAllMembers();

    Member getMemberByKey(Integer user_key);

    void insertMember(Member member);

    Integer deleteMember(Integer user_key);

    Integer updateMember(@Param("user_key") Integer user_key, @Param("s_user")Member member);
}
