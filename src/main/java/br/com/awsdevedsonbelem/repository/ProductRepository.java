package br.com.awsdevedsonbelem.repository;

import br.com.awsdevedsonbelem.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {

    Optional<Product> findByCode(String code);
}
