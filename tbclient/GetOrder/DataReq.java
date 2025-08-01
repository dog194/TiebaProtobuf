package tbclient.GetOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
import tbclient.Wares;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CLICK_ZONE = "";
    public static final String DEFAULT_MOBILE = "";
    public static final String DEFAULT_ORDER_URL = "";
    public static final String DEFAULT_PAYMENT_EXTRA = "";
    public static final String DEFAULT_PAYMENT_POS_KEY = "";
    public static final String DEFAULT_REFER_PAGE = "";
    public static final String DEFAULT_WALLET_SDK_UA = "";

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String click_zone;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1427common;

    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer dialog_type;

    @ProtoField(tag = 13, type = Message.Datatype.INT64)
    public final Long from_scene;

    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer good_id;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_autopay;

    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer is_left;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String mobile;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String order_url;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer pay_type;

    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String payment_extra;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String payment_pos_key;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String refer_page;

    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer scene_id;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String wallet_sdk_ua;

    @ProtoField(tag = 6)
    public final Wares wares;
    public static final Integer DEFAULT_PAY_TYPE = 0;
    public static final Integer DEFAULT_IS_LEFT = 0;
    public static final Integer DEFAULT_IS_AUTOPAY = 0;
    public static final Long DEFAULT_FROM_SCENE = 0L;
    public static final Integer DEFAULT_GOOD_ID = 0;
    public static final Integer DEFAULT_SCENE_ID = 0;
    public static final Integer DEFAULT_DIALOG_TYPE = 0;

    public static final class Builder extends Message.Builder<DataReq> {
        public String click_zone;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1428common;
        public Integer dialog_type;
        public Long from_scene;
        public Integer good_id;
        public Integer is_autopay;
        public Integer is_left;
        public String mobile;
        public String order_url;
        public Integer pay_type;
        public String payment_extra;
        public String payment_pos_key;
        public String refer_page;
        public Integer scene_id;
        public String wallet_sdk_ua;
        public Wares wares;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1428common = dataReq.f1427common;
            this.pay_type = dataReq.pay_type;
            this.is_left = dataReq.is_left;
            this.order_url = dataReq.order_url;
            this.mobile = dataReq.mobile;
            this.wares = dataReq.wares;
            this.is_autopay = dataReq.is_autopay;
            this.payment_pos_key = dataReq.payment_pos_key;
            this.refer_page = dataReq.refer_page;
            this.click_zone = dataReq.click_zone;
            this.wallet_sdk_ua = dataReq.wallet_sdk_ua;
            this.from_scene = dataReq.from_scene;
            this.good_id = dataReq.good_id;
            this.scene_id = dataReq.scene_id;
            this.dialog_type = dataReq.dialog_type;
            this.payment_extra = dataReq.payment_extra;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1427common = builder.f1428common;
            Integer num = builder.pay_type;
            if (num == null) {
                this.pay_type = DEFAULT_PAY_TYPE;
            } else {
                this.pay_type = num;
            }
            Integer num2 = builder.is_left;
            if (num2 == null) {
                this.is_left = DEFAULT_IS_LEFT;
            } else {
                this.is_left = num2;
            }
            String str = builder.order_url;
            if (str == null) {
                this.order_url = "";
            } else {
                this.order_url = str;
            }
            String str2 = builder.mobile;
            if (str2 == null) {
                this.mobile = "";
            } else {
                this.mobile = str2;
            }
            this.wares = builder.wares;
            Integer num3 = builder.is_autopay;
            if (num3 == null) {
                this.is_autopay = DEFAULT_IS_AUTOPAY;
            } else {
                this.is_autopay = num3;
            }
            String str3 = builder.payment_pos_key;
            if (str3 == null) {
                this.payment_pos_key = "";
            } else {
                this.payment_pos_key = str3;
            }
            String str4 = builder.refer_page;
            if (str4 == null) {
                this.refer_page = "";
            } else {
                this.refer_page = str4;
            }
            String str5 = builder.click_zone;
            if (str5 == null) {
                this.click_zone = "";
            } else {
                this.click_zone = str5;
            }
            String str6 = builder.wallet_sdk_ua;
            if (str6 == null) {
                this.wallet_sdk_ua = "";
            } else {
                this.wallet_sdk_ua = str6;
            }
            Long l = builder.from_scene;
            if (l == null) {
                this.from_scene = DEFAULT_FROM_SCENE;
            } else {
                this.from_scene = l;
            }
            Integer num4 = builder.good_id;
            if (num4 == null) {
                this.good_id = DEFAULT_GOOD_ID;
            } else {
                this.good_id = num4;
            }
            Integer num5 = builder.scene_id;
            if (num5 == null) {
                this.scene_id = DEFAULT_SCENE_ID;
            } else {
                this.scene_id = num5;
            }
            Integer num6 = builder.dialog_type;
            if (num6 == null) {
                this.dialog_type = DEFAULT_DIALOG_TYPE;
            } else {
                this.dialog_type = num6;
            }
            String str7 = builder.payment_extra;
            if (str7 == null) {
                this.payment_extra = "";
                return;
            } else {
                this.payment_extra = str7;
                return;
            }
        }
        this.f1427common = builder.f1428common;
        this.pay_type = builder.pay_type;
        this.is_left = builder.is_left;
        this.order_url = builder.order_url;
        this.mobile = builder.mobile;
        this.wares = builder.wares;
        this.is_autopay = builder.is_autopay;
        this.payment_pos_key = builder.payment_pos_key;
        this.refer_page = builder.refer_page;
        this.click_zone = builder.click_zone;
        this.wallet_sdk_ua = builder.wallet_sdk_ua;
        this.from_scene = builder.from_scene;
        this.good_id = builder.good_id;
        this.scene_id = builder.scene_id;
        this.dialog_type = builder.dialog_type;
        this.payment_extra = builder.payment_extra;
    }
}