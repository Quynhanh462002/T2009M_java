package lab.s6;

public class Main {
    public static void main(String[] args){
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("Linh","0987654321");
        pb.insertPhone("Anh","098764789");
        pb.insertPhone("Hieu","0123456789");
        pb.insertPhone("Minh","0988999888");
        System.out.println("Danh sach ban dau:");
        pb.print();
        // sap xep
        pb.sort();
        System.out.println("Danh sach da sap xep:");
        pb.print();
    }
}