package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class BannerImage extends Message {
    public static final String DEFAULT_AHEAD_URL = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_TITLE = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ahead_url;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;

    @ProtoField(tag = 4)
    public final ThemeColorInfo theme_color_info;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;

    public static final class Builder extends Message.Builder<BannerImage> {
        public String ahead_url;
        public String img_url;
        public ThemeColorInfo theme_color_info;
        public String title;

        public Builder() {
        }

        public Builder(BannerImage bannerImage) {
            super(bannerImage);
            if (bannerImage == null) {
                return;
            }
            this.img_url = bannerImage.img_url;
            this.ahead_url = bannerImage.ahead_url;
            this.title = bannerImage.title;
            this.theme_color_info = bannerImage.theme_color_info;
        }

        @Override // com.squareup.wire.Message.Builder
        public BannerImage build(boolean z) {
            return new BannerImage(this, z);
        }
    }

    public BannerImage(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
            } else {
                this.img_url = str;
            }
            String str2 = builder.ahead_url;
            if (str2 == null) {
                this.ahead_url = "";
            } else {
                this.ahead_url = str2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
            } else {
                this.title = str3;
            }
            this.theme_color_info = builder.theme_color_info;
            return;
        }
        this.img_url = builder.img_url;
        this.ahead_url = builder.ahead_url;
        this.title = builder.title;
        this.theme_color_info = builder.theme_color_info;
    }
}