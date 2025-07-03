package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AdFilter extends Message {
    public static final Integer DEFAULT_BANNER_AD_FILTER = 0;
    public static final Integer DEFAULT_COMMENT_AD_FILTER = 0;
    public static final Integer DEFAULT_TAB_AD_FILTER = 0;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer banner_ad_filter;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer comment_ad_filter;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer tab_ad_filter;

    public static final class Builder extends Message.Builder<AdFilter> {
        public Integer banner_ad_filter;
        public Integer comment_ad_filter;
        public Integer tab_ad_filter;

        public Builder() {
        }

        public Builder(AdFilter adFilter) {
            super(adFilter);
            if (adFilter == null) {
                return;
            }
            this.banner_ad_filter = adFilter.banner_ad_filter;
            this.comment_ad_filter = adFilter.comment_ad_filter;
            this.tab_ad_filter = adFilter.tab_ad_filter;
        }

        @Override // com.squareup.wire.Message.Builder
        public AdFilter build(boolean z) {
            return new AdFilter(this, z);
        }
    }

    public AdFilter(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.banner_ad_filter;
            if (num == null) {
                this.banner_ad_filter = DEFAULT_BANNER_AD_FILTER;
            } else {
                this.banner_ad_filter = num;
            }
            Integer num2 = builder.comment_ad_filter;
            if (num2 == null) {
                this.comment_ad_filter = DEFAULT_COMMENT_AD_FILTER;
            } else {
                this.comment_ad_filter = num2;
            }
            Integer num3 = builder.tab_ad_filter;
            if (num3 == null) {
                this.tab_ad_filter = DEFAULT_TAB_AD_FILTER;
                return;
            } else {
                this.tab_ad_filter = num3;
                return;
            }
        }
        this.banner_ad_filter = builder.banner_ad_filter;
        this.comment_ad_filter = builder.comment_ad_filter;
        this.tab_ad_filter = builder.tab_ad_filter;
    }
}