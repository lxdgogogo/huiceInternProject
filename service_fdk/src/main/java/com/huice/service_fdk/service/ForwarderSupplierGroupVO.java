package com.huice.service_fdk.service;

import java.util.ArrayList;

public class ForwarderSupplierGroupVO {
    private final String groupName;//分组名称 (城市+市场)
    private final ArrayList<ForwarderSupplierVO> suppliers;//档口信息集合

    public ForwarderSupplierGroupVO(String groupName) {
        this.groupName = groupName;
        this.suppliers = new ArrayList<>();
    }

    public String getGroupName() {
        return groupName;
    }

    public ArrayList<ForwarderSupplierVO> getSuppliers() {
        return suppliers;
    }
}
