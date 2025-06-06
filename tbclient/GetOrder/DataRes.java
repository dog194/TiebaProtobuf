package tbclient.GetOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_AUTHORIZE_DATA = "";
    public static final String DEFAULT_CALL_TYPE = "";
    public static final String DEFAULT_CUSTOMER_UID = "";
    public static final String DEFAULT_EXECUTE_TIME = "";
    public static final String DEFAULT_EXTDATA = "";
    public static final String DEFAULT_FAIL_URL = "";
    public static final String DEFAULT_IMEI = "";
    public static final String DEFAULT_ITEMINFO = "";
    public static final String DEFAULT_MOBILE = "";
    public static final String DEFAULT_NOTIFYURL = "";
    public static final String DEFAULT_ORDERID = "";
    public static final String DEFAULT_PASSUID = "";
    public static final String DEFAULT_PAY_CHANNEL = "";
    public static final String DEFAULT_PAY_URL = "";
    public static final String DEFAULT_PERIOD = "";
    public static final String DEFAULT_PERIOD_TYPE = "";
    public static final String DEFAULT_REQ_DATA = "";
    public static final String DEFAULT_RETURN_URL = "";
    public static final String DEFAULT_SERVICE = "";
    public static final String DEFAULT_SIGN = "";
    public static final String DEFAULT_SIGN_CHANNEL = "";
    public static final String DEFAULT_SINGLE_AMOUNT = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TN = "";
    public static final String DEFAULT_URL = "";

    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String authorize_data;

    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String call_type;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long customerId;

    @ProtoField(tag = 31, type = Message.Datatype.STRING)
    public final String customer_uid;

    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer deviceType;

    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String execute_time;

    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String extData;

    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String fail_url;

    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String imei;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String itemInfo;

    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String mobile;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String notifyUrl;

    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer orderCreateTime;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String orderId;

    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long originalAmount;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String passuid;

    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long payAmount;

    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String pay_channel;

    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String pay_url;

    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String period;

    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String period_type;

    @ProtoField(tag = 21)
    public final NotifyPopup popup;

    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String req_data;

    @ProtoField(tag = 33, type = Message.Datatype.STRING)
    public final String return_url;

    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer sdk;

    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer sdkStyle;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String service;

    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String sign;

    @ProtoField(tag = 19, type = Message.Datatype.UINT32)
    public final Integer signType;

    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String sign_channel;

    @ProtoField(tag = 30, type = Message.Datatype.STRING)
    public final String single_amount;

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String tn;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String url;
    public static final Long DEFAULT_CUSTOMERID = 0L;
    public static final Integer DEFAULT_ORDERCREATETIME = 0;
    public static final Integer DEFAULT_DEVICETYPE = 0;
    public static final Long DEFAULT_PAYAMOUNT = 0L;
    public static final Long DEFAULT_ORIGINALAMOUNT = 0L;
    public static final Integer DEFAULT_SDK = 0;
    public static final Integer DEFAULT_SDKSTYLE = 0;
    public static final Integer DEFAULT_SIGNTYPE = 0;

    public static final class Builder extends Message.Builder<DataRes> {
        public String authorize_data;
        public String call_type;
        public Long customerId;
        public String customer_uid;
        public Integer deviceType;
        public String execute_time;
        public String extData;
        public String fail_url;
        public String imei;
        public String itemInfo;
        public String mobile;
        public String notifyUrl;
        public Integer orderCreateTime;
        public String orderId;
        public Long originalAmount;
        public String passuid;
        public Long payAmount;
        public String pay_channel;
        public String pay_url;
        public String period;
        public String period_type;
        public NotifyPopup popup;
        public String req_data;
        public String return_url;
        public Integer sdk;
        public Integer sdkStyle;
        public String service;
        public String sign;
        public Integer signType;
        public String sign_channel;
        public String single_amount;
        public String title;
        public String tn;
        public String url;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.customerId = dataRes.customerId;
            this.service = dataRes.service;
            this.orderId = dataRes.orderId;
            this.orderCreateTime = dataRes.orderCreateTime;
            this.deviceType = dataRes.deviceType;
            this.payAmount = dataRes.payAmount;
            this.originalAmount = dataRes.originalAmount;
            this.notifyUrl = dataRes.notifyUrl;
            this.passuid = dataRes.passuid;
            this.title = dataRes.title;
            this.tn = dataRes.tn;
            this.url = dataRes.url;
            this.mobile = dataRes.mobile;
            this.itemInfo = dataRes.itemInfo;
            this.imei = dataRes.imei;
            this.sdk = dataRes.sdk;
            this.sdkStyle = dataRes.sdkStyle;
            this.extData = dataRes.extData;
            this.signType = dataRes.signType;
            this.sign = dataRes.sign;
            this.popup = dataRes.popup;
            this.pay_url = dataRes.pay_url;
            this.call_type = dataRes.call_type;
            this.pay_channel = dataRes.pay_channel;
            this.authorize_data = dataRes.authorize_data;
            this.sign_channel = dataRes.sign_channel;
            this.period_type = dataRes.period_type;
            this.period = dataRes.period;
            this.execute_time = dataRes.execute_time;
            this.single_amount = dataRes.single_amount;
            this.customer_uid = dataRes.customer_uid;
            this.req_data = dataRes.req_data;
            this.return_url = dataRes.return_url;
            this.fail_url = dataRes.fail_url;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.customerId;
            if (l == null) {
                this.customerId = DEFAULT_CUSTOMERID;
            } else {
                this.customerId = l;
            }
            String str = builder.service;
            if (str == null) {
                this.service = "";
            } else {
                this.service = str;
            }
            String str2 = builder.orderId;
            if (str2 == null) {
                this.orderId = "";
            } else {
                this.orderId = str2;
            }
            Integer num = builder.orderCreateTime;
            if (num == null) {
                this.orderCreateTime = DEFAULT_ORDERCREATETIME;
            } else {
                this.orderCreateTime = num;
            }
            Integer num2 = builder.deviceType;
            if (num2 == null) {
                this.deviceType = DEFAULT_DEVICETYPE;
            } else {
                this.deviceType = num2;
            }
            Long l2 = builder.payAmount;
            if (l2 == null) {
                this.payAmount = DEFAULT_PAYAMOUNT;
            } else {
                this.payAmount = l2;
            }
            Long l3 = builder.originalAmount;
            if (l3 == null) {
                this.originalAmount = DEFAULT_ORIGINALAMOUNT;
            } else {
                this.originalAmount = l3;
            }
            String str3 = builder.notifyUrl;
            if (str3 == null) {
                this.notifyUrl = "";
            } else {
                this.notifyUrl = str3;
            }
            String str4 = builder.passuid;
            if (str4 == null) {
                this.passuid = "";
            } else {
                this.passuid = str4;
            }
            String str5 = builder.title;
            if (str5 == null) {
                this.title = "";
            } else {
                this.title = str5;
            }
            String str6 = builder.tn;
            if (str6 == null) {
                this.tn = "";
            } else {
                this.tn = str6;
            }
            String str7 = builder.url;
            if (str7 == null) {
                this.url = "";
            } else {
                this.url = str7;
            }
            String str8 = builder.mobile;
            if (str8 == null) {
                this.mobile = "";
            } else {
                this.mobile = str8;
            }
            String str9 = builder.itemInfo;
            if (str9 == null) {
                this.itemInfo = "";
            } else {
                this.itemInfo = str9;
            }
            String str10 = builder.imei;
            if (str10 == null) {
                this.imei = "";
            } else {
                this.imei = str10;
            }
            Integer num3 = builder.sdk;
            if (num3 == null) {
                this.sdk = DEFAULT_SDK;
            } else {
                this.sdk = num3;
            }
            Integer num4 = builder.sdkStyle;
            if (num4 == null) {
                this.sdkStyle = DEFAULT_SDKSTYLE;
            } else {
                this.sdkStyle = num4;
            }
            String str11 = builder.extData;
            if (str11 == null) {
                this.extData = "";
            } else {
                this.extData = str11;
            }
            Integer num5 = builder.signType;
            if (num5 == null) {
                this.signType = DEFAULT_SIGNTYPE;
            } else {
                this.signType = num5;
            }
            String str12 = builder.sign;
            if (str12 == null) {
                this.sign = "";
            } else {
                this.sign = str12;
            }
            this.popup = builder.popup;
            String str13 = builder.pay_url;
            if (str13 == null) {
                this.pay_url = "";
            } else {
                this.pay_url = str13;
            }
            String str14 = builder.call_type;
            if (str14 == null) {
                this.call_type = "";
            } else {
                this.call_type = str14;
            }
            String str15 = builder.pay_channel;
            if (str15 == null) {
                this.pay_channel = "";
            } else {
                this.pay_channel = str15;
            }
            String str16 = builder.authorize_data;
            if (str16 == null) {
                this.authorize_data = "";
            } else {
                this.authorize_data = str16;
            }
            String str17 = builder.sign_channel;
            if (str17 == null) {
                this.sign_channel = "";
            } else {
                this.sign_channel = str17;
            }
            String str18 = builder.period_type;
            if (str18 == null) {
                this.period_type = "";
            } else {
                this.period_type = str18;
            }
            String str19 = builder.period;
            if (str19 == null) {
                this.period = "";
            } else {
                this.period = str19;
            }
            String str20 = builder.execute_time;
            if (str20 == null) {
                this.execute_time = "";
            } else {
                this.execute_time = str20;
            }
            String str21 = builder.single_amount;
            if (str21 == null) {
                this.single_amount = "";
            } else {
                this.single_amount = str21;
            }
            String str22 = builder.customer_uid;
            if (str22 == null) {
                this.customer_uid = "";
            } else {
                this.customer_uid = str22;
            }
            String str23 = builder.req_data;
            if (str23 == null) {
                this.req_data = "";
            } else {
                this.req_data = str23;
            }
            String str24 = builder.return_url;
            if (str24 == null) {
                this.return_url = "";
            } else {
                this.return_url = str24;
            }
            String str25 = builder.fail_url;
            if (str25 == null) {
                this.fail_url = "";
                return;
            } else {
                this.fail_url = str25;
                return;
            }
        }
        this.customerId = builder.customerId;
        this.service = builder.service;
        this.orderId = builder.orderId;
        this.orderCreateTime = builder.orderCreateTime;
        this.deviceType = builder.deviceType;
        this.payAmount = builder.payAmount;
        this.originalAmount = builder.originalAmount;
        this.notifyUrl = builder.notifyUrl;
        this.passuid = builder.passuid;
        this.title = builder.title;
        this.tn = builder.tn;
        this.url = builder.url;
        this.mobile = builder.mobile;
        this.itemInfo = builder.itemInfo;
        this.imei = builder.imei;
        this.sdk = builder.sdk;
        this.sdkStyle = builder.sdkStyle;
        this.extData = builder.extData;
        this.signType = builder.signType;
        this.sign = builder.sign;
        this.popup = builder.popup;
        this.pay_url = builder.pay_url;
        this.call_type = builder.call_type;
        this.pay_channel = builder.pay_channel;
        this.authorize_data = builder.authorize_data;
        this.sign_channel = builder.sign_channel;
        this.period_type = builder.period_type;
        this.period = builder.period;
        this.execute_time = builder.execute_time;
        this.single_amount = builder.single_amount;
        this.customer_uid = builder.customer_uid;
        this.req_data = builder.req_data;
        this.return_url = builder.return_url;
        this.fail_url = builder.fail_url;
    }
}