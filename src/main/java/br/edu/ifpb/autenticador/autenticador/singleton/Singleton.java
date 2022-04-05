package br.edu.ifpb.autenticador.autenticador.singleton;

import br.edu.ifpb.autenticador.autenticador.domain.User;

import java.util.List;

public final class Singleton {

    private static volatile Singleton instance;

    public List<User> users;

    private Singleton(List<User> users) {
        this.users = users;
    }

    public static Singleton getInstance(List<User> users) {

        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(users);
            }
            return instance;
        }
    }
}