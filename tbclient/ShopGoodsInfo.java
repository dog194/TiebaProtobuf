package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ShopGoodsInfo extends Message {
    public static final String DEFAULT_COVER_IMG = "";
    public static final String DEFAULT_GOODS_DESC = "";
    public static final String DEFAULT_GOODS_NAME = "";
    public static final String DEFAULT_SCHEME = "";
    public static final String DEFAULT_URL = "";

    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer card_style;

    @ProtoField(tag = 6)
    public final ShopGoodsChannelInfo channel_info;

    @ProtoField(tag = 11)
    public final ShopGoodsCommentInfo comment_info;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String cover_img;

    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String goods_desc;

    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer goods_id;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String goods_name;

    @ProtoField(tag = 10)
    public final ListingReason listing_reason;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer price;

    @ProtoField(tag = 4)
    public final ShopGoodsRecommendInfo recommend_info;

    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long sales;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String scheme;

    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long thread_id;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_PRICE = 0;
    public static final Long DEFAULT_SALES = 0L;
    public static final Integer DEFAULT_CARD_STYLE = 0;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Integer DEFAULT_GOODS_ID = 0;

    public static final class Builder extends Message.Builder<ShopGoodsInfo> {
        public Integer card_style;
        public ShopGoodsChannelInfo channel_info;
        public ShopGoodsCommentInfo comment_info;
        public String cover_img;
        public String goods_desc;
        public Integer goods_id;
        public String goods_name;
        public ListingReason listing_reason;
        public Integer price;
        public ShopGoodsRecommendInfo recommend_info;
        public Long sales;
        public String scheme;
        public Long thread_id;
        public String url;

        public Builder() {
        }

        public Builder(ShopGoodsInfo shopGoodsInfo) {
            super(shopGoodsInfo);
            if (shopGoodsInfo == null) {
                return;
            }
            this.goods_name = shopGoodsInfo.goods_name;
            this.price = shopGoodsInfo.price;
            this.sales = shopGoodsInfo.sales;
            this.recommend_info = shopGoodsInfo.recommend_info;
            this.card_style = shopGoodsInfo.card_style;
            this.channel_info = shopGoodsInfo.channel_info;
            this.cover_img = shopGoodsInfo.cover_img;
            this.url = shopGoodsInfo.url;
            this.thread_id = shopGoodsInfo.thread_id;
            this.listing_reason = shopGoodsInfo.listing_reason;
            this.comment_info = shopGoodsInfo.comment_info;
            this.scheme = shopGoodsInfo.scheme;
            this.goods_desc = shopGoodsInfo.goods_desc;
            this.goods_id = shopGoodsInfo.goods_id;
        }

        @Override // com.squareup.wire.Message.Builder
        public ShopGoodsInfo build(boolean z) {
            return new ShopGoodsInfo(this, z);
        }
    }

    public ShopGoodsInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.goods_name;
            if (str == null) {
                this.goods_name = "";
            } else {
                this.goods_name = str;
            }
            Integer num = builder.price;
            if (num == null) {
                this.price = DEFAULT_PRICE;
            } else {
                this.price = num;
            }
            Long l = builder.sales;
            if (l == null) {
                this.sales = DEFAULT_SALES;
            } else {
                this.sales = l;
            }
            this.recommend_info = builder.recommend_info;
            Integer num2 = builder.card_style;
            if (num2 == null) {
                this.card_style = DEFAULT_CARD_STYLE;
            } else {
                this.card_style = num2;
            }
            this.channel_info = builder.channel_info;
            String str2 = builder.cover_img;
            if (str2 == null) {
                this.cover_img = "";
            } else {
                this.cover_img = str2;
            }
            String str3 = builder.url;
            if (str3 == null) {
                this.url = "";
            } else {
                this.url = str3;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l2;
            }
            this.listing_reason = builder.listing_reason;
            this.comment_info = builder.comment_info;
            String str4 = builder.scheme;
            if (str4 == null) {
                this.scheme = "";
            } else {
                this.scheme = str4;
            }
            String str5 = builder.goods_desc;
            if (str5 == null) {
                this.goods_desc = "";
            } else {
                this.goods_desc = str5;
            }
            Integer num3 = builder.goods_id;
            if (num3 == null) {
                this.goods_id = DEFAULT_GOODS_ID;
                return;
            } else {
                this.goods_id = num3;
                return;
            }
        }
        this.goods_name = builder.goods_name;
        this.price = builder.price;
        this.sales = builder.sales;
        this.recommend_info = builder.recommend_info;
        this.card_style = builder.card_style;
        this.channel_info = builder.channel_info;
        this.cover_img = builder.cover_img;
        this.url = builder.url;
        this.thread_id = builder.thread_id;
        this.listing_reason = builder.listing_reason;
        this.comment_info = builder.comment_info;
        this.scheme = builder.scheme;
        this.goods_desc = builder.goods_desc;
        this.goods_id = builder.goods_id;
    }
}