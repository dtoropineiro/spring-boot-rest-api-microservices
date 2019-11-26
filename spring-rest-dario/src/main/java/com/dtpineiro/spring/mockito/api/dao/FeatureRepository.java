package com.dtpineiro.spring.mockito.api.dao;

import com.dtpineiro.spring.mockito.api.model.Features;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureRepository extends JpaRepository<Features,Integer> {
}
