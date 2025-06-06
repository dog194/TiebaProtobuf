package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThemeColorInfo;

/* loaded from: classes4.dex */
public final class VipBannerThemeColorInfo extends Message {

    @ProtoField(tag = 3)
    public final ThemeColorInfo button_theme;

    @ProtoField(tag = 2)
    public final ThemeColorInfo sub_title_theme;

    @ProtoField(tag = 1)
    public final ThemeColorInfo title_theme;

    public static final class Builder extends Message.Builder<VipBannerThemeColorInfo> {
        public ThemeColorInfo button_theme;
        public ThemeColorInfo sub_title_theme;
        public ThemeColorInfo title_theme;

        public Builder() {
        }

        public Builder(VipBannerThemeColorInfo vipBannerThemeColorInfo) {
            super(vipBannerThemeColorInfo);
            if (vipBannerThemeColorInfo == null) {
                return;
            }
            this.title_theme = vipBannerThemeColorInfo.title_theme;
            this.sub_title_theme = vipBannerThemeColorInfo.sub_title_theme;
            this.button_theme = vipBannerThemeColorInfo.button_theme;
        }

        @Override // com.squareup.wire.Message.Builder
        public VipBannerThemeColorInfo build(boolean z) {
            return new VipBannerThemeColorInfo(this, z);
        }
    }

    public VipBannerThemeColorInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.title_theme = builder.title_theme;
            this.sub_title_theme = builder.sub_title_theme;
            this.button_theme = builder.button_theme;
        } else {
            this.title_theme = builder.title_theme;
            this.sub_title_theme = builder.sub_title_theme;
            this.button_theme = builder.button_theme;
        }
    }
}