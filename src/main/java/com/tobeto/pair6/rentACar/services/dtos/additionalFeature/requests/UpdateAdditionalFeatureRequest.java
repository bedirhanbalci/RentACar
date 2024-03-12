package com.tobeto.pair6.rentACar.services.dtos.additionalFeature.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAdditionalFeatureRequest {

    @Positive(message = "Id must be a positive number!")
    private Integer id;

    @NotBlank(message = "Additional Feature name cannot be blank!")
    private String name;

    @NotBlank(message = "Detail cannot be blank!")
    private String detail;

    @Positive(message = "Daily Price must be a positive number!")
    private Double dailyPrice;

    @Positive(message = "Quantity must be a positive number!")
    private Integer quantity;

}
