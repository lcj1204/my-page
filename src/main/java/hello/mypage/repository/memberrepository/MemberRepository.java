package hello.mypage.repository.memberrepository;

import hello.mypage.domain.member.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);

    Optional<Member> findById(Long id);

    Optional<Member> findByAlias(String alias);

    Optional<Member> findByEmail(String email);

    List<Member> findAll();
}
