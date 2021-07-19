package Adapters;

import Abstract.MemberCheckService;
import Entities.Member;
import Mernis.COSKPSPublicSoap;

public class MernisServiceAdapter implements MemberCheckService {
    @Override
    public boolean CheckIfRealPerson(Member member) throws Exception {
        COSKPSPublicSoap soap = new COSKPSPublicSoap();
        return soap.TCKimlikNoDogrula(Long.parseLong(member.getMemberNationalityId()),member.getMemberFirstName(), member.getMemberLastName(), member.getMemberBirthYear());
    }
}
