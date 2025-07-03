package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class CurrentNameInfo extends Message {

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long source;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long update_time;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    public static final Long DEFAULT_SOURCE = 0L;

    public static final class Builder extends Message.Builder<CurrentNameInfo> {
        public Long source;
        public Long update_time;

        public Builder() {
        }

        public Builder(CurrentNameInfo currentNameInfo) {
            super(currentNameInfo);
            if (currentNameInfo == null) {
                return;
            }
            this.update_time = currentNameInfo.update_time;
            this.source = currentNameInfo.source;
        }

        @Override // com.squareup.wire.Message.Builder
        public CurrentNameInfo build(boolean z) {
            return new CurrentNameInfo(this, z);
        }
    }

    public CurrentNameInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
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
        this.update_time = builder.update_time;
        this.source = builder.source;
    }
}