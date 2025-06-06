package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AppTransmitData extends Message {
    public static final String DEFAULT_CARRIER_NAME = "";
    public static final String DEFAULT_COUNTRY_CODE = "";
    public static final String DEFAULT_DEVICE_TYPE = "";
    public static final String DEFAULT_DISK_TOTAL = "";
    public static final String DEFAULT_IDFV = "";
    public static final String DEFAULT_ISMI = "";
    public static final String DEFAULT_LOCAL_TZ_NAME = "";
    public static final String DEFAULT_MB_TIME = "";
    public static final String DEFAULT_MEM_TOTAL = "";
    public static final String DEFAULT_SHA1 = "";
    public static final String DEFAULT_STARTUP_TIME = "";
    public static final String DEFAULT_WISE_SAMPLE_ID = "";
    public static final String DEFAULT_YY_HDID = "";
    public static final String DEFAULT_YY_VERSION = "";

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer carrier;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String carrier_name;

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String country_code;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String device_type;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String disk_total;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String idfv;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ismi;

    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String local_tz_name;

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String mb_time;

    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String mem_total;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer orientation;

    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String sha1;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String startup_time;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String wise_sample_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String yy_hdid;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String yy_version;
    public static final Integer DEFAULT_ORIENTATION = 0;
    public static final Integer DEFAULT_CARRIER = 0;

    public static final class Builder extends Message.Builder<AppTransmitData> {
        public Integer carrier;
        public String carrier_name;
        public String country_code;
        public String device_type;
        public String disk_total;
        public String idfv;
        public String ismi;
        public String local_tz_name;
        public String mb_time;
        public String mem_total;
        public Integer orientation;
        public String sha1;
        public String startup_time;
        public String wise_sample_id;
        public String yy_hdid;
        public String yy_version;

        public Builder() {
        }

        public Builder(AppTransmitData appTransmitData) {
            super(appTransmitData);
            if (appTransmitData == null) {
                return;
            }
            this.wise_sample_id = appTransmitData.wise_sample_id;
            this.yy_hdid = appTransmitData.yy_hdid;
            this.yy_version = appTransmitData.yy_version;
            this.ismi = appTransmitData.ismi;
            this.orientation = appTransmitData.orientation;
            this.carrier = appTransmitData.carrier;
            this.carrier_name = appTransmitData.carrier_name;
            this.idfv = appTransmitData.idfv;
            this.startup_time = appTransmitData.startup_time;
            this.country_code = appTransmitData.country_code;
            this.mb_time = appTransmitData.mb_time;
            this.disk_total = appTransmitData.disk_total;
            this.mem_total = appTransmitData.mem_total;
            this.device_type = appTransmitData.device_type;
            this.local_tz_name = appTransmitData.local_tz_name;
            this.sha1 = appTransmitData.sha1;
        }

        @Override // com.squareup.wire.Message.Builder
        public AppTransmitData build(boolean z) {
            return new AppTransmitData(this, z);
        }
    }

    public AppTransmitData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.wise_sample_id;
            if (str == null) {
                this.wise_sample_id = "";
            } else {
                this.wise_sample_id = str;
            }
            String str2 = builder.yy_hdid;
            if (str2 == null) {
                this.yy_hdid = "";
            } else {
                this.yy_hdid = str2;
            }
            String str3 = builder.yy_version;
            if (str3 == null) {
                this.yy_version = "";
            } else {
                this.yy_version = str3;
            }
            String str4 = builder.ismi;
            if (str4 == null) {
                this.ismi = "";
            } else {
                this.ismi = str4;
            }
            Integer num = builder.orientation;
            if (num == null) {
                this.orientation = DEFAULT_ORIENTATION;
            } else {
                this.orientation = num;
            }
            Integer num2 = builder.carrier;
            if (num2 == null) {
                this.carrier = DEFAULT_CARRIER;
            } else {
                this.carrier = num2;
            }
            String str5 = builder.carrier_name;
            if (str5 == null) {
                this.carrier_name = "";
            } else {
                this.carrier_name = str5;
            }
            String str6 = builder.idfv;
            if (str6 == null) {
                this.idfv = "";
            } else {
                this.idfv = str6;
            }
            String str7 = builder.startup_time;
            if (str7 == null) {
                this.startup_time = "";
            } else {
                this.startup_time = str7;
            }
            String str8 = builder.country_code;
            if (str8 == null) {
                this.country_code = "";
            } else {
                this.country_code = str8;
            }
            String str9 = builder.mb_time;
            if (str9 == null) {
                this.mb_time = "";
            } else {
                this.mb_time = str9;
            }
            String str10 = builder.disk_total;
            if (str10 == null) {
                this.disk_total = "";
            } else {
                this.disk_total = str10;
            }
            String str11 = builder.mem_total;
            if (str11 == null) {
                this.mem_total = "";
            } else {
                this.mem_total = str11;
            }
            String str12 = builder.device_type;
            if (str12 == null) {
                this.device_type = "";
            } else {
                this.device_type = str12;
            }
            String str13 = builder.local_tz_name;
            if (str13 == null) {
                this.local_tz_name = "";
            } else {
                this.local_tz_name = str13;
            }
            String str14 = builder.sha1;
            if (str14 == null) {
                this.sha1 = "";
                return;
            } else {
                this.sha1 = str14;
                return;
            }
        }
        this.wise_sample_id = builder.wise_sample_id;
        this.yy_hdid = builder.yy_hdid;
        this.yy_version = builder.yy_version;
        this.ismi = builder.ismi;
        this.orientation = builder.orientation;
        this.carrier = builder.carrier;
        this.carrier_name = builder.carrier_name;
        this.idfv = builder.idfv;
        this.startup_time = builder.startup_time;
        this.country_code = builder.country_code;
        this.mb_time = builder.mb_time;
        this.disk_total = builder.disk_total;
        this.mem_total = builder.mem_total;
        this.device_type = builder.device_type;
        this.local_tz_name = builder.local_tz_name;
        this.sha1 = builder.sha1;
    }
}