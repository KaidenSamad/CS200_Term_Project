package member;

import java.util.ArrayList;
import java.util.List;

public class MemberManagement {
    private final List<Member> members = new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public void editMember(int memberId, Member updatedMember) {
        for (Member member : members) {
            if (member.getId() == memberId) {
                member.setName(updatedMember.getName());
                System.out.println("Member updated: " + updatedMember.getName());
                return;
            }
        }
        System.out.println("Member not found.");
    }

    public void deleteMember(int memberId) {
        members.removeIf(member -> member.getId() == memberId);
        System.out.println("Member deleted.");
    }
}

