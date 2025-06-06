package tbclient.SidebarHome;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GameTabInfo extends Message {
    public static final Integer DEFAULT_ACTION_TYPE = 0;
    public static final String DEFAULT_ACTION_URI = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_TAB_NAME = "";

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer action_type;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String action_uri;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon_url;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tab_name;

    public static final class Builder extends Message.Builder<GameTabInfo> {
        public Integer action_type;
        public String action_uri;
        public String icon_url;
        public String tab_name;

        public Builder() {
        }

        public Builder(GameTabInfo gameTabInfo) {
            super(gameTabInfo);
            if (gameTabInfo == null) {
                return;
            }
            this.tab_name = gameTabInfo.tab_name;
            this.icon_url = gameTabInfo.icon_url;
            this.action_type = gameTabInfo.action_type;
            this.action_uri = gameTabInfo.action_uri;
        }

        @Override // com.squareup.wire.Message.Builder
        public GameTabInfo build(boolean z) {
            return new GameTabInfo(this, z);
        }
    }

    public GameTabInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.tab_name;
            if (str == null) {
                this.tab_name = "";
            } else {
                this.tab_name = str;
            }
            String str2 = builder.icon_url;
            if (str2 == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str2;
            }
            Integer num = builder.action_type;
            if (num == null) {
                this.action_type = DEFAULT_ACTION_TYPE;
            } else {
                this.action_type = num;
            }
            String str3 = builder.action_uri;
            if (str3 == null) {
                this.action_uri = "";
                return;
            } else {
                this.action_uri = str3;
                return;
            }
        }
        this.tab_name = builder.tab_name;
        this.icon_url = builder.icon_url;
        this.action_type = builder.action_type;
        this.action_uri = builder.action_uri;
    }
}