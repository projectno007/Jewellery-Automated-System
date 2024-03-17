package com.shop.jewellery.model.request.category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryRequest {
    String categoryName;
    String categoryDesc;
    String categoryCommonImageUrl;
}
