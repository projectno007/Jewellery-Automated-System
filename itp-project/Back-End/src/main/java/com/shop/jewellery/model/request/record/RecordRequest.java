package com.shop.jewellery.model.request.record;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link com.shop.jewellery.entity.Record}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecordRequest implements Serializable {
    private UUID id;
    private String loginTime;
    private String activityTime;
    private String activity;
    private UUID adminId;
}