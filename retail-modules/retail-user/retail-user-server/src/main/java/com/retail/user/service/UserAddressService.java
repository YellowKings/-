package com.retail.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.retail.user.domain.UserAddressEntity;


import java.util.List;
import java.util.Map;

/**
 * 收货地址表
 *
 * @author fengge
 * @email 1287137373@qq.com
 * @date 2023-03-22 18:26:56
 */
public interface UserAddressService extends IService<UserAddressEntity> {


    List<UserAddressEntity> selectUserAddressEntity(Long id);

    UserAddressEntity findById(Long id);

    void insert(UserAddressEntity params);

    void delete(Long id);

    void updateAddress(UserAddressEntity params);

    void upateStatus(Long id, Long userId);
}

