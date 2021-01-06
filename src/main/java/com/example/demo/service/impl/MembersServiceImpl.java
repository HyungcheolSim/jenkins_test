package com.example.demo.service.impl;

import com.example.demo.dto.Member;
import com.example.demo.dto.MembersDAO;
import com.example.demo.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembersServiceImpl implements MembersService {

    @Autowired
    private MembersDAO membersDAO;

    @Override
    public List<Member> getAllMembers() {
        return membersDAO.getAllMembers();
    }

    @Override
    public Member getMemberByKey(Integer user_key) {
        return membersDAO.getMemberByKey(user_key);
    }

    @Override
    public void insertMember(Member member) {
        membersDAO.insertMember(member);
    }

    @Override
    public Member updateMember(Integer user_key, Member member){
        Member updatedMember= new Member();
        if(membersDAO.updateMember(user_key,member)==1){
            updatedMember.setUser_key(user_key);
            updatedMember.setUser_id(member.getUser_id());
            updatedMember.setUser_gender(member.getUser_gender());
            updatedMember.setUser_birthday(member.getUser_birthday());
            updatedMember.setUser_email(member.getUser_email());
            updatedMember.setUser_photo(member.getUser_photo());
            updatedMember.setUser_password(member.getUser_password());
            updatedMember.setUser_password_dt(member.getUser_password_dt());
            updatedMember.setUser_create_dt(member.getUser_create_dt());
            updatedMember.setUser_height(member.getUser_height());
            updatedMember.setUser_weight(member.getUser_weight());
            updatedMember.setUser_target_weight(member.getUser_target_weight());
            updatedMember.setUser_login_code(member.getUser_login_code());
            updatedMember.setUser_name(member.getUser_name());
            updatedMember.setUser_delete_yn(member.getUser_delete_yn());
            updatedMember.setUser_delete_dt(member.getUser_delete_dt());

        }
        return updatedMember;
    }

    @Override
    public Integer deleteMember(Integer user_key){
        return membersDAO.deleteMember(user_key);
    }
}
