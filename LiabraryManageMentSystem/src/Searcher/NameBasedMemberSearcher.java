package Searcher;

import User.Member;

import java.util.List;

public class NameBasedMemberSearcher implements MemberSearcher{

    private final String memerName;

    public NameBasedMemberSearcher(String memberName) {
        this.memerName = memberName;
    }

    @Override
    public List<Member> search() {
        return null;
    }
}
