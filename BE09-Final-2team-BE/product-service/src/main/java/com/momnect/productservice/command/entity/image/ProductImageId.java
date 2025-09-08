package com.momnect.productservice.command.entity.image;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductImageId implements Serializable {
    private Long productId;
    private Long imageFileId;
}