package study.datajpa.repository;

import org.springframework.data.jpa.domain.Specification;
import study.datajpa.entity.Member;
import study.datajpa.entity.Team;

import javax.persistence.criteria.*;

public class MemberSpec {

//    public static Specification<Member> teamName(final String teamName) {
//        return (Specification<Member>)(root, query, bulider) -> {
//            Join<Member, Team> team = root.join("team", JoinType.INNER);
//            return builder.equal()
//
//        };
//    }
}
