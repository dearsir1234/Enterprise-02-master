package com.example.enterprise02.Enterprise.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhufu
 * @since 2023-08-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_enterprise")
public class Enterprise implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @TableField("stockCode")
    private String stockCode;

    private String name;

    private String shortname;

    @TableField("legalRepresentative")
    private String legalRepresentative;

    private String address;

    private String phone;

    private String fax;

    private String website;

    private String broker;

    private String area;

    private String email;

    private String industry;

    @TableField("listingDate")
    private LocalDateTime listingDate;

    @TableField("transferMode")
    private String transferMode;


}
