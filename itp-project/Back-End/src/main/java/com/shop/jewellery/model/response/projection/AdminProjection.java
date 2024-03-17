package com.shop.jewellery.model.response.projection;

/**
 * Projection for {@link com.shop.jewellery.entity.Admin}
 */
public interface AdminProjection {
    String getPosition();

    String getNIC();

    String getFname();

    String getlName();

    String getActive();

    String getPassword();

    String getRoles();

    String getUname();
}