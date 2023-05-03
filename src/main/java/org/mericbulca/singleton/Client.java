package org.mericbulca.singleton;

public class Client {
    public static void main(String[] args) {
        DBConfig dbConfig = DBConfig.getConnection();
        System.out.println(dbConfig.hashCode());
        DBConfig dbConfig1 = DBConfig.getConnection();
        System.out.println(dbConfig1.hashCode());
    }
}
