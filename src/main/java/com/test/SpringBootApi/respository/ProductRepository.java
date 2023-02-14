package com.test.SpringBootApi.respository;

import com.test.SpringBootApi.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// 여기서 데이터베이스에 정보를 전달해서 변경 작성등의 일련의 처리를 담당함.
@Repository
public interface ProductRepository extends JpaRepository <Product, Long> {


}
