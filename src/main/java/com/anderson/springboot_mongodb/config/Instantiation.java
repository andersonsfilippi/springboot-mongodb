//package com.anderson.springboot_mongodb.config;
//
//import com.anderson.springboot_mongodb.domain.Post;
//import com.anderson.springboot_mongodb.domain.User;
//import com.anderson.springboot_mongodb.repository.PostRepository;
//import com.anderson.springboot_mongodb.repository.UserRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//
//import java.text.SimpleDateFormat;
//import java.util.Arrays;
//import java.util.TimeZone;
//
//
//@Configuration
//public class Instantiation implements CommandLineRunner {
//
//    private final UserRepository userRepository;
//    private final PostRepository postRepository;
//
//    public Instantiation(final UserRepository userRepository, final PostRepository postRepository) {
//        this.userRepository = userRepository;
//        this.postRepository = postRepository;
//    }
//
//    //
//    @Override
//    public void run(String... args) throws Exception {
//        User maria = new User(null, "Maria Brown", "maria@mail.com");
//        User alex = new User(null, "Alex Green", "alex@gmail.com");
//        User bob = new User(null, "Bob Grey", "bob@gmail.com");
//        userRepository.deleteAll();
//        userRepository.saveAll(Arrays.asList(maria, alex, bob));
//
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
//        Post post1 = new Post(null, sdf.parse("21/03/2018"),
//                "Partiu viagem", "Vou viajar para São Paulo. Abraços!", maria);
//        Post post2 = new Post(null, sdf.parse("21/03/2018"),
//                "Bom dia", "Acordei feliz hoje!", maria);
//        postRepository.deleteAll();
//        postRepository.saveAll(Arrays.asList(post1, post2));
//    }
//
//}
