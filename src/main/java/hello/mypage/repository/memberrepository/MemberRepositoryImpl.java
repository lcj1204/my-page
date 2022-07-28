package hello.mypage.repository.memberrepository;

import hello.mypage.domain.member.Member;

import java.util.List;
import java.util.Optional;

public class MemberRepositoryImpl implements MemberRepository{

    @Override
    public Member save(Member member) {
        return null;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByAlias(String alias) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
}
