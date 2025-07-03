package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FormerNameInfo extends Message {
    public static final String DEFAULT_FORMER_NAME = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String former_name;

    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long source;

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long update_time;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    public static final Long DEFAULT_SOURCE = 0L;

    public static final class Builder extends Message.Builder<FormerNameInfo> {
        public String former_name;
        public Long source;
        public Long update_time;

        public Builder() {
        }

        public Builder(FormerNameInfo formerNameInfo) {
            super(formerNameInfo);
            if (formerNameInfo == null) {
                return;
            }
            this.former_name = formerNameInfo.former_name;
            this.update_time = formerNameInfo.update_time;
            this.source = formerNameInfo.source;
        }

        @Override // com.squareup.wire.Message.Builder
        public FormerNameInfo build(boolean z) {
            return new FormerNameInfo(this, z);
        }
    }

    public FormerNameInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.former_name;
            if (str == null) {
                this.former_name = "";
            } else {
                this.former_name = str;
            }
            Long l = builder.update_time;
            if (l == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = l;
            }
            Long l2 = builder.source;
            if (l2 == null) {
                this.source = DEFAULT_SOURCE;
                return;
            } else {
                this.source = l2;
                return;
            }
        }
        this.former_name = builder.former_name;
        this.update_time = builder.update_time;
        this.source = builder.source;
    }
}