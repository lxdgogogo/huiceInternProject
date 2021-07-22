package com.hc.summer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 用户数据
 *
 * @author wendiyou
 * @date 2021-01-21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UserDO {

    private Long userId;

    private String userName;

    private Byte roleType;
    private Long roleId;
}

