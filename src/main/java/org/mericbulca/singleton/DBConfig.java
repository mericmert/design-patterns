package org.mericbulca.singleton;

/*
Singleton pattern is used to create an instance only once for a class.
 */
public class DBConfig {
    private static DBConfig db_config = null;

    private DBConfig(){
        System.out.println("Db is connected!");
    }
    public static DBConfig getConnection(){
        if (db_config == null){
            db_config = new DBConfig();
        }
        return db_config;
    }

}
