package com.tobeto.pair6.rentACar.services.rules;

import com.tobeto.pair6.rentACar.core.utilities.exceptions.BusinessException;
import com.tobeto.pair6.rentACar.repositories.AdditionalFeatureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdditionalFeatureBusinessRules {

    private final AdditionalFeatureRepository additionalFeatureRepository;

    public void checkIfAdditionalFeatureByIdExists(Integer id) {
        if (!this.additionalFeatureRepository.existsById(id)) {
            throw new BusinessException("Verilen Additional Feature Id ile sistemde bir Additional Feature olmalıdır!");
        }
    }

}
