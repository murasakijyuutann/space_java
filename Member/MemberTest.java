package Member;

public class MemberTest {
    public static void main(String[] args) {
        MemberDAO vocaloids = new MemberDAO();
        Member miku = new Member("Hatsune", "Miku");
        Member rin = new Member("Kagamine", "Rin");
        Member MEIKO = new Member("MEIKO", "");
        Member KAITO = new Member("KAITO", "");
        Member Len = new Member("Kagamine", "Len");
        Member Luka = new Member("Megurine", "Luka");

        vocaloids.addMember("01", miku);
        vocaloids.addMember("02", rin);
        vocaloids.addMember("03", MEIKO);
        vocaloids.addMember("04", KAITO);
        vocaloids.addMember("05", Len);
        vocaloids.addMember("06", Luka);

        lineSeparator();
        vocaloids.displayMembers();
        
        vocaloids.removeMember("01");
        vocaloids.removeMember("05");
        vocaloids.removeMember("06");

        lineSeparator();
        vocaloids.displayMembers();
        lineSeparator();
    }

    public static void lineSeparator(){
        System.out.println("-------------------------------------------------------------------");
    }
    
}
