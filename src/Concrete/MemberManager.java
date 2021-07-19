package Concrete;

import Abstract.MemberCheckService;
import Abstract.MemberService;
import Entities.Member;

public class MemberManager implements MemberService{

    MemberCheckService memberCheckService;


    public MemberManager(MemberCheckService memberCheckService) {
        this.memberCheckService = memberCheckService;
    }


    @Override
    public void signUp(Member member) throws Exception {
        if (memberCheckService.CheckIfRealPerson(member)) {
            System.out.println("Üyeliğiniz tamamlandı : " + member.getMemberNickName());
        }else {
            throw new Exception("Kişisel bilgileriniz hatalı, kontrol ediniz : " + member.getMemberFirstName());
        }
    }

    @Override
    public void updateInformation(Member member) throws Exception {
        if (memberCheckService.CheckIfRealPerson(member)) {
            System.out.println("Bilgileriniz güncellendi : " + member.getMemberNickName());
        }else {
            throw new Exception("Üyelik bilgileriniz doğru değil, kontrol ediniz : " + member.getMemberNickName());
        }

    }

    @Override
    public void deleteMember(Member member) throws Exception {
        if (memberCheckService.CheckIfRealPerson(member)) {
            System.out.println("Üyeliğiniz silindi : " + member.getMemberNickName());

        }else {
            throw new Exception("Üyelik bilgileriniz doğru değil, kontrol ediniz : " + member.getMemberNickName());

        }

    }
}
