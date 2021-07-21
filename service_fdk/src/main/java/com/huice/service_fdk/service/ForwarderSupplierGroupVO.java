package com.huice.service_fdk.service;

import java.util.ArrayList;
import java.util.List;

public class ForwarderSupplierGroupVO {
    private final String groupName;//分组名称 (城市+市场)
    private final List<ForwarderSupplierVO> suppliers;//档口信息集合


    public ForwarderSupplierGroupVO(String groupName, List<ForwarderSupplierVO> suppliers) {
        this.groupName = groupName;
        this.suppliers = suppliers;
    }

    public String getGroupName() {
        return groupName;
    }

    public List<ForwarderSupplierVO> getSuppliers() {
        return suppliers;
    }
}
