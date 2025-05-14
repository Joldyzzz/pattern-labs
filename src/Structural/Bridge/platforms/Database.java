package Structural.Bridge.platforms;

public interface Database {
    boolean hasUser(String userName);

    void queryData();
}
