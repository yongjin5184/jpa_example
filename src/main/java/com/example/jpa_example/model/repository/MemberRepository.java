package com.example.jpa_example.model.repository;

import com.example.jpa_example.model.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
