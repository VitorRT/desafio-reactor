package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;

import java.util.List;

public class Question2 {

    /*
    Recebe uma lista de usuários e retorna a quantos usuários admin tem na lista
     */
    public Mono<Long> countAdmins(final List<User> users){
        return Mono
            .just(users)
            .map(list -> {
                var admins = list.stream().filter(u -> u.isAdmin() == true).toArray();
                return Long.valueOf(admins.length);
            });
    }

}
