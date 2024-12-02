package com.example.demo3.Repository;

import com.example.demo3.Models.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {
    List<Provider> findByCompany(String company);
    List<Provider> findByService(String service);
}
