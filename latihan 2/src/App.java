import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> hewan = new LinkedList<String>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        LinkedList<String> deleteHewan = new LinkedList<String>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");

        System.out.println("Data nama hewan awal:");System.out.println(hewan);

        for (int i = 0; i < deleteHewan.size(); i++) {
            hewan.remove(deleteHewan.get(i));
        }

        System.out.println("\nData nama hewan yang dihapus:");System.out.println(deleteHewan);

        System.out.println("\nOutput nama hewan:");System.out.println(hewan);
    }
}