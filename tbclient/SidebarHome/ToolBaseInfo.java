package tbclient.SidebarHome;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ToolBaseInfo extends Message {
    public static final String DEFAULT_ACTION_TYPE = "";
    public static final String DEFAULT_ACTION_URI = "";
    public static final String DEFAULT_CLASS_NAME = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_TIPS = "";
    public static final String DEFAULT_TITLE = "";

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String action_type;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String action_uri;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String class_name;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String tips;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    public static final class Builder extends Message.Builder<ToolBaseInfo> {
        public String action_type;
        public String action_uri;
        public String class_name;
        public String icon;
        public String tips;
        public String title;

        public Builder() {
        }

        public Builder(ToolBaseInfo toolBaseInfo) {
            super(toolBaseInfo);
            if (toolBaseInfo == null) {
                return;
            }
            this.title = toolBaseInfo.title;
            this.action_uri = toolBaseInfo.action_uri;
            this.action_type = toolBaseInfo.action_type;
            this.icon = toolBaseInfo.icon;
            this.class_name = toolBaseInfo.class_name;
            this.tips = toolBaseInfo.tips;
        }

        @Override // com.squareup.wire.Message.Builder
        public ToolBaseInfo build(boolean z) {
            return new ToolBaseInfo(this, z);
        }
    }

    public ToolBaseInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.action_uri;
            if (str2 == null) {
                this.action_uri = "";
            } else {
                this.action_uri = str2;
            }
            String str3 = builder.action_type;
            if (str3 == null) {
                this.action_type = "";
            } else {
                this.action_type = str3;
            }
            String str4 = builder.icon;
            if (str4 == null) {
                this.icon = "";
            } else {
                this.icon = str4;
            }
            String str5 = builder.class_name;
            if (str5 == null) {
                this.class_name = "";
            } else {
                this.class_name = str5;
            }
            String str6 = builder.tips;
            if (str6 == null) {
                this.tips = "";
                return;
            } else {
                this.tips = str6;
                return;
            }
        }
        this.title = builder.title;
        this.action_uri = builder.action_uri;
        this.action_type = builder.action_type;
        this.icon = builder.icon;
        this.class_name = builder.class_name;
        this.tips = builder.tips;
    }
}