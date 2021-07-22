package com.huice.service_fdk.entity;

import lombok.Data;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 代拿子单，对应销端小标签|郑保乐|2021-06-08(SellerFetchOrder)实体类
 *
 * @author makejava
 * @since 2021-07-20 23:16:54
 */
@Data
public class FetchOrder implements Serializable {
    private static final long serialVersionUID = -42298309391541983L;
    SimpleDateFormat format;
    private Long id;

    private Long merchantId;


    private Long cityId = Long.valueOf(0);//
    private Long marketId = Long.valueOf(0);//
    private Long floorCode = Long.valueOf(0);//
    private Long bizId = Long.valueOf(0);//
    private String sellerOrderId = "string";
    private Long platformSpuId = Long.valueOf(0);//
    private Long platformSkuId = Long.valueOf(0);//
    private Long billId = Long.valueOf(0);
    private String platformSkuName = "string";//
    private String sellerQrCode = "string";
    private String sellerName = "string";//
    private String sellerShortName = "string";
    private String platformBarcode = "string";//
    private String cityName = "string";//
    private String marketName = "string";//
    private String bizName = "string";//
    private String spuGoodsNo = "string";//
    private String skuName = "string";//
    private Double refFetchPrice = Double.valueOf(0);
    private Double realFetchPrice = Double.valueOf(0);
    private Integer status = 2;
    private Byte tagPrintFlag = 0;
    private Byte sellerRefundFlag = 0;
    private Date scanTime;
    private Date created;
    private Date modified;

    {
        try {
            scanTime = format.parse("0000-00-00 00:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    {
        try {
            created = format.parse("0000-00-00 00:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    {
        try {
            modified = format.parse("0000-00-00 00:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
