package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class Game extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_IOS_SCHEMA = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_SLOGAN = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String ios_schema;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer need_filter;

    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long red_point_version;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String schema;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String slogan;
    public static final Long DEFAULT_RED_POINT_VERSION = 0L;
    public static final Integer DEFAULT_NEED_FILTER = 0;

    public static final class Builder extends Message.Builder<Game> {
        public String icon;
        public String ios_schema;
        public String name;
        public Integer need_filter;
        public Long red_point_version;
        public String schema;
        public String slogan;

        public Builder() {
        }

        public Builder(Game game) {
            super(game);
            if (game == null) {
                return;
            }
            this.name = game.name;
            this.icon = game.icon;
            this.schema = game.schema;
            this.slogan = game.slogan;
            this.red_point_version = game.red_point_version;
            this.need_filter = game.need_filter;
            this.ios_schema = game.ios_schema;
        }

        @Override // com.squareup.wire.Message.Builder
        public Game build(boolean z) {
            return new Game(this, z);
        }
    }

    public Game(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
            } else {
                this.icon = str2;
            }
            String str3 = builder.schema;
            if (str3 == null) {
                this.schema = "";
            } else {
                this.schema = str3;
            }
            String str4 = builder.slogan;
            if (str4 == null) {
                this.slogan = "";
            } else {
                this.slogan = str4;
            }
            Long l = builder.red_point_version;
            if (l == null) {
                this.red_point_version = DEFAULT_RED_POINT_VERSION;
            } else {
                this.red_point_version = l;
            }
            Integer num = builder.need_filter;
            if (num == null) {
                this.need_filter = DEFAULT_NEED_FILTER;
            } else {
                this.need_filter = num;
            }
            String str5 = builder.ios_schema;
            if (str5 == null) {
                this.ios_schema = "";
                return;
            } else {
                this.ios_schema = str5;
                return;
            }
        }
        this.name = builder.name;
        this.icon = builder.icon;
        this.schema = builder.schema;
        this.slogan = builder.slogan;
        this.red_point_version = builder.red_point_version;
        this.need_filter = builder.need_filter;
        this.ios_schema = builder.ios_schema;
    }
}