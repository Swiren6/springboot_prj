package com.example.demo3.Services;


import com.example.demo3.Models.Provider;
import com.example.demo3.Repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderService {

    private final ProviderRepository providerRepository;

    @Autowired
    public ProviderService(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    public Provider createProvider(Provider provider) {
        return providerRepository.save(provider);
    }

    public List<Provider> getAllProviders() {
        return providerRepository.findAll();
    }

    public Optional<Provider> getProviderById(Long id) {
        return providerRepository.findById(id);
    }
    public Provider updateProvider(Provider provider) {
        return providerRepository.save(provider);
    }
    public void deleteProvider(Provider provider) {
        providerRepository.delete(provider);
    }
}
