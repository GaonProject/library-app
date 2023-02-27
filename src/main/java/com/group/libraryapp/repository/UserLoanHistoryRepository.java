package com.group.libraryapp.repository;

import com.group.libraryapp.domain.UserLoanHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoanHistoryRepository extends JpaRepository<UserLoanHistory, Long> {
    //... where book_name = ? and is_return = 0
    boolean existsByBookNameAndIsReturn(String name, boolean isReturn);
}
