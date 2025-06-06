package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.IconUrlInfo;
import tbclient.ThemeElement;

/* loaded from: classes4.dex */
public final class SettingInfoIcon extends Message {
    public static final String DEFAULT_ID = "";
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_SCHEMA_TOGGLE = "";

    @ProtoField(tag = 4)
    public final IconUrlInfo icon;

    @ProtoField(tag = 5)
    public final IconUrlInfo icon_toggle;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String id;

    @ProtoField(tag = 2)
    public final ThemeElement name;

    @ProtoField(tag = 3)
    public final ThemeElement name_toggle;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String schema;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String schema_toggle;

    public static final class Builder extends Message.Builder<SettingInfoIcon> {
        public IconUrlInfo icon;
        public IconUrlInfo icon_toggle;
        public String id;
        public ThemeElement name;
        public ThemeElement name_toggle;
        public String schema;
        public String schema_toggle;

        public Builder() {
        }

        public Builder(SettingInfoIcon settingInfoIcon) {
            super(settingInfoIcon);
            if (settingInfoIcon == null) {
                return;
            }
            this.id = settingInfoIcon.id;
            this.name = settingInfoIcon.name;
            this.name_toggle = settingInfoIcon.name_toggle;
            this.icon = settingInfoIcon.icon;
            this.icon_toggle = settingInfoIcon.icon_toggle;
            this.schema = settingInfoIcon.schema;
            this.schema_toggle = settingInfoIcon.schema_toggle;
        }

        @Override // com.squareup.wire.Message.Builder
        public SettingInfoIcon build(boolean z) {
            return new SettingInfoIcon(this, z);
        }
    }

    public SettingInfoIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.id;
            if (str == null) {
                this.id = "";
            } else {
                this.id = str;
            }
            this.name = builder.name;
            this.name_toggle = builder.name_toggle;
            this.icon = builder.icon;
            this.icon_toggle = builder.icon_toggle;
            String str2 = builder.schema;
            if (str2 == null) {
                this.schema = "";
            } else {
                this.schema = str2;
            }
            String str3 = builder.schema_toggle;
            if (str3 == null) {
                this.schema_toggle = "";
                return;
            } else {
                this.schema_toggle = str3;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.name_toggle = builder.name_toggle;
        this.icon = builder.icon;
        this.icon_toggle = builder.icon_toggle;
        this.schema = builder.schema;
        this.schema_toggle = builder.schema_toggle;
    }
}