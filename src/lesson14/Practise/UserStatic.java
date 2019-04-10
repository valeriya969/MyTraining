package lesson14.Practise;

public class UserStatic {
    private static String login, password;

    static class Query {

        public  void printToLog(){
            System.out.printf("User with login %s and password %s send a request.%n",login,password);
        }
    }
    public static void initialize(String login, String password) {
        UserStatic.login= login;
        UserStatic.password = password;
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        UserStatic.login = login;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserStatic.password = password;
    }

    public static void createQuery(){
        Query query = new Query();
        query.printToLog();
    }

    @Override
    public String toString() {
        return "UserStatic{}";
    }

    public static void main(String[] args) {
        initialize("1", "1");
        createQuery();

        UserStatic.Query query1 =new UserStatic.Query();
        query1.printToLog();

        Query query2 = new Query();
        query2.printToLog();
    }
}
