/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.zo.domain.tables.pojos;


import cn.vertxup.zo.domain.tables.interfaces.IZoRoom;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ZoRoom implements VertxPojo, IZoRoom {

    private static final long serialVersionUID = 1L;

    private String pkId;
    private String tRoomattrs;
    private String sCode;
    private String sRoomNum;
    private String jConfig;
    private String jFeatures;
    private String rFloorId;
    private String rHotelId;
    private String rRoomTypeId;
    private String rTentId;
    private Boolean isActive;
    private String zSigma;
    private String zLanguage;
    private String zCreateBy;
    private LocalDateTime zCreateTime;
    private String zUpdateBy;
    private LocalDateTime zUpdateTime;

    public ZoRoom() {}

    public ZoRoom(IZoRoom value) {
        this.pkId = value.getPkId();
        this.tRoomattrs = value.getTRoomattrs();
        this.sCode = value.getSCode();
        this.sRoomNum = value.getSRoomNum();
        this.jConfig = value.getJConfig();
        this.jFeatures = value.getJFeatures();
        this.rFloorId = value.getRFloorId();
        this.rHotelId = value.getRHotelId();
        this.rRoomTypeId = value.getRRoomTypeId();
        this.rTentId = value.getRTentId();
        this.isActive = value.getIsActive();
        this.zSigma = value.getZSigma();
        this.zLanguage = value.getZLanguage();
        this.zCreateBy = value.getZCreateBy();
        this.zCreateTime = value.getZCreateTime();
        this.zUpdateBy = value.getZUpdateBy();
        this.zUpdateTime = value.getZUpdateTime();
    }

    public ZoRoom(
        String pkId,
        String tRoomattrs,
        String sCode,
        String sRoomNum,
        String jConfig,
        String jFeatures,
        String rFloorId,
        String rHotelId,
        String rRoomTypeId,
        String rTentId,
        Boolean isActive,
        String zSigma,
        String zLanguage,
        String zCreateBy,
        LocalDateTime zCreateTime,
        String zUpdateBy,
        LocalDateTime zUpdateTime
    ) {
        this.pkId = pkId;
        this.tRoomattrs = tRoomattrs;
        this.sCode = sCode;
        this.sRoomNum = sRoomNum;
        this.jConfig = jConfig;
        this.jFeatures = jFeatures;
        this.rFloorId = rFloorId;
        this.rHotelId = rHotelId;
        this.rRoomTypeId = rRoomTypeId;
        this.rTentId = rTentId;
        this.isActive = isActive;
        this.zSigma = zSigma;
        this.zLanguage = zLanguage;
        this.zCreateBy = zCreateBy;
        this.zCreateTime = zCreateTime;
        this.zUpdateBy = zUpdateBy;
        this.zUpdateTime = zUpdateTime;
    }

        public ZoRoom(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.PK_ID</code>. uniqueId,PK_ID
     */
    @Override
    public String getPkId() {
        return this.pkId;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.PK_ID</code>. uniqueId,PK_ID
     */
    @Override
    public ZoRoom setPkId(String pkId) {
        this.pkId = pkId;
        return this;
    }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.T_ROOMATTRS</code>.
     * attrs,T_ROOMATTRS
     */
    @Override
    public String getTRoomattrs() {
        return this.tRoomattrs;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.T_ROOMATTRS</code>.
     * attrs,T_ROOMATTRS
     */
    @Override
    public ZoRoom setTRoomattrs(String tRoomattrs) {
        this.tRoomattrs = tRoomattrs;
        return this;
    }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.S_CODE</code>. code,S_CODE
     */
    @Override
    public String getSCode() {
        return this.sCode;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.S_CODE</code>. code,S_CODE
     */
    @Override
    public ZoRoom setSCode(String sCode) {
        this.sCode = sCode;
        return this;
    }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.S_ROOM_NUM</code>. number,S_ROOM_NUM
     */
    @Override
    public String getSRoomNum() {
        return this.sRoomNum;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.S_ROOM_NUM</code>. number,S_ROOM_NUM
     */
    @Override
    public ZoRoom setSRoomNum(String sRoomNum) {
        this.sRoomNum = sRoomNum;
        return this;
    }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.J_CONFIG</code>. config,J_CONFIG
     */
    @Override
    public String getJConfig() {
        return this.jConfig;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.J_CONFIG</code>. config,J_CONFIG
     */
    @Override
    public ZoRoom setJConfig(String jConfig) {
        this.jConfig = jConfig;
        return this;
    }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.J_FEATURES</code>.
     * features,J_FEATURES
     */
    @Override
    public String getJFeatures() {
        return this.jFeatures;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.J_FEATURES</code>.
     * features,J_FEATURES
     */
    @Override
    public ZoRoom setJFeatures(String jFeatures) {
        this.jFeatures = jFeatures;
        return this;
    }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.R_FLOOR_ID</code>. floor,R_FLOOR_ID
     */
    @Override
    public String getRFloorId() {
        return this.rFloorId;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.R_FLOOR_ID</code>. floor,R_FLOOR_ID
     */
    @Override
    public ZoRoom setRFloorId(String rFloorId) {
        this.rFloorId = rFloorId;
        return this;
    }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.R_HOTEL_ID</code>.
     * hotelId,R_HOTEL_ID
     */
    @Override
    public String getRHotelId() {
        return this.rHotelId;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.R_HOTEL_ID</code>.
     * hotelId,R_HOTEL_ID
     */
    @Override
    public ZoRoom setRHotelId(String rHotelId) {
        this.rHotelId = rHotelId;
        return this;
    }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.R_ROOM_TYPE_ID</code>.
     * roomTypeId,R_ROOM_TYPE_ID
     */
    @Override
    public String getRRoomTypeId() {
        return this.rRoomTypeId;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.R_ROOM_TYPE_ID</code>.
     * roomTypeId,R_ROOM_TYPE_ID
     */
    @Override
    public ZoRoom setRRoomTypeId(String rRoomTypeId) {
        this.rRoomTypeId = rRoomTypeId;
        return this;
    }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.R_TENT_ID</code>. tent,R_TENT_ID
     */
    @Override
    public String getRTentId() {
        return this.rTentId;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.R_TENT_ID</code>. tent,R_TENT_ID
     */
    @Override
    public ZoRoom setRTentId(String rTentId) {
        this.rTentId = rTentId;
        return this;
    }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    @Override
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    @Override
    public ZoRoom setIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    @Override
    public String getZSigma() {
        return this.zSigma;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    @Override
    public ZoRoom setZSigma(String zSigma) {
        this.zSigma = zSigma;
        return this;
    }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.Z_LANGUAGE</code>.
     * language,Z_LANGUAGE
     */
    @Override
    public String getZLanguage() {
        return this.zLanguage;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.Z_LANGUAGE</code>.
     * language,Z_LANGUAGE
     */
    @Override
    public ZoRoom setZLanguage(String zLanguage) {
        this.zLanguage = zLanguage;
        return this;
    }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.Z_CREATE_BY</code>.
     * createBy,Z_CREATE_BY
     */
    @Override
    public String getZCreateBy() {
        return this.zCreateBy;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.Z_CREATE_BY</code>.
     * createBy,Z_CREATE_BY
     */
    @Override
    public ZoRoom setZCreateBy(String zCreateBy) {
        this.zCreateBy = zCreateBy;
        return this;
    }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.Z_CREATE_TIME</code>.
     * createTime,Z_CREATE_TIME
     */
    @Override
    public LocalDateTime getZCreateTime() {
        return this.zCreateTime;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.Z_CREATE_TIME</code>.
     * createTime,Z_CREATE_TIME
     */
    @Override
    public ZoRoom setZCreateTime(LocalDateTime zCreateTime) {
        this.zCreateTime = zCreateTime;
        return this;
    }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.Z_UPDATE_BY</code>.
     * updateBy,Z_UPDATE_BY
     */
    @Override
    public String getZUpdateBy() {
        return this.zUpdateBy;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.Z_UPDATE_BY</code>.
     * updateBy,Z_UPDATE_BY
     */
    @Override
    public ZoRoom setZUpdateBy(String zUpdateBy) {
        this.zUpdateBy = zUpdateBy;
        return this;
    }

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_ROOM.Z_UPDATE_TIME</code>.
     * updateTime,Z_UPDATE_TIME
     */
    @Override
    public LocalDateTime getZUpdateTime() {
        return this.zUpdateTime;
    }

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_ROOM.Z_UPDATE_TIME</code>.
     * updateTime,Z_UPDATE_TIME
     */
    @Override
    public ZoRoom setZUpdateTime(LocalDateTime zUpdateTime) {
        this.zUpdateTime = zUpdateTime;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ZoRoom other = (ZoRoom) obj;
        if (this.pkId == null) {
            if (other.pkId != null)
                return false;
        }
        else if (!this.pkId.equals(other.pkId))
            return false;
        if (this.tRoomattrs == null) {
            if (other.tRoomattrs != null)
                return false;
        }
        else if (!this.tRoomattrs.equals(other.tRoomattrs))
            return false;
        if (this.sCode == null) {
            if (other.sCode != null)
                return false;
        }
        else if (!this.sCode.equals(other.sCode))
            return false;
        if (this.sRoomNum == null) {
            if (other.sRoomNum != null)
                return false;
        }
        else if (!this.sRoomNum.equals(other.sRoomNum))
            return false;
        if (this.jConfig == null) {
            if (other.jConfig != null)
                return false;
        }
        else if (!this.jConfig.equals(other.jConfig))
            return false;
        if (this.jFeatures == null) {
            if (other.jFeatures != null)
                return false;
        }
        else if (!this.jFeatures.equals(other.jFeatures))
            return false;
        if (this.rFloorId == null) {
            if (other.rFloorId != null)
                return false;
        }
        else if (!this.rFloorId.equals(other.rFloorId))
            return false;
        if (this.rHotelId == null) {
            if (other.rHotelId != null)
                return false;
        }
        else if (!this.rHotelId.equals(other.rHotelId))
            return false;
        if (this.rRoomTypeId == null) {
            if (other.rRoomTypeId != null)
                return false;
        }
        else if (!this.rRoomTypeId.equals(other.rRoomTypeId))
            return false;
        if (this.rTentId == null) {
            if (other.rTentId != null)
                return false;
        }
        else if (!this.rTentId.equals(other.rTentId))
            return false;
        if (this.isActive == null) {
            if (other.isActive != null)
                return false;
        }
        else if (!this.isActive.equals(other.isActive))
            return false;
        if (this.zSigma == null) {
            if (other.zSigma != null)
                return false;
        }
        else if (!this.zSigma.equals(other.zSigma))
            return false;
        if (this.zLanguage == null) {
            if (other.zLanguage != null)
                return false;
        }
        else if (!this.zLanguage.equals(other.zLanguage))
            return false;
        if (this.zCreateBy == null) {
            if (other.zCreateBy != null)
                return false;
        }
        else if (!this.zCreateBy.equals(other.zCreateBy))
            return false;
        if (this.zCreateTime == null) {
            if (other.zCreateTime != null)
                return false;
        }
        else if (!this.zCreateTime.equals(other.zCreateTime))
            return false;
        if (this.zUpdateBy == null) {
            if (other.zUpdateBy != null)
                return false;
        }
        else if (!this.zUpdateBy.equals(other.zUpdateBy))
            return false;
        if (this.zUpdateTime == null) {
            if (other.zUpdateTime != null)
                return false;
        }
        else if (!this.zUpdateTime.equals(other.zUpdateTime))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.pkId == null) ? 0 : this.pkId.hashCode());
        result = prime * result + ((this.tRoomattrs == null) ? 0 : this.tRoomattrs.hashCode());
        result = prime * result + ((this.sCode == null) ? 0 : this.sCode.hashCode());
        result = prime * result + ((this.sRoomNum == null) ? 0 : this.sRoomNum.hashCode());
        result = prime * result + ((this.jConfig == null) ? 0 : this.jConfig.hashCode());
        result = prime * result + ((this.jFeatures == null) ? 0 : this.jFeatures.hashCode());
        result = prime * result + ((this.rFloorId == null) ? 0 : this.rFloorId.hashCode());
        result = prime * result + ((this.rHotelId == null) ? 0 : this.rHotelId.hashCode());
        result = prime * result + ((this.rRoomTypeId == null) ? 0 : this.rRoomTypeId.hashCode());
        result = prime * result + ((this.rTentId == null) ? 0 : this.rTentId.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.zSigma == null) ? 0 : this.zSigma.hashCode());
        result = prime * result + ((this.zLanguage == null) ? 0 : this.zLanguage.hashCode());
        result = prime * result + ((this.zCreateBy == null) ? 0 : this.zCreateBy.hashCode());
        result = prime * result + ((this.zCreateTime == null) ? 0 : this.zCreateTime.hashCode());
        result = prime * result + ((this.zUpdateBy == null) ? 0 : this.zUpdateBy.hashCode());
        result = prime * result + ((this.zUpdateTime == null) ? 0 : this.zUpdateTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ZoRoom (");

        sb.append(pkId);
        sb.append(", ").append(tRoomattrs);
        sb.append(", ").append(sCode);
        sb.append(", ").append(sRoomNum);
        sb.append(", ").append(jConfig);
        sb.append(", ").append(jFeatures);
        sb.append(", ").append(rFloorId);
        sb.append(", ").append(rHotelId);
        sb.append(", ").append(rRoomTypeId);
        sb.append(", ").append(rTentId);
        sb.append(", ").append(isActive);
        sb.append(", ").append(zSigma);
        sb.append(", ").append(zLanguage);
        sb.append(", ").append(zCreateBy);
        sb.append(", ").append(zCreateTime);
        sb.append(", ").append(zUpdateBy);
        sb.append(", ").append(zUpdateTime);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IZoRoom from) {
        setPkId(from.getPkId());
        setTRoomattrs(from.getTRoomattrs());
        setSCode(from.getSCode());
        setSRoomNum(from.getSRoomNum());
        setJConfig(from.getJConfig());
        setJFeatures(from.getJFeatures());
        setRFloorId(from.getRFloorId());
        setRHotelId(from.getRHotelId());
        setRRoomTypeId(from.getRRoomTypeId());
        setRTentId(from.getRTentId());
        setIsActive(from.getIsActive());
        setZSigma(from.getZSigma());
        setZLanguage(from.getZLanguage());
        setZCreateBy(from.getZCreateBy());
        setZCreateTime(from.getZCreateTime());
        setZUpdateBy(from.getZUpdateBy());
        setZUpdateTime(from.getZUpdateTime());
    }

    @Override
    public <E extends IZoRoom> E into(E into) {
        into.from(this);
        return into;
    }
}
