package tbclient.GetGiftListByCategoryId;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PresentGiftListByCategoryId1 extends Message {
    public static final String DEFAULT_GIFT_DESC = "";
    public static final String DEFAULT_GIFT_NAME = "";
    public static final String DEFAULT_MARK_URL = "";
    public static final String DEFAULT_THUMBNAIL_URL = "";

    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer activity_type;

    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer begin_time;

    @ProtoField(tag = 18, type = Message.Datatype.UINT32)
    public final Integer currency;

    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer currency_unit;

    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer discount;

    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer end_time;

    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer gift_count;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String gift_desc;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer gift_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String gift_name;

    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer ios_discount;

    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer ios_price;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String mark_url;

    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer pitch_on;

    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer price;

    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer proportion;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String thumbnail_url;
    public static final Integer DEFAULT_GIFT_ID = 0;
    public static final Integer DEFAULT_PRICE = 0;
    public static final Integer DEFAULT_IOS_PRICE = 0;
    public static final Integer DEFAULT_ACTIVITY_TYPE = 0;
    public static final Integer DEFAULT_BEGIN_TIME = 0;
    public static final Integer DEFAULT_END_TIME = 0;
    public static final Integer DEFAULT_DISCOUNT = 0;
    public static final Integer DEFAULT_IOS_DISCOUNT = 0;
    public static final Integer DEFAULT_PROPORTION = 0;
    public static final Integer DEFAULT_PITCH_ON = 0;
    public static final Integer DEFAULT_GIFT_COUNT = 0;
    public static final Integer DEFAULT_CURRENCY_UNIT = 0;
    public static final Integer DEFAULT_CURRENCY = 0;

    public static final class Builder extends Message.Builder<PresentGiftListByCategoryId1> {
        public Integer activity_type;
        public Integer begin_time;
        public Integer currency;
        public Integer currency_unit;
        public Integer discount;
        public Integer end_time;
        public Integer gift_count;
        public String gift_desc;
        public Integer gift_id;
        public String gift_name;
        public Integer ios_discount;
        public Integer ios_price;
        public String mark_url;
        public Integer pitch_on;
        public Integer price;
        public Integer proportion;
        public String thumbnail_url;

        public Builder() {
        }

        public Builder(PresentGiftListByCategoryId1 presentGiftListByCategoryId1) {
            super(presentGiftListByCategoryId1);
            if (presentGiftListByCategoryId1 == null) {
                return;
            }
            this.gift_id = presentGiftListByCategoryId1.gift_id;
            this.gift_name = presentGiftListByCategoryId1.gift_name;
            this.price = presentGiftListByCategoryId1.price;
            this.thumbnail_url = presentGiftListByCategoryId1.thumbnail_url;
            this.ios_price = presentGiftListByCategoryId1.ios_price;
            this.gift_desc = presentGiftListByCategoryId1.gift_desc;
            this.activity_type = presentGiftListByCategoryId1.activity_type;
            this.mark_url = presentGiftListByCategoryId1.mark_url;
            this.begin_time = presentGiftListByCategoryId1.begin_time;
            this.end_time = presentGiftListByCategoryId1.end_time;
            this.discount = presentGiftListByCategoryId1.discount;
            this.ios_discount = presentGiftListByCategoryId1.ios_discount;
            this.proportion = presentGiftListByCategoryId1.proportion;
            this.pitch_on = presentGiftListByCategoryId1.pitch_on;
            this.gift_count = presentGiftListByCategoryId1.gift_count;
            this.currency_unit = presentGiftListByCategoryId1.currency_unit;
            this.currency = presentGiftListByCategoryId1.currency;
        }

        @Override // com.squareup.wire.Message.Builder
        public PresentGiftListByCategoryId1 build(boolean z) {
            return new PresentGiftListByCategoryId1(this, z);
        }
    }

    public PresentGiftListByCategoryId1(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.gift_id;
            if (num == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = num;
            }
            String str = builder.gift_name;
            if (str == null) {
                this.gift_name = "";
            } else {
                this.gift_name = str;
            }
            Integer num2 = builder.price;
            if (num2 == null) {
                this.price = DEFAULT_PRICE;
            } else {
                this.price = num2;
            }
            String str2 = builder.thumbnail_url;
            if (str2 == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = str2;
            }
            Integer num3 = builder.ios_price;
            if (num3 == null) {
                this.ios_price = DEFAULT_IOS_PRICE;
            } else {
                this.ios_price = num3;
            }
            String str3 = builder.gift_desc;
            if (str3 == null) {
                this.gift_desc = "";
            } else {
                this.gift_desc = str3;
            }
            Integer num4 = builder.activity_type;
            if (num4 == null) {
                this.activity_type = DEFAULT_ACTIVITY_TYPE;
            } else {
                this.activity_type = num4;
            }
            String str4 = builder.mark_url;
            if (str4 == null) {
                this.mark_url = "";
            } else {
                this.mark_url = str4;
            }
            Integer num5 = builder.begin_time;
            if (num5 == null) {
                this.begin_time = DEFAULT_BEGIN_TIME;
            } else {
                this.begin_time = num5;
            }
            Integer num6 = builder.end_time;
            if (num6 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = num6;
            }
            Integer num7 = builder.discount;
            if (num7 == null) {
                this.discount = DEFAULT_DISCOUNT;
            } else {
                this.discount = num7;
            }
            Integer num8 = builder.ios_discount;
            if (num8 == null) {
                this.ios_discount = DEFAULT_IOS_DISCOUNT;
            } else {
                this.ios_discount = num8;
            }
            Integer num9 = builder.proportion;
            if (num9 == null) {
                this.proportion = DEFAULT_PROPORTION;
            } else {
                this.proportion = num9;
            }
            Integer num10 = builder.pitch_on;
            if (num10 == null) {
                this.pitch_on = DEFAULT_PITCH_ON;
            } else {
                this.pitch_on = num10;
            }
            Integer num11 = builder.gift_count;
            if (num11 == null) {
                this.gift_count = DEFAULT_GIFT_COUNT;
            } else {
                this.gift_count = num11;
            }
            Integer num12 = builder.currency_unit;
            if (num12 == null) {
                this.currency_unit = DEFAULT_CURRENCY_UNIT;
            } else {
                this.currency_unit = num12;
            }
            Integer num13 = builder.currency;
            if (num13 == null) {
                this.currency = DEFAULT_CURRENCY;
                return;
            } else {
                this.currency = num13;
                return;
            }
        }
        this.gift_id = builder.gift_id;
        this.gift_name = builder.gift_name;
        this.price = builder.price;
        this.thumbnail_url = builder.thumbnail_url;
        this.ios_price = builder.ios_price;
        this.gift_desc = builder.gift_desc;
        this.activity_type = builder.activity_type;
        this.mark_url = builder.mark_url;
        this.begin_time = builder.begin_time;
        this.end_time = builder.end_time;
        this.discount = builder.discount;
        this.ios_discount = builder.ios_discount;
        this.proportion = builder.proportion;
        this.pitch_on = builder.pitch_on;
        this.gift_count = builder.gift_count;
        this.currency_unit = builder.currency_unit;
        this.currency = builder.currency;
    }
}