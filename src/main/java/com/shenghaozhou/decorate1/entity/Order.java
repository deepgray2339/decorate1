package com.shenghaozhou.decorate1.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Order {
    private Long id;
    private String customerName;
    private String phoneNumber;
    private String type;
    @TableField(exist = false)
    private List<String> style;
    private String sStyle;

    public Order() {
    }

    public Order(Long id, String customerName, String phoneNumber, String type, List<String> style) {
        this.id = id;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.style = style;
    }

    @Override
    public String toString() {
        return "id: " + getId()
                + "customerName: " + getCustomerName()
                + "phoneNumber: " + getPhoneNumber()
                + "type: " + getType()
                + "style: " + getSStyle();
    }

    public void setSStyle() {
        StringBuilder ssb = new StringBuilder();
        for (String s : style) {
            ssb.append(s);
        }
        this.sStyle = ssb.toString();
    }
}
