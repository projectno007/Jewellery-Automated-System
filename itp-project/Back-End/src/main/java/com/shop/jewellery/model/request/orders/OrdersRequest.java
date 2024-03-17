package com.shop.jewellery.model.request.orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

/**
 * DTO for {@link com.shop.jewellery.entity.Orders}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersRequest implements Serializable {
    private UUID id;
    private String recipe;
    private UUID deliveryId;
    private String deliveryAddress;
    private String deliveryCity;
    private String deliveryRequestedTime;
    private String deliveryDeliveredTime;
    private String deliveryStatus;
    private String deliveryDistance;
    private String deliveryProvince;
    private String deliveryPhoneNumber;
    private String deliveryDistrict;
    private UUID paymentId;
    private Double paymentAmount;
    private String paymentPaymentStatus;
    private LocalDate paymentPaymentDate;
    private UUID sellableId;
    private String sellableName;
    private String sellableMaterial;
    private String sellableImage_url;
    private Double sellableSupplyPrice;
    private UUID sellableSupplierId;
    private String sellableSupplierName;
    private String sellableSupplierAddress;
    private String sellableSupplierCompanyName;
    private String sellableSupplierTelephone;
    private String sellableSupplierStatus;
    private String sellableSupplierCategory;
    private String sellableSupplierEmail;
    private double sellableSellPrice;
    private UUID sellableCustomerId;
    private String sellableCustomerName;
    private String sellableCustomerFirstName;
    private String sellableCustomerLastName;
    private String sellableCustomerTelephone;
    private String sellableCustomerAddress;
    private String sellableCustomerNIC;
}