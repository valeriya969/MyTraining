package lesson17.Practise;

public class UserCheck {
    public static void main(String[] args) {
            System.out.println(verify("rqwqwq","234","234"));
            System.out.println(verify("rqwq6556546455436dfgzhdfhdgfhwq","234","234"));
    }
    public static boolean verify(String login, String password, String confPassword) {
        try {
            if (login.length()>20){
                throw new WrongLoginException("Your login is more than 20 symbols");
            }
            if(password.length()>20||!password.equals(confPassword)) {
                throw new WrongPasswordException("Wrong password");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }finally {
            System.out.printf("Login %s, password %s, confirmPassword %s%n",login,password,confPassword);
        }
        return true;
    }
}
