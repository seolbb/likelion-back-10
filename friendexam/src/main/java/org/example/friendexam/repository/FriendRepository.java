package org.example.friendexam.repository;

import org.example.friendexam.domain.Friend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FriendRepository extends CrudRepository<Friend,Long>, PagingAndSortingRepository<Friend,Long> {
}
