package self.mybatis.testnoxml.entity;

import self.mybatis.noxml.annotation.Primary;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "base_region")
public class BaseRegion {

    @Primary(name = "id")
    private Integer id;

    @Column(name = "region")
    private String region;

    @Column(name = "subtypeName")
    private String subtype_name;

    @Column(name = "subtype_id")
    private Integer subtypeId;

    @Column(name = "is_global")
    private Integer isGlobal;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubtype_name() {
        return subtype_name;
    }

    public void setSubtype_name(String subtype_name) {
        this.subtype_name = subtype_name;
    }

    public Integer getSubtypeId() {
        return subtypeId;
    }

    public void setSubtypeId(Integer subtypeId) {
        this.subtypeId = subtypeId;
    }

    public Integer getIsGlobal() {
        return isGlobal;
    }

    public void setIsGlobal(Integer isGlobal) {
        this.isGlobal = isGlobal;
    }

    @Override
    public String toString() {
        return "BaseRegion{" +
                "id=" + id +
                ", region='" + region + '\'' +
                ", subtype_name='" + subtype_name + '\'' +
                ", subtypeId=" + subtypeId +
                ", isGlobal=" + isGlobal +
                '}';
    }
}
