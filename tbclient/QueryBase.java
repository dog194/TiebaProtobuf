package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class QueryBase extends Message {
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_QUERY = "";

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_url;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String jump_url;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String query;

    public static final class Builder extends Message.Builder<QueryBase> {
        public String icon_url;
        public String jump_url;
        public String query;

        public Builder() {
        }

        public Builder(QueryBase queryBase) {
            super(queryBase);
            if (queryBase == null) {
                return;
            }
            this.query = queryBase.query;
            this.jump_url = queryBase.jump_url;
            this.icon_url = queryBase.icon_url;
        }

        @Override // com.squareup.wire.Message.Builder
        public QueryBase build(boolean z) {
            return new QueryBase(this, z);
        }
    }

    public QueryBase(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.query;
            if (str == null) {
                this.query = "";
            } else {
                this.query = str;
            }
            String str2 = builder.jump_url;
            if (str2 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str2;
            }
            String str3 = builder.icon_url;
            if (str3 == null) {
                this.icon_url = "";
                return;
            } else {
                this.icon_url = str3;
                return;
            }
        }
        this.query = builder.query;
        this.jump_url = builder.jump_url;
        this.icon_url = builder.icon_url;
    }
}