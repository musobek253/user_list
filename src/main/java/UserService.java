import java.util.ArrayList;
import java.util.List;

class UserService{
    static List<User> userList = new ArrayList<>();

    public static List<User> getUser(){
        return userList;
        }
    public static void setUser(User user){
        userList.add(user);
        }
}