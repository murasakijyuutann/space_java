package Member;

import java.util.HashMap;

public class MemberDAO {
    HashMap<String, Member> member = new HashMap<>();

    public void addMember(String id, Member members) {
        member.put(id, members);
    }
    
    public void removeMember(String id) {
        member.remove(id);
    }

    public void displayMembers() {
        for (Member members : member.values()) {
            System.out.println(members.getFullName());
        }
    }

    
    
}
