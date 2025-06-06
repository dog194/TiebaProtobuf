package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class SugList extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String content;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String schema;

    public static final class Builder extends Message.Builder<SugList> {
        public String content;
        public String schema;

        public Builder() {
        }

        public Builder(SugList sugList) {
            super(sugList);
            if (sugList == null) {
                return;
            }
            this.content = sugList.content;
            this.schema = sugList.schema;
        }

        @Override // com.squareup.wire.Message.Builder
        public SugList build(boolean z) {
            return new SugList(this, z);
        }
    }

    public SugList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.content;
            if (str == null) {
                this.content = "";
            } else {
                this.content = str;
            }
            String str2 = builder.schema;
            if (str2 == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str2;
                return;
            }
        }
        this.content = builder.content;
        this.schema = builder.schema;
    }
}