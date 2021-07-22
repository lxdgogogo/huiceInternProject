-- 用户表
CREATE TABLE `sys_user`
(
    `id`                bigint(20) unsigned NOT NULL AUTO_INCREMENT,
    `user_name`         varchar(50)         NOT NULL DEFAULT '' COMMENT '用户姓名|文弟友|2021-01-18',
    `user_phone`        varchar(13)         NOT NULL DEFAULT '' COMMENT '用户手机号|文弟友|2021-01-18',
    `password`          varchar(255)        NOT NULL COMMENT '登录密码|文弟友|2021-01-18',
    `salt`              varchar(255)        NOT NULL COMMENT '密码加盐hash值|文弟友|2021-01-18',
    `user_pid`          bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '员工上级ID|文弟友|2021-01-18',
    `delete_flag`       tinyint(3) unsigned          DEFAULT '0' COMMENT '删除符号|@0：未删除；@1：有删除|文弟友|2021-01-18',
    `created`           timestamp           NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `modified`          timestamp           NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
    UNIQUE KEY `user_phone` (`user_phone`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

-- 角色表
CREATE TABLE `sys_role`
(
    `id`        bigint(20) unsigned NOT NULL AUTO_INCREMENT,
    `role_name` varchar(20)         NOT NULL COMMENT '角色名|文弟友|2021-01-27',
    `type`      tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '角色类型|@0：发得快账号；@1：代拿账号|文弟友|2021-01-27',
    `created`   timestamp           NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间|文弟友|2021-01-27',
    `modified`  timestamp           NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间|文弟友|2021-01-27',
    PRIMARY KEY (`id`),
    UNIQUE KEY `role_name` (`role_name`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

-- 菜单表
CREATE TABLE `sys_function`
(
    `id`             bigint(20) unsigned NOT NULL AUTO_INCREMENT,
    `parent_id`      bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '父级ID|文弟友|2021-01-18',
    `function_url`   varchar(50)         NOT NULL DEFAULT '' COMMENT '功能地址|文弟友|2021-01-18',
    `function_icon`  varchar(50)         NOT NULL DEFAULT '' COMMENT '功能图标|文弟友|2021-01-18',
    `function_name`  varchar(50)         NOT NULL DEFAULT '' COMMENT '功能名|文弟友|2021-01-18',
    `function_level` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '功能层级|文弟友|2021-01-18',
    `sort`           tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '排序字段|文弟友|2021-01-18',
    `remark`         varchar(255)        NOT NULL DEFAULT '' COMMENT '备注|文弟友|2021-01-18',
    `created`        timestamp           NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `modified`       timestamp           NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

-- 角色菜单表
CREATE TABLE `sys_role_function`
(
    `id`          bigint(20) unsigned NOT NULL AUTO_INCREMENT,
    `role_id`     bigint(20) unsigned NOT NULL COMMENT '角色ID|文弟友|2021-01-18',
    `function_id` bigint(20) unsigned NOT NULL COMMENT '菜单ID|文弟友|2021-01-18',
    `modified`    timestamp           NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
    UNIQUE KEY `role_id` (`role_id`, `function_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

-- 用户角色表
CREATE TABLE `sys_user_role`
(
    `id`       bigint(20) unsigned NOT NULL AUTO_INCREMENT,
    `user_id`  bigint(20) unsigned NOT NULL COMMENT '用户ID|文弟友|2021-01-18',
    `role_id`  bigint(20) unsigned NOT NULL COMMENT '角色ID|文弟友|2021-01-18',
    `modified` timestamp           NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
    UNIQUE KEY `user_id` (`user_id`, `role_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;


CREATE TABLE `platform_sku` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '自增ID|牛振宇|2020-11-24',
  `merchant_id` bigint NOT NULL DEFAULT '0' COMMENT '商户id|牛振宇|2020-11-03',
  `sale_status` tinyint DEFAULT NULL COMMENT '在售状态｜ @1：在架 @2：下架 @3：店铺已删除 @4：自建默认显示 "/" | 魏柯 | 2020-12-10',
  `platform_id` int NOT NULL DEFAULT '0' COMMENT '平台id|牛振宇|2020-12-10',
  `platform_name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '平台名称|牛振宇|2020-11-10',
  `shop_id` bigint NOT NULL DEFAULT '0' COMMENT '店铺id|牛振宇|2020-11-03',
  `goods_id` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '平台货品id|牛振宇|2020-11-03',
  `goods_name` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '平台货品名称|牛振宇|2020-11-03',
  `sku_id` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '平台skuid|牛振宇|2020-11-03',
  `sku_code` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '平台规格码|牛振宇|2020-11-03',
  `sku_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '平台规格名|牛振宇|2020-11-03',
  `sku_properties` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '平台sku属性串,如 1627207:3232483;1630696:3284570|牛振宇|2020-11-03',
  `outer_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '商家编码(spu维度)|牛振宇|2020-11-10',
  `sku_outer_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '规格商家编码(sku维度)|牛振宇|2020-11-10',
  `cid` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '平台类目|牛振宇|2020-11-03',
  `price` decimal(19,4) NOT NULL DEFAULT '0.0000' COMMENT '平台售价，开启库存同步才准确|牛振宇|2020-11-03',
  `stock_num` decimal(19,4) NOT NULL DEFAULT '0.0000' COMMENT '平台库存量，只有开启库存同步的货品才准确|牛振宇|2020-11-03',
  `img_url` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '图片url|牛振宇|2020-11-03',
  `barcode` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '平台上的条码,多个条码用逗号分隔|牛振宇|2020-11-03',
  `hold_stock_type` tinyint NOT NULL DEFAULT '0' COMMENT '扣减库存方式：1拍下减库存 2付款减库存|牛振宇|2020-11-03',
  `hold_stock` decimal(19,4) NOT NULL DEFAULT '0.0000' COMMENT '占用库存量|牛振宇|2020-11-03',
  `modify_mask` int NOT NULL DEFAULT '1' COMMENT '修改标记，平台货品信息发生变化置为1|牛振宇|2020-11-03',
  `delete_flag` tinyint(1) NOT NULL COMMENT '删除标志|@0未删除；@1已删除|牛振宇|2020-11-20',
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间|牛振宇|2020-11-03',
  `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间|牛振宇|2020-11-03',
  `main_img_url` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '主图url|牛振宇|2021-06-29',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `uk_mid_shopid_skuid` (`merchant_id`,`shop_id`,`goods_id`,`sku_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC COMMENT='平台货品SKU表|牛振宇|2020-11-03';


-- ----------------------------
-- Table structure for sys_shop
-- ----------------------------
DROP TABLE IF EXISTS `sys_shop`;
CREATE TABLE `sys_shop`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `platform_id` int(0) NOT NULL DEFAULT 0 COMMENT '平台id|牛振宇|2020-12-10',
  `sub_platform_id` tinyint(0) NOT NULL DEFAULT 0 COMMENT '子平台ID,子平台只是业务流程上有差别|周达材|2020-11-006',
  `shop_no` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '店铺编号|周达材|2020-11-006',
  `shop_name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '店铺名称|周达材|2020-11-006',
  `img_url` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '店铺图片|牛振宇|2020-11-26',
  `pay_account_id` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '帐款帐号,如支付宝、财富通|周达材|2020-11-006',
  `auth_status` tinyint(0) NOT NULL DEFAULT 0 COMMENT '授权状态，0未授权 1已授权 2授权失效（只有后台脚本可能修改成2）3授权停用|周达材|2020-11-006',
  `push_rds_id` tinyint(0) NOT NULL DEFAULT 0 COMMENT '是否启用推送 0不推送 其它值对应RDS服务器|周达材|2020-11-006',
  `pay_auth_status` tinyint(0) NOT NULL DEFAULT 0 COMMENT '支付宝授权状态 0未授权 1已授权 2授权失效（只有后台脚本可能修改成2）3授权停用|周达材|2020-11-006',
  `account_id` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '平台ID，一般是数字形式，平台上的主键|周达材|2020-11-006',
  `account_nick` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '平台帐号，比如淘宝登录帐号,nick|周达材|2020-11-006',
  `app_key` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT 'json格式，包含了key,secret,token|周达材|2020-11-006',
  `refresh_token` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '刷新令牌|周达材|2020-11-006',
  `sh_secret` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '授权码，PHP用来检验的串|周达材|2020-11-006',
  `auth_time` timestamp(0) NULL DEFAULT NULL COMMENT '授权日期|周达材|2020-11-006',
  `expire_time` timestamp(0) NULL DEFAULT NULL COMMENT 'session过期时间|周达材|2020-11-006',
  `re_expire_time` timestamp(0) NULL DEFAULT NULL COMMENT 'refresh_token过期时间|周达材|2020-11-006',
  `unfreeze_auth_time` int(0) NOT NULL DEFAULT 0 COMMENT '冻结授权到此时间为止(unix时间戳)|周达材|2020-11-006',
  `service_expire_time` timestamp(0) NULL DEFAULT NULL COMMENT '订阅服务过期时间|牛振宇|2021-01-05',
  `service_type` tinyint(1) NOT NULL DEFAULT 0 COMMENT '服务类型：@0:未知服务类型，@1:试用服务，@2:正式服务|牛振宇|2021-02-05',
  `send_order_quantity_flag` tinyint(1) NOT NULL DEFAULT 0 COMMENT '购买服务后赠送单量标识|牛振宇|2021-02-05',
  `inviter_send_order_flag` tinyint(1) NOT NULL DEFAULT 0 COMMENT '邀请人赠送单量标识|牛振宇|2021-02-05',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '备注|周达材|2020-11-006',
  `delete_flag` tinyint(1) NOT NULL DEFAULT 0 COMMENT '删除标识|@1：已删除；@0：未删除',
  `taobao_shop_id` bigint(0) NOT NULL DEFAULT 0 COMMENT '非淘宝店铺关联淘宝店铺,电子发票专用|牛振宇|2020-11-12',
  `elec_invoice_payee_id` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '0' COMMENT '收款方id,电子发票专用|牛振宇|2020-11-12',
  `elec_invoice_provider_id` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '0' COMMENT '服务商id,电子发票专用|牛振宇|2020-11-12',
  `paper_invoice_provider_id` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '0' COMMENT '纸质发票服务商id|牛振宇|2020-11-12',
  `logistics_sync_delay` tinyint(0) NOT NULL DEFAULT 0 COMMENT '物流同步延迟小时数|牛振宇|2020-11-12',
  `deliver_order_num` int(0) NOT NULL DEFAULT 0 COMMENT '店铺累计发货单量|牛振宇|2021-02-05',
  `spu_num` int(0) NOT NULL DEFAULT 0 COMMENT '店铺最新spu数量|牛振宇|2021-02-05',
  `modified` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  `created` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `isTjbSeller` tinyint(0) NOT NULL DEFAULT 0 COMMENT '是否是淘宝特价版|@0否 @1是|牛振宇|2021-3-6',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `IX_SYS_SHOP_ACCOUNT_ID`(`account_id`, `platform_id`, `sub_platform_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '平台店铺表，商家自主创建记录基本信息和授权信息' ROW_FORMAT = Dynamic;

