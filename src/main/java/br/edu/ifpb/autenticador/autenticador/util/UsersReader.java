package br.edu.ifpb.autenticador.autenticador.util;

import br.edu.ifpb.autenticador.autenticador.domain.User;

import br.edu.ifpb.autenticador.autenticador.singleton.Singleton;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import static java.util.Arrays.asList;

// TODO - Transformar essa classe em um SINGLETON para guardar lista de usuários do arquivo,
//  ao invés de carregar do arquivo em cada chamada
public class UsersReader {

    private UsersReader() {}



    public static List<User> loadUsersFromJson() throws URISyntaxException, IOException {
        Singleton singleton;
        return singleton
    }

    Thread threadFoo = new Thread(new ThreadFoo());

    static class ThreadFoo implements Runnable {
        private static final String JSON_FILE = "users.json";

        @SneakyThrows
        @Override
        public void run() {
            ObjectMapper objectMapper = new ObjectMapper();
            User[] users = objectMapper.readValue(new File(ClassLoader.getSystemResource(JSON_FILE).toURI()), User[].class);
            Singleton singleton = Singleton.getInstance(asList(users));
            System.out.println(singleton.users);
        }
    }
}

