package lab.s3;

public class Main {
    public static void main(String[] args){
        Room r = new Room();
        r.setName("Phong so 2");
        r.setPosition("Tang 2");
        r.addUser("Dương Quỳnh Anh");
        r.addUser("Nguyễn Thị Linh ");
        r.addUser("Đỗ Thanh Ngọc");
        r.removeUser(2);
        for(String s: r.users){ // foreach
            System.out.println(s);
        }

    }
}