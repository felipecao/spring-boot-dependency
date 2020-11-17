package com.github.felipecao.dependency;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

    @Override
    List<MenuItem> findAll();
}
