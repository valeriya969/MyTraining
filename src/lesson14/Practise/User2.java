package lesson14.Practise;

import java.util.Objects;

public class User2 {
        private String login, password;

        public User2(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void createQuery(String name){
            class Query {
                public void printToLog(){
                    System.out.printf("User with login %s and password %s send a request %s %n",login,password,name);
                }
            }
            Query query = new Query();
            query.printToLog();
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User2 user2 = (User2) o;
        return Objects.equals(login, user2.login) &&
                Objects.equals(password, user2.password);
    }

        @Override
        public String toString() {
            return "User{" +
                    "login='" + login + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }

        public static void main(String[] args) {
           lesson14.Practise.User2 user = new lesson14.Practise.User2("1", "1");
            user.createQuery("request1");
        }
    }

