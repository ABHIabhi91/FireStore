package com.aptkode.example.firestore;

import reactor.core.publisher.Flux;

import org.springframework.cloud.gcp.data.firestore.FirestoreReactiveRepository;

/**
 * Demonstrates Spring Data Repository support in Firestore.
 *
 * @author Daniel Zou
 */
public interface UserRepository extends FirestoreReactiveRepository<User> {

	Flux<User> findByAge(int age);
}
