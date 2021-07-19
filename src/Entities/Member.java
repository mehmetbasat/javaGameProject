package Entities;

import Abstract.Entity;

public class Member implements Entity {


    private int memberId;
    private String memberNickName;
    private String memberFirstName;
    private String memberLastName;
    private String memberNationalityId;
    private int memberBirthYear;
    private String memberMail;


    public Member(int memberId,String memberNickName , String memberFirstName, String memberLastName, String memberNationalityId, int memberBirthYear, String memberMail) {
        this.memberId = memberId;
        this.memberNickName = memberNickName;
        this.memberFirstName = memberFirstName;
        this.memberLastName = memberLastName;
        this.memberNationalityId = memberNationalityId;
        this.memberBirthYear = memberBirthYear;
        this.memberMail = memberMail;
    }
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    public String getMemberFirstName() {
        return memberFirstName;
    }

    public void setMemberFirstName(String memberFirstName) {
        this.memberFirstName = memberFirstName;
    }

    public String getMemberLastName() {
        return memberLastName;
    }

    public void setMemberLastName(String memberLastName) {
        this.memberLastName = memberLastName;
    }

    public String getMemberNationalityId() {
        return memberNationalityId;
    }

    public void setMemberNationalityId(String memberNationalityId) {
        this.memberNationalityId = memberNationalityId;
    }

    public int getMemberBirthYear() {
        return memberBirthYear;
    }

    public void setMemberBirthYear(int memberBirthYear) {
        this.memberBirthYear = memberBirthYear;
    }

    public String getMemberMail() {
        return memberMail;
    }

    public void setMemberMail(String memberMail) {
        this.memberMail = memberMail;
    }

}
