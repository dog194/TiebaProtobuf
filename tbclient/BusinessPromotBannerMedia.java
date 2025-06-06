package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class BusinessPromotBannerMedia extends Message {
    public static final String DEFAULT_RESOURCE_URL = "";
    public static final Integer DEFAULT_TYPE = 0;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String resource_url;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;

    public static final class Builder extends Message.Builder<BusinessPromotBannerMedia> {
        public String resource_url;
        public Integer type;

        public Builder() {
        }

        public Builder(BusinessPromotBannerMedia businessPromotBannerMedia) {
            super(businessPromotBannerMedia);
            if (businessPromotBannerMedia == null) {
                return;
            }
            this.type = businessPromotBannerMedia.type;
            this.resource_url = businessPromotBannerMedia.resource_url;
        }

        @Override // com.squareup.wire.Message.Builder
        public BusinessPromotBannerMedia build(boolean z) {
            return new BusinessPromotBannerMedia(this, z);
        }
    }

    public BusinessPromotBannerMedia(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.resource_url;
            if (str == null) {
                this.resource_url = "";
                return;
            } else {
                this.resource_url = str;
                return;
            }
        }
        this.type = builder.type;
        this.resource_url = builder.resource_url;
    }
}