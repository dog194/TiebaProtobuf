package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class TabInfo extends Message {
    public static final String DEFAULT_EXT = "";
    public static final String DEFAULT_TAB_NAME = "";
    public static final String DEFAULT_TAB_TYPE = "";

    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer count;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ext;

    @ProtoField(tag = 5)
    public final ThemeColorInfo tab_icon;

    @ProtoField(tag = 6)
    public final ThemeColorInfo tab_icon_selected;

    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long tab_id;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tab_name;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tab_type;
    public static final Long DEFAULT_TAB_ID = 0L;
    public static final Integer DEFAULT_COUNT = 0;

    public static final class Builder extends Message.Builder<TabInfo> {
        public Integer count;
        public String ext;
        public ThemeColorInfo tab_icon;
        public ThemeColorInfo tab_icon_selected;
        public Long tab_id;
        public String tab_name;
        public String tab_type;

        public Builder() {
        }

        public Builder(TabInfo tabInfo) {
            super(tabInfo);
            if (tabInfo == null) {
                return;
            }
            this.tab_type = tabInfo.tab_type;
            this.tab_id = tabInfo.tab_id;
            this.tab_name = tabInfo.tab_name;
            this.ext = tabInfo.ext;
            this.tab_icon = tabInfo.tab_icon;
            this.tab_icon_selected = tabInfo.tab_icon_selected;
            this.count = tabInfo.count;
        }

        @Override // com.squareup.wire.Message.Builder
        public TabInfo build(boolean z) {
            return new TabInfo(this, z);
        }
    }

    public TabInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.tab_type;
            if (str == null) {
                this.tab_type = "";
            } else {
                this.tab_type = str;
            }
            Long l = builder.tab_id;
            if (l == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = l;
            }
            String str2 = builder.tab_name;
            if (str2 == null) {
                this.tab_name = "";
            } else {
                this.tab_name = str2;
            }
            String str3 = builder.ext;
            if (str3 == null) {
                this.ext = "";
            } else {
                this.ext = str3;
            }
            this.tab_icon = builder.tab_icon;
            this.tab_icon_selected = builder.tab_icon_selected;
            Integer num = builder.count;
            if (num == null) {
                this.count = DEFAULT_COUNT;
                return;
            } else {
                this.count = num;
                return;
            }
        }
        this.tab_type = builder.tab_type;
        this.tab_id = builder.tab_id;
        this.tab_name = builder.tab_name;
        this.ext = builder.ext;
        this.tab_icon = builder.tab_icon;
        this.tab_icon_selected = builder.tab_icon_selected;
        this.count = builder.count;
    }
}