package br.com.tonsoft;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
    public static void main(String[] args) {
        String p1 = "$2a$10$RKSvK9hn017oP9Qk0GV6/OjSBrf0M8G00BsP7ZKUf6PIbmmW49gHu";
        String p2 = "$2a$10$y39Dl8XWD64CMW4ACAW9NeLioyCnT0A7yGvIzB0v.b2i2QqirJTBa";

        BCryptPasswordEncoder pass = new BCryptPasswordEncoder();
        System.out.println(pass.encode("devdojo"));;

        System.out.println(p1.matches(pass.encode("devdojo")));
    }
}
