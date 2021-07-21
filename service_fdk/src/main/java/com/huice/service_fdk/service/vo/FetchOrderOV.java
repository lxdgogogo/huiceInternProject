package com.huice.service_fdk.service.vo;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 代拿子单，对应销端小标签|郑保乐|2021-06-08(SellerFetchOrder)实体类
 *
 * @author makejava
 * @since 2021-07-20 23:16:54
 */
@Data
public class FetchOrderOV implements Serializable {
    private static final long serialVersionUID = -42298309391541983L;
    /**
     * id|郑保乐|2021-06-08
     */
    private Long id;
    /**
     * 商户id|郑保乐|2021-06-08
     */
    private Long merchantId;
    /**
     * 城市id|郑保乐|2021-06-08
     */
    private Long cityId;
    /**
     * 市场id|郑保乐|2021-06-08
     */
    private Long marketId;
    /**
     * 楼层编码（int）|郑保乐|2021-06-08
     */
    private Long floorCode;
    /**
     * 档口表id|郑保乐|2021-06-08
     */
    private Long bizId;
    /**
     * 销端子单id|郑保乐|2021-06-08
     */
    private String sellerOrderId;
    /**
     * 平台SPU id|郑保乐|2021-06-08
     */
    private Long platformSpuId;
    /**
     * 平台SKU id|郑保乐|2021-06-08
     */
    private Long platformSkuId;
    /**
     * 账单id，未开单为0|郑保乐|2021-06-08
     */
    private Long billId;
    /**
     * 平台SKU名称|郑保乐|2021-06-08
     */
    private String platformSkuName;
    /**
     * 销端二维码|郑保乐|2021-06-08
     */
    private String sellerQrCode;
    /**
     * 销售商名称|郑保乐|2021-06-21
     */
    private String sellerName;
    /**
     * 销售商简称|郑保乐|2021-06-08
     */
    private String sellerShortName;
    /**
     * 平台条码|郑保乐|2021-06-08
     */
    private String platformBarcode;
    /**
     * 城市|郑保乐|2021-06-08
     */
    private String cityName;
    /**
     * 市场|郑保乐|2021-06-08
     */
    private String marketName;
    /**
     * 档口|郑保乐|2021-06-08
     */
    private String bizName;
    /**
     * 货号|郑保乐|2021-06-08
     */
    private String spuGoodsNo;
    /**
     * SKU名称|郑保乐|2021-06-08
     */
    private String skuName;
    /**
     * 参考拿货价|郑保乐|2021-06-08
     */
    private Double refFetchPrice;
    /**
     * 实际拿货价|郑保乐|2021-06-08
     */
    private Double realFetchPrice;
    /**
     * 状态：@1拿货中 @2已打印 @3已完结
     */
    private Integer status;
    /**
     * 是否已打小标签|郑保乐|2021-06-08
     */
    private Byte tagPrintFlag;
    /**
     * 销端售前退款|郑保乐|2021-06-08
     */
    private Byte sellerRefundFlag;
    /**
     * 扫码到货时间|郑保乐|2021-06-08
     */
    private Date scanTime;

    private Date created;

    private Date modified;

}
