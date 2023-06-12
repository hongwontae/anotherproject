package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 일반 메서드
    Optional<Member> findById(Long id); // optional 널 값 받는 용도
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
