package com.example.demo.Controller;

import com.example.demo.dto.Member;
import com.example.demo.service.MembersService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MembersController {

    @Autowired
    private MembersService service;

    @GetMapping(path="/members")
    public List<Member> getAllMembers(){
       return service.getAllMembers();
    }
    @GetMapping(path="/members/{user_key}")
    public Member getMemberByKey(@PathVariable Integer user_key){
        return service.getMemberByKey(user_key);
    }
    @PostMapping(path="/members")
    public Member insertMember(@RequestBody Member member){
        service.insertMember(member);
        return member;
    }

    @DeleteMapping(path="/members/{user_key}")
    public Integer deleteMember(@PathVariable Integer user_key){
        return service.deleteMember(user_key);
    }

    @PutMapping(path="/members/{user_key}")
    public Member updateMember(@PathVariable Integer user_key, @RequestBody Member member){
        return service.updateMember(user_key, member);
    }
}
