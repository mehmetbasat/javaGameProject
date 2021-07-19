package Abstract;

import Entities.Member;

public interface MemberService {
    void signUp(Member member) throws Exception;
    void updateInformation(Member member) throws Exception;
    void deleteMember(Member member) throws Exception;
}
